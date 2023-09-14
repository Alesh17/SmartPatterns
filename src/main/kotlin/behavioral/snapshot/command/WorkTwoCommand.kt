package behavioral.snapshot.command

import behavioral.snapshot.originator.Originator

class WorkTwoCommand(private val originator: Originator) : Command(originator) {

    override fun execute() {
        backup()
        originator.work(2)
    }
}