open class ATM(var saldo:Int= 500000) {

    fun tabung(jumlah:Int){
        var sisa:Int = jumlah%50000
        if(sisa>1) {
            println("Kembalian uang anda adalah $sisa")
            println("Tabungan anda bertambah menjadi ${saldo+jumlah-sisa}")
        }
        else {
            println("Tabungan anda bertambah menjadi ${saldo+jumlah}")
        }
    }
    fun tarik(jumlah:Int){
        var sisa:Int = jumlah%50000
        if(sisa>1) {
            println("Jumlah uang yang ditarik hanya bisa ${jumlah-sisa}")
            println("Tabungan anda berkurang menjadi ${saldo-(jumlah-sisa)}")
        }
        else {
            println("Tabungan anda berkurang menjadi ${saldo-jumlah}")
        }
    }
    fun ceksaldo(){
        println("Jumlah saldo anda adalah $saldo")
    }

}