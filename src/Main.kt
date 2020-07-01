import java.util.*

fun main() {

    print("Please input password: ")
    val inputPin:String = readLine()!!
    println("------------------------")
    val checkpin = checkPIN(inputPin)
    checkpin.checkPin()
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

            fun gantipass() {
                println("-------------------------")
                println("Masukkan password anda")
                val passlama:String = readLine()!!
                println("Masukkan password baru anda")
                val passbaru:String = readLine()!!

                println("Apakah data yang anda masukkan sudah tepat? (Yes/No) ")
                val checkAns: String = readLine()!!
                if (checkAns == "Yes") {
                    checkPIN(passbaru,passlama)
                } else {
                    gantipass()
                }
            }

            gantipass()
            main()
        }
        "E" -> selesai()
        else -> {
            println(" Check note untuk cara memilih menu!")
            return atm(atm.sisasaldo)
        }
    }

}

