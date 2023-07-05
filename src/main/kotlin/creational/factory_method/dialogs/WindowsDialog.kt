package creational.factory_method.dialogs

import creational.factory_method.buttons.Button
import creational.factory_method.buttons.WindowsButton

class WindowsDialog : Dialog() {
    override fun createButton(): Button = WindowsButton()
}