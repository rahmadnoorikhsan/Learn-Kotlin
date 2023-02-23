package FunctionalProgramming

//Lambda sangat berguna karena dapat membuat penulisan kode menjadi lebih mudah dan sederhana
//Kita bisa menghindari boilerplate code dalam menggunakan anonymous class seperti berikut :
/*
val comparator = object : Runnable{
    override fun run() {
        // TODO:
    }
}
 */

//Dengan lambda, kita bisa menyederhanakan menjadi seperti dibawah ini :
val comparator = Runnable{
    // TODO:
}

//Menggunakan Lambda Expression

//Kita bisa memanggilnya seperti halnya kita memanggil sebuah fungsi pada umumnya

/*
fun main() {
    message()
}

val message = { println("Hello From Lambda") }
 */

//Jika kita ingin menambahkan sebuah parameter pada fungsi lambda, kita bisa menuliskannya seperti berikut

/*
fun main() {
    printMessage("Hello From Lambda")
}
val printMessage = {message: String -> println(message)
}
 */

//Parameter dari sebuah lambda berada di dalam kurung kurawal. Untuk membedakannya dengan "body", daftar "parameter" yang ada dipisahkan dengan tanda ->

//Bagaimana cara mendeklarasi lambda agar dapat mengembalikkan nilai? Untuk itu kitsa bisa menuliskannya seperti berikut
fun main() {
    val length = messageLength("Halo Dari Lambda")
    println("Message length $length")
}
val messageLength = { message: String -> message.length}
//Bisa kita perhatikan, kita tidak membutuhkan tipe kembalian dan kata kunci return untuk mengembalikan sebuah nilai. Pada dasarnya, kompiler akan mengembalikan nilai berdasarkan expression atau statement di baris terakhir didalam body