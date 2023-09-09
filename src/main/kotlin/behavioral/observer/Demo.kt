package behavioral.observer

import behavioral.observer.listener.UserListener
import behavioral.observer.shop.Shop

/**
 * Observer (Наблюдатель) — это поведенческий паттерн, который позволяет объектам оповещать другие объекты
 * об изменениях своего состояния. При этом наблюдатели могут свободно подписываться и отписываться от этих оповещений.
 */
object Demo {
    fun main() {

        /* Издатель или магазин. В общем, кто-то, кому есть о чём рассказать. */
        val shop = Shop()

        /* Клиент. */
        val user = UserListener()

        /* Клиенты, чтобы получать события от магазина, подписываются на них. */
        shop.events.subscribe(user)

        /* Магазин выпускает новые товары, под капотом высылая подписчикам уведомления. */
        shop.presentPhone()
        shop.presentComputer()
    }
}