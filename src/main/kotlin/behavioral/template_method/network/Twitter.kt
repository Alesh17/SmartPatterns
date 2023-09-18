package behavioral.template_method.network

class Twitter(
    override val userName: String,
    override val password: String,
) : Network(userName, password) {

    override fun login(userName: String, password: String): Boolean {
        /* Вход в аккаунт Twitter */
        return true
    }

    override fun sendData(data: ByteArray): Boolean {
        /* Отправка данных в Twitter */
        return true
    }
}
