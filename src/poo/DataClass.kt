package poo

fun main() {
    val f1 = FormaData(10,8)
    var f2 = FormaData(20,10)

    f2 = f1.copy()
    println(f2.a)
}


class Forma(val a: Int, val b: Int)
data class FormaData(val a: Int, val b: Int)