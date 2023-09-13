package behavioral.command.command

import behavioral.command.editor.Editor

class CutCommand(private val editor: Editor) : Command(editor) {

    override fun execute(): Boolean {
        backup()
        editor.clipboard = editor.text
        editor.text = ""
        return true
    }
}