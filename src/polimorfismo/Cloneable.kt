package polimorfismo

fun main() {
    val tree = Tree("Blue", 1.65)
    val treeCopy = tree.copy()
    println(treeCopy)

}


interface Cloneable {

    fun clone(): Any
}

data class Tree(
    val color: String,
    val height: Double
) : Cloneable {
    override fun clone(): Any {
        return Tree(color, height)
    }

}