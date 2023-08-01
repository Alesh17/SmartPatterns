package structural.decorator.decorator

import structural.decorator.data_source.DataSource

class EncryptionDecorator(source: DataSource) : DataSourceDecorator(source) {

    override fun writeData(data: String) {
        val encoded = encode(data)
        super.writeData(encoded)
    }

    override fun readData(): String {
        val encoded = super.readData()
        return decode(encoded)
    }

    /** Encoding... */
    private fun encode(data: String): String = data

    /** Decoding... */
    private fun decode(data: String): String = data
}