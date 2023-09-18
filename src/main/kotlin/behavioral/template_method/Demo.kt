package behavioral.template_method

import behavioral.template_method.network.Facebook
import behavioral.template_method.network.Twitter
import kotlin.random.Random

/**
 * Template Method (Шаблонный метод) — это поведенческий паттерн проектирования, задающий скелет алгоритма в суперклассе
 * и заставляющий подклассы реализовать конкретные шаги этого алгоритма, не меняя его общей структуры.
 */
object Demo {

    fun main() {

        val userName = "user"
        val password = "password"
        val message = "message"
        val network = if (Random.nextBoolean()) Facebook(userName, password) else Twitter(userName, password)

        network.post(message)
    }
}