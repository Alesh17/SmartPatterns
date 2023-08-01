package structural.composit.shape

import java.awt.Graphics

class Rectangle(
    x: Int,
    y: Int,
    override var width: Int,
    override var height: Int,
) : BaseShape(x, y) {

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        graphics.drawRect(x, y, width - 1, height - 1)
    }
}