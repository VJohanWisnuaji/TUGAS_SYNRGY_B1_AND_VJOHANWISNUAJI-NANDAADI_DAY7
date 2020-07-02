class checkPIN {
    var newPass = "123456"
    var inputPin = ""

    constructor(newPass:String,inputPin:String){
        if (inputPin == this.newPass) {
            this.newPass=newPass
        } else if (inputPin.length != 6) {
            println("Panjang PIN salah")
        }
        else {
            println("Password yang anda masukkan salah")
        }
    }

    constructor(newPass:String, inputdummy:Int){
        this.newPass=newPass
    }

    constructor(dummy:Int){

    }


    constructor(inputPin:String){
        this.inputPin=inputPin
    }

    fun checkPin(inputPin: String) {
        if (inputPin == "") {
            println("Mohon isi PIN")
        } else {
            if (inputPin.length != 6) {
                println("Panjang PIN salah")
                return login()
            } else {
                if (inputPin != newPass) {
                    println("PIN salah")
                    return login()
                } else {
                    atm(500000)
                }
            }
        }
    }

}