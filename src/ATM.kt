import java.text.NumberFormat
import java.util.*

open class ATM(saldo:Int) {
    var sisasaldo:Int = saldo
    val localeID =  Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)

    fun setor(jumlah:Int) {
        val sisa: Int = jumlah % 50000
        if (sisa > 1) {
            println("ATM ini hanya bisa menerima tabungan dengan kelipatan RP50.000,00")
            println("Uang Anda akan dikembalikan sebesar ${numberFormat.format(sisa).toString()}")
            println("============================================================================")
            this.sisasaldo = sisasaldo + jumlah - sisa
            println("Uang yang anda tabungkan adalah sebesar ${numberFormat.format(jumlah - sisa).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        }
        else {
            this.sisasaldo = sisasaldo + jumlah
            println("Uang yang anda setor adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        }
    }


    fun tarik(jumlah:Int){
        val sisa:Int = jumlah%50000
        if (sisasaldo<jumlah){
            println("Sadar diri bambang, jangan ngadi2 saldo cuma ${numberFormat.format(sisasaldo).toString()} minta narik duit ${numberFormat.format(jumlah).toString()}")
        }
        else if(sisa>1) {
            println("ATM ini hanya bisa mengeluarkan uang dengan kelipatan RP50.000,00")
            println("Kelebihan ${numberFormat.format(sisa).toString()} tidak bisa ditarik")
            println("============================================================================")
            this.sisasaldo = sisasaldo - (jumlah - sisa)
            println("Uang yang anda tarik adalah sebesar ${numberFormat.format(jumlah - sisa).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        }
        else {
            this.sisasaldo = sisasaldo + jumlah
            println("Uang yang anda tarik adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        }
    }

    fun ceksaldo(){
        println("Jumlah saldo anda adalah ${numberFormat.format(sisasaldo).toString()}")
        println("============================================================================")
    }

}