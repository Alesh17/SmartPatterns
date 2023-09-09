package structural.composite

import structural.composite.shape.CompoundShape
import structural.composite.shape.Shape
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics
import javax.swing.BorderFactory
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants

class ImageEditor {

    private val canvas: EditorCanvas = EditorCanvas()
    private val allShapes = CompoundShape()

    fun loadShapes(vararg shapes: Shape) {
        allShapes.clear()
        allShapes.add(*shapes)
        canvas.refresh()
    }

    private inner class EditorCanvas : Canvas() {

        private val padding = 10

        var frame: JFrame = JFrame()

        init {
            createFrame()
            refresh()
        }

        fun createFrame() {
            frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
            frame.setLocationRelativeTo(null)
            val contentPanel = JPanel()
            val padding = BorderFactory.createEmptyBorder(padding, padding, padding, padding)
            contentPanel.border = padding
            frame.contentPane = contentPanel
            frame.add(this)
            frame.isVisible = true
            frame.contentPane.background = Color.LIGHT_GRAY
        }

        fun refresh() {
            setSize(width, height)
            frame.pack()
        }

        override fun getWidth(): Int {
            return allShapes.x + allShapes.width + padding
        }

        override fun getHeight(): Int {
            return allShapes.y + allShapes.height + padding
        }

        override fun paint(graphics: Graphics) {
            allShapes.paint(graphics)
        }
    }
}