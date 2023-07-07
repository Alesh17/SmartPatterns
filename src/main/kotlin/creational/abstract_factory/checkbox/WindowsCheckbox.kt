package creational.abstract_factory.checkbox

/**
 * Вариация чекбокса под Windows.
 */
class WindowsCheckbox : Checkbox {
    override fun paint() {
        println("You have created WindowsCheckbox.")
    }
}
