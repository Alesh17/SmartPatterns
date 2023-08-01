package structural.flyweight

import structural.flyweight.forest.Forest
import java.awt.Color.GREEN
import java.awt.Color.ORANGE
import kotlin.math.floor

/**
 * Flyweight (Легковес) — это структурный паттерн проектирования, который позволяет вместить бóльшее количество объектов
 * в отведённую оперативную память. Легковес экономит память, разделяя 1 (или несколько) тяжелых объектов объектов между собой,
 * вместо хранения одинаковых данных в каждом объекте.
 */
object Demo {

    private var CANVAS_SIZE = 500
    private var TREES_TO_DRAW = 1000000
    private var TREE_TYPES = 2

    fun main() {
        val forest = Forest().apply { setSize(CANVAS_SIZE, CANVAS_SIZE) }
        var i = 0
        while (i < floor((TREES_TO_DRAW / TREE_TYPES).toDouble())) {
            forest.plant(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", GREEN)
            forest.plant(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", ORANGE)
            i++
        }
    }

    private fun random(min: Int, max: Int): Int {
        return min + (Math.random() * ((max - min) + 1)).toInt()
    }
}
