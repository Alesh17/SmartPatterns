package behavioral.visitor.shape

import behavioral.visitor.visitor.Visitor

class Circle(
    override val id: Int,
    override val x: Int,
    override val y: Int,
    val radius: Int,
) : Dot(id, x, y) {

    override fun accept(visitor: Visitor): String = visitor.visit(this)
}