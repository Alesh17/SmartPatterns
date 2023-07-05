package creational.factory_method.dialogs

import creational.factory_method.buttons.Button
import creational.factory_method.buttons.HtmlButton

class HtmlDialog : Dialog() {
    override fun createButton(): Button = HtmlButton()
}