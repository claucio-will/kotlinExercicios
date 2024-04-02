fun main() {

    val car1 = Factory.newCar()
    val car2 = Factory.newCar()
    val car3 = Factory.newCar()
    println(car1)
    println(car2)
    println(car3)
    
}

object Factory {
    private var instanceCount = 0
    fun newCar(): Car {
        instanceCount++
        return Car()
    }
}

class Car