package poo

class Car(owner: String) {

    var owner = owner
        get() {
            return field.uppercase()

        }

    init {
        if (owner.equals("Claucio")){
            this.owner = "CLT"
        }else{
            this.owner = "PJ"
        }


    }

    var maxSpeed: Int = 100
        set(value) {
            field =
                if (value > 0) value else throw IllegalArgumentException("Velocidade maxima não pode ser menor que zero")
        }
}

fun main() {
    val car = Car("Claucio")
    car.maxSpeed = 100
    println(car.owner)
}