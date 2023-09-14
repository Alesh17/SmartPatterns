package behavioral.snapshot.command

import behavioral.snapshot.editor.Originator
import behavioral.snapshot.snapshot.Snapshot

/**
 * Caretaker.
 *
 * Caretaker (опекуном) может выступать класс команд.
 * В этом случае команда сохраняет снимок состояния объекта-получателя, перед тем как передать ему своё действие.
 * В случае отмены команда вернёт объект в прежнее состояние.
 */
abstract class Command(private val originator: Originator) {

    private var snapshot: Snapshot? = null

    protected fun backup() {
        snapshot = originator.backup()
    }

    fun undo() {
        snapshot?.let { originator.restore(it) }
    }

    abstract fun execute()
}