package behavioral.command.editor

import behavioral.command.command.Command
import behavioral.command.command.CopyCommand
import behavioral.command.command.CutCommand
import behavioral.command.command.PasteCommand
import behavioral.command.history.CommandHistory

class Editor {

    var text: String = "Hello world"
    var clipboard: String? = null

    private val history = CommandHistory()

    fun ctrlC() = executeCommand(CopyCommand(this))
    fun ctrlX() = executeCommand(CutCommand(this))
    fun ctrlV() = executeCommand(PasteCommand(this))
    fun ctrlZ() = undo()

    private fun executeCommand(command: Command) {
        val success = command.execute()
        if (success) history.push(command)
    }

    private fun undo() {
        history.pop().undo()
    }
}