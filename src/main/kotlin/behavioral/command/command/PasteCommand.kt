package behavioral.command.command

import behavioral.command.editor.Editor

class PasteCommand(private val editor: Editor) : Command(editor) {

    override fun execute(): Boolean {
        backup()
        editor.text = editor.clipboard ?: ""
        return true
    }
}