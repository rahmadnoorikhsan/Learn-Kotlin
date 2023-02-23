package ObjectOrientedProgramming

//Exception adalah kejadian yang dapat mengacaukan jalannya suatu program.
//Beberapa contoh Unchecked Exception yang sering mengganggu jalannya program kita:

//ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol
fun main() {
    val someValue = 6
    println(someValue/0)

//NumberFormatException disebabkan karena terjadi kesalahan dalam format angka. Sebagai contoh kita akan mengubah sebuah nilai String menjadi  Integer tetapi nilai String yang akan kita ubah tidak memiliki format angka yang benar sehingga membangkitkan NumberFormatException
    val someStringValue = "18.0"
    println(someStringValue.toInt())

//NullPointerException terjadi karena sebuah variabel atau objek memiliki nilai null, padahal seharusnya objek atau variabel tersebut tidak boleh null
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}