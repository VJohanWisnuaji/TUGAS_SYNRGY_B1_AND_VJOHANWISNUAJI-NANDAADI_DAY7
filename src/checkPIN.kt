class checkPIN(var inputPin:String = "") {
    var newPass = "123456"

    constructor(newPass:String,inputPin:String) : this(inputPin){
        if (inputPin == this.newPass) {
            this.newPass=newPass
        } else if (inputPin.length != 6) {
            println("Panjang PIN salah")
        }
        else {
            println("Password yang anda masukkan salah")
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