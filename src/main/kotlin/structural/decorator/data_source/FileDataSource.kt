package structural.decorator.data_source

import java.io.File
import java.io.FileOutputStream
import java.io.FileReader

class FileDataSource(private val name: String) : DataSource {

    override fun writeData(data: String) {
        FileOutputStream(File(name)).use { fos -> fos.write(data.toByteArray(), 0, data.length) }
    }

    override fun readData(): String {
        val buffer: CharArray
        val file = File(name)
        FileReader(file).use { reader ->
            buffer = CharArray(file.length().toInt())
            reader.read(buffer)
        }
        return String(buffer)
    }
}