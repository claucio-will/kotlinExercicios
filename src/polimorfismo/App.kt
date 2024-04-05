package polimorfismo

fun main() {

    val c = Coffee()
    c.prepare()
}

open class Drink {

    open fun prepare(){
        println("Prepare DRINK")
    }
}

class Coffee : Drink(){

    override fun prepare() {
        //USANDO O SUPER ELE PEGA O COMPORTAMENTO DO METODO QUE ESTÁ NA SUPER CLASSE
        super.prepare()
        println("Prepare COFFEE")
    }
}