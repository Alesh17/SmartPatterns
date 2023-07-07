package creational.abstract_factory.factory

import creational.abstract_factory.button.Button
import creational.abstract_factory.checkbox.Checkbox

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}