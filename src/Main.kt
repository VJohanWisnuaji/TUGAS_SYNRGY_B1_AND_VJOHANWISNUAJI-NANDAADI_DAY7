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
                return main()
            } else {
                if (inputPin != "123456") {
                    println("PIN salah")
                    return main()
                } else {
                    atm()
                }
            }
        }
    }

    checkPin(inputPin)

}

fun atm() {
    val atm = ATM()
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
    var inputMenu: String = readLine()!!


    when (inputMenu) {
        "A" -> {
            println("-------------------------")
            println("--------CEK SALDO--------")
            println("-------------------------")

            var saldo = ATM().saldo
            var nomina = Nominal(saldo)

            print("Saldo pada ATM anda adalah ")
            nomina.fungsiRibuan()

            println("Kembali ke menu?? (Yes/No) ")
            val checkNextStudy: String = readLine()!!
            if (checkNextStudy == "Yes") {
                return atm()
            } else {
                println("-----  ---------------------------------  -----")
                println("-----  Terimakasih sudah menggunakan ATM  -----")
                println("-----  ---------------------------------  -----")
            }
        }
        "B" -> {
//                println("-------------------------===")
//                menuCallculator.casePengurangan()
//                println("-------------------------===")
//
//                val calc = JenisPerhitungan()
//                val pengurangan = Pengurangan(userInputX = 0.0, userInputY= 0.0)
//
//                print(" userInput X: ")
//                pengurangan.userInputX = Scanner(System.`in`).nextDouble()
//
//                print(" userInput y: ")
//                pengurangan.userInputY = Scanner(System.`in`).nextDouble()
//
//
//                calc.penguranganFunction()
//                pengurangan.penguranganFunction()

            println("Kembali ke menu?? (Yes/No) ")
            val checkNextStudy: String = readLine()!!
            if (checkNextStudy == "Yes") {
                return atm()
            } else {
                println("-----  ---------------------------------  -----")
                println("-----  Terimakasih sudah menggunakan ATM  -----")
                println("-----  ---------------------------------  -----")
            }
        }
        "C" -> {
//                println("-------------------------===")
//                menuCallculator.casePerkalian()
//                println("-------------------------===")
//
//                val calc = JenisPerhitungan()
//                val perkalian = Perkalian(userInputX = 0.0, userInputY= 0.0)
//
//                print(" userInput X: ")
//                perkalian.userInputX = Scanner(System.`in`).nextDouble()
//
//                print(" userInput y: ")
//                perkalian.userInputY = Scanner(System.`in`).nextDouble()
//
//
//                calc.perkalianFunction()
//                perkalian.perkalianFunction()

            println("Kembali ke menu?? (Yes/No) ")
            val checkNextStudy: String = readLine()!!
            if (checkNextStudy == "Yes") {
                return atm()
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
            return atm()
        }
    }


}