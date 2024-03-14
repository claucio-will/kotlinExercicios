fun main(){
//   exec()
//  exec2()
 //   exec3()
   println(exec4("xxoo"))

}
fun exec(){
    val capCaixa = 2000
    val capBalao = 7
    var numBaloes = 0

    while ((numBaloes * capBalao) + capBalao < capCaixa){

        numBaloes++
    }
    println("Cabem $numBaloes na caixa")

}

fun exec2(){
    var n = 1;
    while (n <= 50){
      if (n % 15 == 0){
          print("FizzBuzz ")
      }else if (n % 3 == 0){
          print("Buzz ")
      }else if (n % 5 == 0){
          print("Fizz ")
      }else{
          print("$n ")
      }

        n++
    }
}

fun exec3(){
    val name = readln()
    //Usando a função ja existente
    println( name.reversed())
    /**
     * array começa em 0 portando qundo precisamos pegar o tamanhi de um array
     * temos que pegar ele meno 1 para que não tenha problema.
     *
     * Nesse algoritimo o i está começando com o tamanho menos 1 para que fique de acordo com
     * o indice
     * a cada iteração do for o i vai sendo subitraido
     * o print sempre pega o ultimo valor do indice e com isso pega a utima letra e imprimi, e com
     * isso a string fica ao contrario
     * e quando o i fica igual ou mair que zero ele para o programa.
     */

    var i = name.length - 1
    while (i >=0) {
        print(name[i])
        i--
    }
}

fun exec4(str: String) : Boolean{
    str.lowercase()
   var countX = 0
   var coutO = 0
   var i = 0
   while (i < str.length){
       if (str[i] == 'x'){
           countX++
       }else if (str[i] == 'o'){
           coutO++
       }else {
           return false
       }
       i++
   }
    return (countX == coutO)
}