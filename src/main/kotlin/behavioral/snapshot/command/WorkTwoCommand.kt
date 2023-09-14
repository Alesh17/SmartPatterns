package behavioral.snapshot.command

import behavioral.snapshot.editor.Originator

class WorkTwoCommand(private val originator: Originator) : Command(originator) {

    override fun execute() {
        backup()
        originator.work(2)
    }
}