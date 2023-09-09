package structural.composite.shape

import java.awt.Graphics

class Dot(
    x: Int,
    y: Int,
) : BaseShape(x, y) {

    override val width = 3
    override val height = 3

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        graphics.fillRect(x - 1, y - 1, height, height)
    }
}