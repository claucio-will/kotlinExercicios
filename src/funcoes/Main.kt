package funcoes

fun main() {

    //Usando o array
    val notas = arrayOf(10, 20, 30, 10)
    var result = 0
    for (n in notas) {
        result += n
    }
    println(result)
    println(media(10f, 8f))
}

// Usando o vararg para pode usar quantos parametros quiser
fun <T> media(vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }else {
            return 0f
        }
    }
    return soma / notas.size
}