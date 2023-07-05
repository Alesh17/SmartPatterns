package creational.factory_method.dialogs

import creational.factory_method.buttons.Button

/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
abstract class Dialog {

    fun showButtonDialog() = createButton().show()

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов (кнопок), разные для каждой фабрики.
     */
    abstract fun createButton(): Button
}