package creational.abstract_factory.factory

import creational.abstract_factory.button.Button
import creational.abstract_factory.button.WindowsButton
import creational.abstract_factory.checkbox.Checkbox
import creational.abstract_factory.checkbox.WindowsCheckbox

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
class WindowsFactory : GUIFactory {
    override fun createButton(): Button = WindowsButton()
    override fun createCheckbox(): Checkbox = WindowsCheckbox()
}