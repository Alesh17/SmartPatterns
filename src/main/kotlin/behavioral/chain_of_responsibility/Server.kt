package behavioral.chain_of_responsibility

import behavioral.chain_of_responsibility.middleware.Middleware
import kotlin.properties.Delegates.notNull

/**
 * Класс сервера.
 */
class Server {

    private var middleware: Middleware by notNull()

    /**
     * Клиент подаёт готовую цепочку в сервер.
     */
    fun setMiddleware(mw: Middleware) {
        middleware = mw
    }

    /**
     * Сервер получает email и пароль от клиента и запускает проверку
     * авторизации у цепочки.
     */
    fun login(email: String, password: String) {
        middleware.check(email, password)
    }
}