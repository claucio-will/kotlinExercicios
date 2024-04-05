package polimorfismo

fun main() {

    val a: Dog = Dog()
    a.run()
    a.eat()

    val b: Animal = Dog()
    b.eat()

}



abstract class Animal {

    fun eat() {
        println("Eating...")
    }
}

class Dog : Animal() {
    fun run() {
        println("Running...")
    }
}

class Cat : Animal() {
    fun sleep() {
        println("Sleeping...")
    }
}