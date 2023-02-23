package ObjectOrientedProgramming

//properti cukup dituliskan pada header class diawali dengan var atau val
class Kewan(val name: String, val weight: Double, val age:Int = 0,val mamalia:Boolean = true) //Primary constructor juga dapat memiliki nilai deafult dengan menambahkan '=' dan mengisi value

fun main() {
    val dicodingAsu = Kewan("Dicoding Waung", 4.2)
    //Kita juga dapat secara eksplisit memilih properti yang ingin kita berikan nilai dengan menambahkan nama properti dan tanda = sebelum mengisikan nilai properti.
    //val dicodingAsu = Kewan("Dicoding Waung", 4.2, mamalia =  true)
    println("Nama: ${dicodingAsu.name}, Berat: ${dicodingAsu.weight}, Umur: ${dicodingAsu.age}, Mamalia: ${dicodingAsu.mamalia}")
}
