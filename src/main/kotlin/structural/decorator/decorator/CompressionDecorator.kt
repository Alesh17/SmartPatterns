package structural.decorator.decorator

import structural.decorator.data_source.DataSource

class CompressionDecorator(source: DataSource) : DataSourceDecorator(source) {

    override fun writeData(data: String) {
        val compressed = compress(data)
        super.writeData(compressed)
    }

    override fun readData(): String {
        val compressed = super.readData()
        return decompress(compressed)
    }

    /** Compressing... */
    private fun compress(data: String): String = data

    /** Decompressing... */
    private fun decompress(data: String): String = data
}