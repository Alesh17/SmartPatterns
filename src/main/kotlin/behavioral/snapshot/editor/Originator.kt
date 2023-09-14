package behavioral.snapshot.editor

import behavioral.snapshot.snapshot.EditorSnapshot
import behavioral.snapshot.snapshot.Snapshot
import kotlin.random.Random

/**
 * Originator.
 *
 * Originator (создатель состояния) должен иметь специальный метод, который
 * сохраняет состояние создателя в новом объекте-снимке. Может также иметь метод восстановления своего состояния.
 */
class Originator {

    private var state: Int = 0

    fun work(work: Int) {
        state = Random.nextInt(work)
    }

    fun backup(): Snapshot {
        return EditorSnapshot(state)
    }

    fun restore(snapshot: Snapshot) {
        state = snapshot.getState()
    }
}

