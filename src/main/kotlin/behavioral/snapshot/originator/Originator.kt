package behavioral.snapshot.originator

import kotlin.random.Random

/**
 * Originator.
 *
 * Originator (создатель состояния) должен иметь специальный метод, который
 * сохраняет состояние создателя в новом объекте-снимке.
 */
class Originator {

    /**
     * Снимок.
     *
     * В данной реализации снимок — это внутренний класс по отношению к классу создателя.
     * Именно поэтому он имеет полный доступ к полям и методам создателя, даже приватным.
     * С другой стороны, опекун не имеет доступа к состоянию снимка (и, соотвественно, состоянию создателя).
     */
    inner class Snapshot(
        private val text: Int,
        private val cursor: Int,
        private val type: Int,
        private val style: Int,
    ) {
        fun restore() {
            this@Originator.text = text
            this@Originator.cursor = cursor
            this@Originator.type = type
            this@Originator.style = style
        }
    }

    private var text: Int = 0
    private var cursor: Int = 0
    private var type: Int = 0
    private var style: Int = 0

    fun work(work: Int) {
        text = Random.nextInt(work)
        cursor = Random.nextInt(work)
        type = Random.nextInt(work)
        style = Random.nextInt(work)
    }

    fun backup(): Snapshot {
        return Snapshot(text, cursor, type, style)
    }
}

