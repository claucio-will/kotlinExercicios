package poo
interface Funcionario {
    var salario: Float
    fun bonus() : Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}
class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

//Esse é o uso do polimorfismo, como gerente e analista herdam de funcionario
//ambos é um funcionario, então eu posso tanto passar gerente quanto analista para o metodo
fun mostrarBonus(func: Funcionario){
    println(func.bonus())
}

fun main() {
    mostrarBonus(Gerente(5000f))
    mostrarBonus(Analista(4000f))
}