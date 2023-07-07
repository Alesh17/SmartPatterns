package creational.abstract_factory

import creational.abstract_factory.factory.MacOSFactory
import creational.abstract_factory.factory.WindowsFactory
import java.util.*

/**
 * Абстрактная фабрика — это порождающий паттерн проектирования, который позволяет создавать семейства связанных объектов,
 * не привязываясь к конкретным классам создаваемых объектов.
 */
object AbstractFactorySample {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private fun configureApplication(): Application {
        val osName = System.getProperty("os.name").lowercase(Locale.getDefault())
        val factory = if (osName.contains("mac")) {
            MacOSFactory()
        } else {
            WindowsFactory()
        }
        return Application(factory)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val app = configureApplication()
        app.paint()
    }
}