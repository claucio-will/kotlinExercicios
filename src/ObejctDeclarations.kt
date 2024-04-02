
//Obejct declarations é igual a companion object, a diferencia é que não podemos
//colocar atributos no construtor
/**
 * NÃO PODE POR CONTA DO ATRIBUTO name
 * object ObejctDeclarations(val name: String) {
 * }
 */
object ObejctDeclarations {

    fun sum(a: Int, b: Int) = a + b
}

fun main() {
    ObejctDeclarations.sum(10,20)
}