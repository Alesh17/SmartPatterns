package structural.adapter

import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Адаптер позволяет использовать КвадратныеКолышки и КруглыеОтверстия вместе.
 */
class SquarePegAdapter(private val peg: SquarePeg) : RoundPeg() {
    override var radius: Double
        get() {
            /* Рассчитываем минимальный радиус, в который пролезет этот колышек */
            return sqrt((peg.width / 2).pow(2.0) * 2)
        }
        set(radius) {
            super.radius = radius
        }
}