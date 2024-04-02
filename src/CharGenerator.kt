class CharGenerator(private val min: Char, private val max: Char) {
    fun next() = (min..max).random()

}
class IntGenerator(private val min: Int, private val max: Int){
    fun next() = (min .. max).random()
}

fun main() {

    val g = CharGenerator(min = 'A', max = 'C')
    val i = IntGenerator(1,10)
    println(i.next())
    println(i.next())
//    println(g.next())
//    println(g.next())
//    println(g.next())
}