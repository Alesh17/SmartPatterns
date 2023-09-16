package behavioral.strategy

import behavioral.strategy.strategy.CardStrategy
import behavioral.strategy.strategy.CryptoStrategy
import kotlin.random.Random

/**
 * Strategy (Стратегия) — это поведенческий паттерн проектирования, который выносит набор алгоритмов в собственные классы
 * и делает их взаимозаменимыми. Другие объекты содержат ссылку на объект-стратегию и делегируют ей работу.
 * Программа может подменить этот объект другим, если требуется иной способ решения задачи.
 *
 * Но: клиент должен знать, в чём состоит разница между стратегиями, чтобы выбрать подходящую.
 */
object Demo {

    fun main() {

        val payCard = CardStrategy()
        val payCrypto = CryptoStrategy()
        val payMethod = if (Random.nextBoolean()) payCard else payCrypto

        val success = payMethod.pay(1000)

        if (success) println("SUCCESS") else println("FAIL")
    }
}