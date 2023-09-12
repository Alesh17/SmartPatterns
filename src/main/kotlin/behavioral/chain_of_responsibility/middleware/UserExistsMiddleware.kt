package behavioral.chain_of_responsibility.middleware

/**
 * Конкретный элемент цепи обрабатывает запрос по-своему.
 */
class UserExistsMiddleware : Middleware() {

    override fun check(email: String, password: String): Boolean {
        /* Своя проверка на email и пароль. */
        /* ... */

        /* Передаём управление далее. */
        return checkNext(email, password)
    }
}