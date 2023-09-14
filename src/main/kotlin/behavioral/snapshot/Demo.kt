package behavioral.snapshot

import behavioral.snapshot.command.WorkOneCommand
import behavioral.snapshot.command.WorkTwoCommand
import behavioral.snapshot.originator.Originator

/**
 * Snapshot (Memento, Снимок, Хранитель) — это поведенческий паттерн проектирования, который позволяет сохранять
 * и восстанавливать прошлые состояния объектов, не раскрывая подробностей их реализации.
 */
object Demo {

    fun main() {
        val editor = Originator()

        val workOneCommand = WorkOneCommand(editor)
        val workTwoCommand = WorkTwoCommand(editor)

        workOneCommand.execute()
        workTwoCommand.execute()

        workTwoCommand.undo()
    }
}