package structural.composit

import structural.composit.shape.Circle
import structural.composit.shape.CompoundShape
import structural.composit.shape.Dot
import structural.composit.shape.Rectangle

/**
 * Composite (Компоновщик / Дерево) — это структурный паттерн проектирования, который позволяет сгруппировать
 * множество объектов в древовидную структуру, а затем работать с ней так, как будто это единичный объект.
 *
 * View в Android - самая прямая реализоция данного паттерна.
 */
object Demo {

    fun main() {
        val editor = ImageEditor()
        editor.loadShapes(
            Circle(10, 10, 10),
            CompoundShape(
                Circle(110, 110, 50),
                Dot(160, 160)
            ),
            CompoundShape(
                Rectangle(250, 250, 100, 100),
                Dot(240, 240),
                Dot(240, 360),
                Dot(360, 360),
                Dot(360, 240)
            )
        )
    }
}