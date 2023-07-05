package creational.builder

/**
 * Строитель — это порождающий паттерн проектирования, который позволяет создавать сложные объекты пошагово.
 * Строитель даёт возможность использовать один и тот же код строительства для получения разных представлений объектов.
 *
 * Отличие от обычного использования конструктора в Kotlin в том,
 * что в билдере мы можем сразу проверить наличие всех нужных полей (либо выбросить исключение
 * или подчеркнуть неполный объект по-другому).
 */
interface Builder {
    fun setType(type: String?)
    fun setSeats(seats: Int)
    fun setEngine(engine: String?)
    fun setTransmission(transmission: String?)
    fun setTripComputer(tripComputer: String?)
    fun setGpsNavigator(gpsNavigator: String?)
}

fun usage() {
    val carFirst = CarBuilder().apply {
        setType("Sport")
        setSeats(2)
        setEngine("Sport")
        setTransmission("Sport")
        setTripComputer("Sport")
        setGpsNavigator("Sport")
    }.getResult()
    val carSecond = CarBuilder().apply {
        setType("Usual")
        setSeats(2)
        setEngine("Usual")
        setTransmission("Usual")
        setTripComputer("Usual")
        setGpsNavigator("Usual")
    }.getResult()
}