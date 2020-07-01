class checkPIN(var inputPin: String = "") {
    var newPass = "123456"

    constructor(Pass: String, inputPin: String) : this(inputPin) {
        if (Pass.length != 6) {
            println("Panjang PIN harus 6 digit")
        } else if (inputPin == this.newPass) {
            println("PIN berhasil diganti")
            this.newPass = Pass
            println("------------------------")
            print("Please input PIN: ")
            val inputPin: String = readLine()!!
            println("------------------------")
            checkPin2(inputPin)
        } else {
            println("Password yang anda masukkan salah")
        }

    }

    private fun checkPin2(inputPin: String) {
        if (inputPin == "") {
            println("Mohon isi PIN")
        } else {
            if (inputPin.length != 6) {
                println("Panjang PIN salah")
                return main()
            } else {
                if (inputPin != newPass) {
                    println("PIN salah")
                    return main()
                } else {

                }
            }
        }
    }

    fun checkPin() {
        if (inputPin == "") {
            println("Mohon isi PIN")
        } else {
            if (inputPin.length != 6) {
                println("Panjang PIN salah")
                return main()
            } else {
                if (inputPin != newPass) {
                    println("PIN salah")
                    return main()
                } else {
                    atm(500000)
                }
            }
        }
    }
}