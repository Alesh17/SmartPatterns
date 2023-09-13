package behavioral.command

import behavioral.command.editor.Editor

/**
 * Command (Action, Команда, Действие, Транзакция) — это поведенческий паттерн проектирования, который превращает
 * запросы или простые операции в отдельные объекты. Это позволяет откладывать выполнение команд,
 * выстраивать их в очереди, а также хранить историю и делать отмену.
 *
 * Базовый пример из Java мира: java.lang.Runnable
 */
object Demo {

    fun main() {
        val editor = Editor()
        editor.ctrlC()
        editor.ctrlV()
        editor.ctrlX()
        editor.ctrlZ()
    }
}