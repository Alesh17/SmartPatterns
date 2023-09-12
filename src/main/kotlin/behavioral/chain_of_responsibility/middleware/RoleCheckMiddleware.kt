package behavioral.chain_of_responsibility.middleware

/**
 * Конкретный элемент цепи обрабатывает запрос по-своему.
 */
class RoleCheckMiddleware : Middleware() {

    override fun check(email: String, password: String): Boolean {
        /* Своя проверка на роль пользователя. */
        /* ... */

        /* Передаём управление далее. */
        return checkNext(email, password)
    }
}