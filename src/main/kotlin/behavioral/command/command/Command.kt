package behavioral.command.command

import behavioral.command.editor.Editor

abstract class Command(private val editor: Editor) {

    private var backup: String? = null

    fun backup() {
        backup = editor.text
    }

    fun undo() {
        editor.text = backup ?: ""
    }

    abstract fun execute(): Boolean
}