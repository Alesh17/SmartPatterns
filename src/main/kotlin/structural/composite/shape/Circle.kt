package structural.composite.shape

import java.awt.Graphics

class Circle(
    x: Int,
    y: Int,
    radius: Int,
) : BaseShape(x, y) {

    override val width = radius * 2
    override val height = radius * 2

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        graphics.drawOval(x, y, width - 1, height - 1)
    }
}
