package creational.abstract_factory

import creational.abstract_factory.button.Button
import creational.abstract_factory.checkbox.Checkbox
import creational.abstract_factory.factory.GUIFactory

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
class Application(factory: GUIFactory) {

    private val button: Button?
    private val checkbox: Checkbox?

    init {
        button = factory.createButton()
        checkbox = factory.createCheckbox()
    }

    fun paint() {
        button!!.paint()
        checkbox!!.paint()
    }
}