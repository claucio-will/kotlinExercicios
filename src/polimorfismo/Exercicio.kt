package polimorfismo


fun main() {
    val w1 = HourlyWorker(100.0, 160)
    val w2 = Freelancer(5000.0)
    pay(w1)
    pay(w2)
    println(totalPay)
}



var totalPay = 0.0

fun pay(worker: Worker){
    totalPay += worker.pay()
}

abstract class Worker(val baseSalary: Double){
    fun pay(): Double {
        return baseSalary * multipler()
    }
    abstract fun multipler(): Double
}

class HourlyWorker(hourPrice: Double, val hoursWorked: Int): Worker(hourPrice){
    override fun multipler(): Double {
        return hoursWorked.toDouble()
    }

}

class Freelancer(totalSalary: Double): Worker(totalSalary){
    override fun multipler(): Double {
        return 1.0
    }

}