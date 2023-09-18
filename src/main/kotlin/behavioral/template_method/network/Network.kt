package behavioral.template_method.network

/**
 * Базовый класс социальной сети.
 */
abstract class Network(
    open val userName: String,
    open val password: String,
) {

    fun post(message: String): Boolean {
        if (login(userName, password).not()) return false
        return sendData(message.toByteArray())
    }

    abstract fun login(userName: String, password: String): Boolean
    abstract fun sendData(data: ByteArray): Boolean
}