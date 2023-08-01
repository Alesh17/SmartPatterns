package structural.decorator.decorator

import structural.decorator.data_source.DataSource

/**
 * Обязательная "пустая" обёртка.
 *
 * Требуется, так как оборачиваемый (главный) класс обычно имеет в конструкторе множество параметров,
 * что неудобно для последующих обёрток.
 */
open class DataSourceDecorator(private val wrappee: DataSource) : DataSource {
    override fun writeData(data: String) = wrappee.writeData(data)
    override fun readData(): String = wrappee.readData()
}
