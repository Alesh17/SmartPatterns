package structural.adapter

/**
 * КруглоеОтверстие совместимо с КруглымиКолышками.
 */
class RoundHole(private val radius: Double) {
    fun isFits(peg: RoundPeg): Boolean = radius >= peg.radius
}