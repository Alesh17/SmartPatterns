package creational.builder

class CarBuilder : Builder {

    private var type: String? = null
    private var seats: Int? = 0
    private var engine: String? = null
    private var transmission: String? = null
    private var tripComputer: String? = null
    private var gpsNavigator: String? = null

    override fun setType(type: String?) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: String?) {
        this.engine = engine
    }

    override fun setTransmission(transmission: String?) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: String?) {
        this.tripComputer = tripComputer
    }

    override fun setGpsNavigator(gpsNavigator: String?) {
        this.gpsNavigator = gpsNavigator
    }

    fun getResult(): Car = Car(type, seats, engine, transmission, tripComputer, gpsNavigator)
}