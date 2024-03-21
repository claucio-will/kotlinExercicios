package poo

enum class DiaSemana(val id: Int) {
    DOMINGO(1){
        override fun toString(): String {
            return "Vai retornar esse ao inves de domingo $id"
        }
              },
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7),

}


fun main() {

    for (d in DiaSemana.values()){
        println(d)
    }

//    val dia = DiaSemana.QUINTA
//
//    when (dia) {
//        DiaSemana.SEGUNDA ->
//            println("Segunda-feira")
//        DiaSemana.TERCA ->
//            println("terça-feira")
//        DiaSemana.QUARTA ->
//            println("Quarta-feira")
//        DiaSemana.QUINTA ->
//            println("quinta-feira")
//        else ->
//            println("Nenhum dia")
//    }
}