package structural.composit.shape

import java.awt.Graphics

abstract class BaseShape(
    override var x: Int,
    override var y: Int,
) : Shape {

    override fun move(x: Int, y: Int) {
        this.x += x
        this.y += y
    }

    override fun isInsideBounds(x: Int, y: Int): Boolean {
        return x > x && x < x + width && y > y && y < y + height
    }

    override fun paint(graphics: Graphics) {
        /* Подготовливаем объект [graphics] для наследников. */
    }
}