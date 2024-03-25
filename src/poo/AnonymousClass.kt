package poo

interface Event {
    fun onsuccess()
}
class Progrma {
    fun salvar(event: Event){
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexões fechada")
        event.onsuccess()
    }
}

fun main(){
    val programa = Progrma()
    programa.salvar(object : Event {
        override fun onsuccess() {
            println("Chegou no onsuccess")
        }

    })
}