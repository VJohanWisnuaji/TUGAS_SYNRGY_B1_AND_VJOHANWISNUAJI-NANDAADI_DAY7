import java.util.*

fun main() {
    print("Please input password: ")
    val inputPin: String = readLine()!!
    println("------------------------")



    fun checkPin(inputPin: String) {
        if (inputPin == "") {
            println("Mohon isi PIN")
        } else {
            if (inputPin.length != 6) {
                println("Panjang PIN salah")
                return main()
            } else {
                if (inputPin != "123456") {
                    println("PIN salah")
                    return main()
                } else {
                    atm(500000)
                }
            }
        }
    }

    checkPin(inputPin)

}

fun atm(saldo:Int) {
    val atm = ATM(saldo)
    println(" ")
    println("------------------------------")
    println("== LIST MENU ATM  ==")
    println("------------------------------")
    println("A. Cek Saldo")
    println("B. Tarik Tunai")
    println("C. Setor Tunai")
    println("D. Selesai")
    println("Note: tulis A,B,C untuk memilih menu")
    print("Masukkan pilihan menu: ")
    val inputMenu: String = readLine()!!


    when (inputMenu) {
        "A" -> {
            println("-------------------------")
            println("--------CEK SALDO--------")
            println("-------------------------")

            atm.ceksaldo()
            var saldo = ATM().saldo
            var nomina = Nominal(saldo)

            print("Saldo pada ATM anda adalah ")
            nomina.fungsiRibuan()

            println("Kembali ke menu?? (Yes/No) ")
            val checkNextStudy: String = readLine()!!
            if (checkNextStudy == "Yes") {
                return atm(atm.sisasaldo)
            } else {
                println("-----  ---------------------------------  -----")
                println("-----  Terimakasih sudah menggunakan ATM  -----")
                println("-----  ---------------------------------  -----")
            }
        }
        "B" -> {
            println("-------------------------")
            println("-------Tarik Tunai-------")
            println("-------------------------")
            println("Masukkan nominal penarikan anda")
            val Tarik = Scanner(System.`in`).nextInt()
            atm.tarik(Tarik)

            println("Kembali ke menu?? (Yes/No) ")
            val checkNextStudy: String = readLine()!!
            if (checkNextStudy == "Yes") {
                return atm(atm.sisasaldo)
            } else {
                println("-----  ---------------------------------  -----")
                println("-----  Terimakasih sudah menggunakan ATM  -----")
                println("-----  ---------------------------------  -----")
            }
        }
        "C" -> {
            println("-------------------------")
            println("-------Setor Tunai-------")
            println("-------------------------")
            println("Masukkan nominal setoran anda")
            val Setor = Scanner(System.`in`).nextInt()
            atm.setor(Setor)

            println("Kembali ke menu?? (Yes/No) ")
            val checkNextStudy: String = readLine()!!
            if (checkNextStudy == "Yes") {
                return atm(atm.sisasaldo)
            } else {
                println("-----  ---------------------------------  -----")
                println("-----  Terimakasih sudah menggunakan ATM  -----")
                println("-----  ---------------------------------  -----")
            }
        }
        "D" -> {
            println("-----  ---------------------------------  -----")
            println("-----  Terimakasih sudah menggunakan ATM  -----")
            println("-----  ---------------------------------  -----")
        }
        else -> {
            println(" Check note untuk cara memilih menu!")
            return atm(atm.sisasaldo)
        }
    }


}