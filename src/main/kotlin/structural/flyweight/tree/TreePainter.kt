package structural.flyweight.tree

import java.awt.Color
import java.awt.Graphics

/** Тяжелый объект, который не должен быть изменяемым.  */
class TreePainter(private val color: Color) {
    fun draw(graphics: Graphics, x: Int, y: Int) {
        graphics.color = Color.BLACK
        graphics.fillRect(x - 1, y, 3, 5)
        graphics.color = color
        graphics.fillOval(x - 5, y - 10, 10, 10)
    }
}