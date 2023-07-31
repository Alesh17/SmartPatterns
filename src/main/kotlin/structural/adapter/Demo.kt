package structural.adapter

/**
 * Адаптер — это структурный паттерн проектирования, который позволяет объектам
 * с несовместимыми интерфейсами работать вместе.
 *
 * Адаптер выступает прослойкой между двумя объектами, превращая вызовы одного в вызовы понятные другому.
 */
object Demo {

    fun main() {
        /* Круглое к круглому — всё работает */
        val hole = RoundHole(5.0)
        val roundPeg = RoundPeg().apply { radius = 5.0 }
        if (hole.isFits(roundPeg)) println("Round peg r5 fits round hole r5.")

        val squarePeg = SquarePeg(2.0)
        // hole.fits(smallSqPeg); // Не скомпилируется.

        /* Адаптер решит проблему */
        val squarePegAdapter = SquarePegAdapter(squarePeg)
        if (hole.isFits(squarePegAdapter)) println("Square peg w2 fits round hole r5.")
    }
}