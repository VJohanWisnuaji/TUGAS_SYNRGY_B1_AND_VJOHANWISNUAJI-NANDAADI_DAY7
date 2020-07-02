import java.util.*

fun main() {
login()

//    fun checkPin(inputPin: String) {
//        if (inputPin == "") {
//            println("Mohon isi PIN")
//        } else {
//            if (inputPin.length != 6) {
//                println("Panjang PIN salah")
//                return main()
//            } else {
//                if (inputPin != "123456") {
//                    println("PIN salah")
//                    return main()
//                } else {
//                    atm(500000)
//                }
//            }
//        }
//    }
//
//    checkPin(inputPin)
}

fun login(newpass: String = "123456"){
    val checkpin =checkPIN(newpass, 1)
    print("Please input password: ")
    val inputPin:String = readLine()!!
    println("------------------------")
    checkpin.checkPin(inputPin)
}


fun atm(saldo: Int) {
    val atm = ATM(saldo)
    println(" ")
    println("------------------------------")
    println("     == LIST MENU ATM  ==")
    println("------------------------------")
    println("A. Cek Saldo")
    println("B. Tarik Tunai")
    println("C. Setor Tunai")
    println("D. Ganti Password")
    println("E. Selesai")
    println("Note: tulis A,B,C,D atau E untuk memilih menu")
    print("Masukkan pilihan menu: ")
    val inputMenu: String = readLine()!!

    fun selesai() {
        println("Apakah anda ingin melanjutkan menggunakan ATM? (Yes/No) ")
        val checkNextStudy: String = readLine()!!
        if (checkNextStudy == "Yes") {
            return atm(atm.sisasaldo)
        } else {
            println("-----  ---------------------------------  -----")
            println("-----  Terimakasih sudah menggunakan ATM  -----")
            println("-----  ---------------------------------  -----")
        }
    }

    when (inputMenu) {
        "A" -> {
            println("-------------------------")
            println("--------CEK SALDO--------")
            println("-------------------------")

            atm.ceksaldo()
            selesai()
        }
        "B" -> {
            println("-------------------------")
            println("-------Tarik Tunai-------")

            fun tarik() {
                println("-------------------------")
                println("Masukkan nominal penarikan anda")
                val Tarik = Scanner(System.`in`).nextInt()

                println("Apakah nominal yang anda masukkan sudah tepat? (Yes/No) ")
                val checkAns: String = readLine()!!
                if (checkAns == "Yes") {
                    return atm.tarik(Tarik)
                } else {
                    tarik()
                }
            }

            tarik()
            selesai()
        }
        "C" -> {
            println("-------------------------")
            println("-------Setor Tunai-------")

            fun setor() {
                println("-------------------------")
                println("Masukkan nominal setoran anda")
                val Setor = Scanner(System.`in`).nextInt()

                println("Apakah nominal yang anda masukkan sudah tepat? (Yes/No) ")
                val checkAns: String = readLine()!!
                if (checkAns == "Yes") {
                    return atm.setor(Setor)
                } else {
                    setor()
                }
            }

            setor()
            selesai()
        }
        "D" -> {
            println("-------------------------")
            println("------Ganti Password-----")
            println("-------------------------")
            println("Masukkan password anda")
            val passlama:String = readLine()!!
            println("Masukkan password baru anda")
            val passbaru:String = readLine()!!
            val gantipass = checkPIN(passbaru,passlama)
            login(gantipass.newPass)
        }
        "E" -> selesai()
        else -> {
            println(" Check note untuk cara memilih menu!")
            return atm(atm.sisasaldo)
        }
    }


}