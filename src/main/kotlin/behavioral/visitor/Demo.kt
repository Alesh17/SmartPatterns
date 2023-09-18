package behavioral.visitor

import behavioral.visitor.shape.Circle
import behavioral.visitor.shape.Dot
import behavioral.visitor.shape.Rectangle
import behavioral.visitor.visitor.XmlExportVisitor

/**
 * Visitor (Посетитель) — это поведенческий паттерн проектирования, который позволяет добавить новую операцию для
 * целой иерархии классов, не изменяя код этих классов.
 *
 * Данный паттерн нельзя заменить простой перегрузкой методов из-за особенностей работы компилятора с
 * одним семейством классов в перегруженных методах.
 *
 * Данный паттерн не оправдан, если иерархия элементов часто меняется.
 */
object Demo {

    fun main() {

        val dot = Dot(1, 10, 55)
        val circle = Circle(2, 23, 15, 10)
        val rectangle = Rectangle(3, 10, 17, 20, 30)

        val visitor = XmlExportVisitor()

        visitor.export(dot, circle, rectangle)
    }
}