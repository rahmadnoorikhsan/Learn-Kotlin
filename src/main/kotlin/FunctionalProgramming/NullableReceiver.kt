package FunctionalProgramming

//val Int?.slice2: Int     //Untuk memeriksa apakah receiver object-nya bernilai null. Jika tidak bernilai null, maka receiver object tersebut akan secara otomatis di casting menjadi tipe non-null, sehingga kita bisa menggunakan nilainya
//    get() = if (this == null) 0 else this.div(2)

//selain If expression, kita juga bisa menggunakan elvis operator
/*
fun main() {
    val value: Int? = null
    println(value.slice1)
}
val Int?.slice1: Int
    get() = this?.div(2) ?: 0
 */

//Bisa juga menggunakan operator Safe call setiap kali extension tersebut dipanggil. Contoh:
fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value?.slice)
    println(value1?.slice)
}

val Int.slice: Int
    get() = this?.div(2) ?:0
