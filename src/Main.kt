fun main() {
    print("Please input password: ")
    var inputPin: String = readLine()!!
    println("------------------------")



    fun checkPin(inputPin: String) {
        if (inputPin == "") {
            println("Mohon isi PIN")
        } else {
            if (inputPin.length != 6) {
                println("Panjang PIN salah")
                print("Please input password: ")
                var inputPin: String = readLine()!!
                return main()
            } else {
                if (inputPin != "123456") {
                    println("PIN salah")
                    print("Please input password: ")
                    var inputPin: String = readLine()!!
                    return main()
                } else {
                    println("cek")
                }
            }
        }
    }

    checkPin(inputPin)
    atm()
}

fun atm(){
    val atm = ATM()

    println(" ")
    println("------------------------------")
    println("== LIST MENU ATM  ==")
    println("------------------------------")
    println("A. Cek Saldo")
    println("B. Tarik Tunai")
    println("C. Setor Tunai")
}