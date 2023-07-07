package creational.abstract_factory.button

/**
 * Это вариант кнопки под Windows.
 */
class WindowsButton : Button {
    override fun paint() {
        println("You have created WindowsButton.")
    }
}