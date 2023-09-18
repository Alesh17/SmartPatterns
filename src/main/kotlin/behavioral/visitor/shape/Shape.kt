package behavioral.visitor.shape

import behavioral.visitor.visitor.Visitor

interface Shape {
    fun move(x: Int, y: Int)
    fun draw()
    fun accept(visitor: Visitor): String
}