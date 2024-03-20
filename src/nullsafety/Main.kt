package nullsafety

fun main() {

    val str: String? = null
    // println(str ?: "null")

//    val age = 20
//    var maior = if(age >= 20) "é" else "Não"
//    println(maior)

    //Tudo que está dentro do escopo só vai ser executada se não for nula
    str?.let {
        println(it.lowercase())
    }
}