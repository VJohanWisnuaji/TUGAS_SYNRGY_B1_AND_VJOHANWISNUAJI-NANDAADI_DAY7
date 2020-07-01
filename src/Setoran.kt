class Setoran(saldo: Int) : ATM(saldo) {
    override var sisasaldo: Int = saldo

    fun setor(jumlah: Int) {
        val sisa: Int = jumlah % 50000
        if (sisa > 1) {
            println("ATM ini hanya bisa menerima tabungan dengan kelipatan RP50.000,00")
            println("Uang Anda akan dikembalikan sebesar ${numberFormat.format(sisa).toString()}")
            println("============================================================================")
            this.sisasaldo = sisasaldo + jumlah - sisa
            println("Uang yang anda tabungkan adalah sebesar ${numberFormat.format(jumlah - sisa).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        } else {
            this.sisasaldo = sisasaldo + jumlah
            println("Uang yang anda setor adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        }
    }
}