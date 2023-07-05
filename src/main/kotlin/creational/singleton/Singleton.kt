package creational.singleton

/**
 * Одиночка — это порождающий паттерн проектирования, который гарантирует, что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 *
 * Данная реализация паттерна на основе техники Double-Checked Locking.
 * Если instance уже создан, то поток не будет входить в блок synchronized, чем существенно сэкономит время.
 */
class Singleton private constructor(var value: String) {

    companion object {

        @Volatile
        private var instance: Singleton? = null

        fun getInstance(value: String): Singleton? {
            if (instance != null) return instance
            synchronized(Singleton::class.java) {
                if (instance == null) instance = Singleton(value)
                return instance
            }
        }
    }
}

/**
 * Реализация Singleton на основе концепции Initialization-on-demand holder idiom.
 * Но в этом нет большого смысла в Kotlin, так как преимуществ перед обычным object я не вижу (хотя такой класс можно наследовать).
 */
class SingletonNew private constructor() {

    init {
        println("SingletonNew instance created")
    }

    private object Holder {
        val INSTANCE = SingletonNew()
    }

    companion object {
        fun getInstance(): SingletonNew = Holder.INSTANCE
    }
}

/** Синглтон также можно реализовать обычным object в Kotlin, но такой класс нельзя наследовать. */
object SingletonKotlin