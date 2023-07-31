package structural.adapter

import kotlin.math.pow

/**
 * КвадратныеКолышки несовместимы с КруглымиОтверстиями (они остались в проекте
 * после бывших разработчиков). Но мы должны как-то интегрировать их в нашу
 * систему.
 */
class SquarePeg(val width: Double) {
    fun getSquare() = width.pow(2.0)
}
