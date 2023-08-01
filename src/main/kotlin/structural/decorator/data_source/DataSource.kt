package structural.decorator.data_source

interface DataSource {
    fun writeData(data: String)
    fun readData(): String
}