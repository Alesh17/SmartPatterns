package behavioral.snapshot.originator

import kotlin.random.Random

/**
 * Originator.
 *
 * Originator (создатель состояния) должен иметь специальный метод, который
 * сохраняет состояние создателя в новом объекте-снимке. Может также иметь метод восстановления своего состояния.
 */
class Originator {

    /**
     * Снимок.
     *
     * В данной реализации снимок — это внутренний класс по отношению к классу создателя.
     * Именно поэтому он имеет полный доступ к полям и методам создателя, даже приватным.
     * С другой стороны, опекун не имеет доступа ни к состоянию, ни к методам снимка
     * и может всего лишь хранить ссылки на эти объекты.
     */
    inner class Snapshot {

        private val snapshot = state

        fun getState(): Int = snapshot
    }

    private var state: Int = 0

    fun work(work: Int) {
        state = Random.nextInt(work)
    }

    fun backup(): Snapshot {
        return Snapshot()
    }

    fun restore(snapshot: Snapshot) {
        state = snapshot.getState()
    }
}

