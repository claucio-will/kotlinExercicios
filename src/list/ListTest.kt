package list

fun main() {

    //Lista apenas para leitura
    val lst1: List<Int> = listOf(1,2,3,4,5)

    //Lista de leitura e escrita
    val lst2: MutableList<Int> = mutableListOf(1,6,5,2,3,4,5)
    lst2.sort()
    lst2.forEach {
        print(it)
    }


}