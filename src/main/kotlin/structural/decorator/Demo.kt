package structural.decorator

import structural.decorator.data_source.FileDataSource
import structural.decorator.decorator.CompressionDecorator
import structural.decorator.decorator.EncryptionDecorator

/**
 * Decorator / Wrapper (Декоратор) — это структурный паттерн проектирования, который позволяет динамически добавлять
 * объектам новую функциональность, оборачивая их в полезные "обёртки".
 *
 * Главная фишка паттерна: для пользователя нет никакой разницы, с каким объектом работать — чистым или обёрнутым.
 * Можно использовать несколько разных обёрток одновременно — результат будет иметь объединённое поведение всех обёрток сразу.
 */
object Demo {

    fun main() {
        val data = "Really big secret"
        val source = CompressionDecorator(EncryptionDecorator(FileDataSource("test.txt")))
        source.writeData(data) // output: encrypted and compressed data
        source.readData() // output: plain data
    }
}