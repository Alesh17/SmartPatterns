package behavioral.chain_of_responsibility

import behavioral.chain_of_responsibility.middleware.DdosMiddleware
import behavioral.chain_of_responsibility.middleware.Middleware
import behavioral.chain_of_responsibility.middleware.RoleCheckMiddleware
import behavioral.chain_of_responsibility.middleware.UserExistsMiddleware

/**
 * Chain of Responsibility (CoR, Chain of Command, Цепочка обязанностей) — это поведенческий паттерн проектирования,
 * позволяющий передавать запрос по цепочке потенциальных обработчиков, пока один из них не обработает запрос.
 *
 * Избавляет от жёсткой привязки отправителя запроса к его получателю, позволяя выстраивать цепь из различных
 * обработчиков динамически.
 *
 * При этом, даже выстроив цепочку обработчиков, конкретный обработчик может пропустить следующие за ним обработчики
 * впрерёд, а после выполнить свой код. Это даёт еще один уровень гибкости по сравнению с проверками в цикле.
 */
object Demo {

    private val server = Server().apply {
        val middleware = Middleware.link(
            DdosMiddleware(),
            UserExistsMiddleware(),
            RoleCheckMiddleware()
        )
        setMiddleware(middleware)
    }

    fun main() {
        val email = "email@examle.com"
        val password = "#%gh$^d^%"
        server.login(email, password)
    }
}