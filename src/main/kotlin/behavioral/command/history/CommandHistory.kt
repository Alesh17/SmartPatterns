package behavioral.command.history

import behavioral.command.command.Command
import java.util.*

class CommandHistory {

    private val history = ArrayDeque<Command>()

    fun push(command: Command): Unit = history.push(command)

    fun pop(): Command = history.pop()
}