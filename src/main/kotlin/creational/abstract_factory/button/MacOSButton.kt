package creational.abstract_factory.button

/**
 * Это вариант кнопки под MacOS.
 */
class MacOSButton : Button {
    override fun paint() {
        println("You have created MacOSButton.")
    }
}