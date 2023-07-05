package creational.factory_method

import creational.factory_method.dialogs.Dialog
import creational.factory_method.dialogs.HtmlDialog
import creational.factory_method.dialogs.WindowsDialog
import kotlin.properties.Delegates

/**
 * Фабричный метод — это порождающий паттерн проектирования, который определяет общий интерфейс для создания объектов в суперклассе,
 * позволяя подклассам изменять тип создаваемых объектов.
 *
 * В нашем случае, фабричным методом будет [Dialog.createButton].
 * Подклассы переопределяют его и предлагают другой объект, на основе которого строится весь диалог в методе [Dialog.showButtonDialog].
 */
object FactoryMethodSample {

    private var dialog: Dialog by Delegates.notNull()

    init {
        configure()
        runBusinessLogic()
    }

    /** Приложение создаёт определённую фабрику в зависимости от конфигурации или окружения. */
    private fun configure() {
        dialog = if (System.getProperty("os.name") == "Windows 10") {
            WindowsDialog()
        } else {
            HtmlDialog()
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    private fun runBusinessLogic() {
        dialog.showButtonDialog()
    }
}