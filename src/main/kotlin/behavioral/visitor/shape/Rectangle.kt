package behavioral.visitor.shape

import behavioral.visitor.visitor.Visitor

class Rectangle(
    val id: Int,
    val x: Int,
    val y: Int,
    val width: Int,
    val height: Int,
) : Shape {

    override fun move(x: Int, y: Int) {
        /* move */
    }

    override fun draw() {
        /* draw */
    }

    override fun accept(visitor: Visitor): String = visitor.visit(this)
}