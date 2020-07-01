import java.text.NumberFormat
import java.util.*

open class ATM(saldo: Int) {
    open var sisasaldo: Int = saldo
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)

    fun ceksaldo() {
        println("Jumlah saldo anda adalah ${numberFormat.format(sisasaldo).toString()}")
        println("============================================================================")
    }

}