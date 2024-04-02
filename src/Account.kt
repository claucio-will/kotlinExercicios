class Account(
    val accountNumber: String,
    val accountOwner: String
) {
    var balance: Double = 0.0

    constructor(): this("",""){
        println("Construtor vázio")
    }

    fun deposit(amount: Double){
        balance += amount
    }
    fun deposit(amount: Int){
        balance += amount
    }

    fun print(){
        println("Number: $accountNumber; Owner: $accountOwner; balance: $balance")
    }
}