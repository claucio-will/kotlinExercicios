package polimorfismo


fun main() {

    /**
     *  Usando essa atribuição, como o objeto em memoria é do tipo KotlinProgrammer
     *  o metodo work será oque está na classe KotlinProgrammer
     */
    var a: Programmer = KotlinProgrammer()
    a.work()

    /**
     * Nesse caso como o objeto é da classe Programmer será usado o work da classe Programmer
     */
    a = Programmer()
    a.work()
}

 abstract class Employee {

     abstract fun work()
}

class KotlinProgrammer : Programmer(){
    override fun work() {
        println("Kotlin programmer work")
    }
}

open class Programmer : Employee(){
    override fun work() {
       println("Programmer work")
    }
}

class Teacher : Employee(){
    override fun work() {
        println("Teacher work")
    }
}