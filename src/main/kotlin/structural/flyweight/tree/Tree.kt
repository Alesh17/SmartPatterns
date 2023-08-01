package structural.flyweight.tree

import java.awt.Graphics

class Tree(
    private val x: Int,
    private val y: Int,
    private val painter: TreePainter, /* тяжелый объект */
) {
    fun draw(graphics: Graphics) = painter.draw(graphics, x, y)
}