package creational.abstract_factory.factory

import creational.abstract_factory.button.Button
import creational.abstract_factory.button.MacOSButton
import creational.abstract_factory.checkbox.Checkbox
import creational.abstract_factory.checkbox.MacOSCheckbox

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
class MacOSFactory : GUIFactory {
    override fun createButton(): Button = MacOSButton()
    override fun createCheckbox(): Checkbox = MacOSCheckbox()
}