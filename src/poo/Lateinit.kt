package poo

class Receita {
    lateinit var instrucao: String

    fun gerarReceita(){
        instrucao = "Lave as mãos"
    }

    fun imprimirReceita(){
        if (!this::instrucao.isInitialized){
            instrucao = "Lave as mãos"
        }
    }
}

fun main() {
    val r = Receita()
    r.imprimirReceita()
    println(r.instrucao)
}