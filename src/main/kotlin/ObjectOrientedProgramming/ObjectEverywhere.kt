package ObjectOrientedProgramming

fun main() {
    val someString = "Dicoding"
    println(someString.reversed()) //Untuk membuat urutan huruf disusun secara terbalik
    println(someString.toUpperCase()) //Untuk membuat huruf menjadi kapital
    println(someString.toLowerCase()) //Untuk membuat huruf menjadi kecil

    //Kita juga dapat mengubah tipe data dengan mengakses fungsi yang tersedia dari sebuah objek String
    val someString1 = "123"
    val someInt = someString1.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}
//Hasil dari output kode menunjukan nilai true pada kedua variabel tersebut, yang artinya kita telah berhasil mengubah suatu tipe data String ke tipe data lainnya dengan menggunakan fungsi yang terdapat pada objek String