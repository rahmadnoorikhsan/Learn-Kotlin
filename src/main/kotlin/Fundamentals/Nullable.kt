fun main() {
    //NullPointerException(NPE), Sebuah kesalahan yang terjadi saat ingin mengakses atau mengelola nilai dari sebuah variabel yang belum diinisialisasi atau variabel yang bernilai null
    /*
    val text: String = null // compile time error
     */

    //jika ingin sebuah objek bernilai null, kita bisa menambahkan tanda "?" setelah menentukan tipe dari objek
    val text: String? = null
    if (text != null) {
        val textLengths = text.length
    }

    //namun tidak bisa langsung mengakses atau mengelola nilai dari objek yang sudah kita tandai sebagai nullable
    /*
    val text: String? = null
    val textLength = text.length //compile time error
     */

    //kita harus memeriksa objek tersebut apakah bernilai null atau tidak
    val text1: String? = null
    //val textLength = text.length //compile error

    if (text1 != null){
        val textLength = text1.length
    }
    //Dengan menggunakan if/else kompiler akan mengizinkan kita untuk mengelola nilai dari sebuah variabel yang kita tandai sebagai nullable

    //SafeCallsOperator (?.)
    // Safe calls akan menjamin kode yang kita tulis aman dari NullPointerException. Kita akan mengganti tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable
    val text2: String? = null
    text2?.length

    val textSafe: String? = null
    textSafe?.length
    //Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null

    //ElvisOperator (?:), Memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null
    val text3: String? = null
    val text3Length = text?.length ?: 7

    val textElvis = if (text3 != null) text3.length else 7

    val textNull: String? = null
    val textElOp = if (textNull != null) textNull.length else 10
    //kode diatas sebenarnya sama seperti ketika kita menggunakan if/else
    /*
    val text3Length = if (text != null) text.length else 7
     */
    //Elvis akan mengembalikan nilai text.length jika text tidak bernilai null. Sebaliknya, jika text bernilai null maka default value yang akan dikembalikan

    //non-null assertion(!!)
    val text4: String? = null
    val textLength = text!!.length
    /*
    Dengan menggunakan "non-null assertion" kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari sebuah objek nullable.
    Namun penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi "non-null".
    Sehingga ketika objek tersebut bernilai "null", anda tetap akan berjumpa dengan "NullPounterException"
     */
}