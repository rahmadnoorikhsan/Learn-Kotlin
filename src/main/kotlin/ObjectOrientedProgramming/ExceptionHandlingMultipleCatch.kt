package ObjectOrientedProgramming
//Multiple catch memungkinkan untuk penanganan exception dapat ditangani lebih dari satu tipe exception. Hal ini sangat sangat berguna ketika kita ingin menangani setiap tipe exception dengan perlakuan yang berbeda

fun main() {
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {    //Block try, menyimpan kode yang membangkitkan exception
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {     //Block catch akan terpanggil ketika terjadi NullPointerException.
        someIntValue = 0
    } catch (e: NumberFormatException) {    //Block catch akan terpanggil ketika terjadi NumberFormatException
        someIntValue = -1
    } //catch (e: Exception) {}             //Block catch akan terpanggil ketika terjadi Exception
    finally { //Block finally akan terpanggil setelah keluar dari block try atau catch
        when(someIntValue) {
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}
//Output kode diatas menjelaskan bahwa blok catch dengan parameter NullPointerExcepton terpanggil. Sebab, pada variabel someStringValue kita menetapkan null sebagai nilainya

//Berbeda ketika kita menginisialisasi nilai someStringValue dengan nilai "12.0" maka exception yang akan terjadi adalah NumberFormatException

//Namun saat nilai someStringValue diinisialisasi dengan nilai "12." maka nilai seomeStringValue berhasil diubah dalam bentuk Integer, maka outpunya adalah : 12