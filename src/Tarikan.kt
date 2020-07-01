class Tarikan(saldo: Int) : ATM(saldo) {
    override var sisasaldo: Int = saldo

    fun tarik(jumlah: Int) {
        val sisa: Int = jumlah % 50000
        if (sisasaldo < jumlah) {
            println(
                "Sadar diri bambang, jangan ngadi2 saldo cuma ${numberFormat.format(sisasaldo)
                    .toString()} minta narik duit ${numberFormat.format(jumlah).toString()}"
            )
            this.sisasaldo
        } else if (sisa > 1) {
            println("ATM ini hanya bisa mengeluarkan uang dengan kelipatan RP50.000,00")
            println("Kelebihan ${numberFormat.format(sisa).toString()} tidak bisa ditarik")
            println("============================================================================")
            this.sisasaldo = sisasaldo - (jumlah - sisa)
            println("Uang yang anda tarik adalah sebesar ${numberFormat.format(jumlah - sisa).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        } else {
            this.sisasaldo = sisasaldo - jumlah
            println("Uang yang anda tarik adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        }
    }
}