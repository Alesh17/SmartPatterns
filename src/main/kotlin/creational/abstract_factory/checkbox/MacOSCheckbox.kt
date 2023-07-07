package creational.abstract_factory.checkbox

/**
 * Вариация чекбокса под MacOS.
 */
class MacOSCheckbox : Checkbox {
    override fun paint() {
        println("You have created MacOSCheckbox.")
    }
}