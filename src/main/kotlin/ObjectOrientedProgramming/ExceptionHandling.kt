package ObjectOrientedProgramming

//try-catch kode yang dapat membangkitkan suatu exception disimpan dalam blok try, dan jika exception tersebut terjadi, maka blok catch akan terpanggil
fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try{
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = " Nilai String Null"
    } finally {     //try-catch-finally selain terdapat blok try dan catch, ada juga blok finally. Hanya saja blok ini bersifat opsional
        println(someMustNotNullValue)
    }
}
