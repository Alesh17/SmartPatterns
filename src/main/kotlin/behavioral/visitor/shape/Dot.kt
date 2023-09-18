package behavioral.visitor.shape

import behavioral.visitor.visitor.Visitor

open class Dot(
    open val id: Int,
    open val x: Int,
    open val y: Int,
) : Shape {

    override fun move(x: Int, y: Int) {
        /* move */
    }

    override fun draw() {
        /* draw */
    }

    override fun accept(visitor: Visitor): String = visitor.visit(this)
}