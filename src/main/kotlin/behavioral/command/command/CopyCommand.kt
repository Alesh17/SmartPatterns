package behavioral.command.command

import behavioral.command.editor.Editor

class CopyCommand(private val editor: Editor) : Command(editor) {

    override fun execute(): Boolean {
        editor.clipboard = editor.text
        return false
    }
}