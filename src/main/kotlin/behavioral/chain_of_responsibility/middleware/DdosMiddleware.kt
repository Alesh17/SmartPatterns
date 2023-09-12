package behavioral.chain_of_responsibility.middleware

/**
 * Конкретный элемент цепи обрабатывает запрос по-своему.
 */
class DdosMiddleware : Middleware() {

    override fun check(email: String, password: String): Boolean {
        /* Своя проверка на DDOS. */
        /* ... */

        /* Передаём управление далее. */
        return checkNext(email, password)
    }
}