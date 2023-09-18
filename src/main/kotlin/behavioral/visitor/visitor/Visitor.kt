package behavioral.visitor.visitor

import behavioral.visitor.shape.Circle
import behavioral.visitor.shape.Dot
import behavioral.visitor.shape.Rectangle

interface Visitor {
    fun visit(dot: Dot): String
    fun visit(circle: Circle): String
    fun visit(rectangle: Rectangle): String
}