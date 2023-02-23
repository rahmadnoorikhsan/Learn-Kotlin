package FunctionalProgramming

//fungsi LET menggunakan argumen (it) untuk mengakses kontesks dari sebuah objek.
//Penggunaan let akan banyak kita temukan pada objek yang bertipe non-null. Contoh
fun main() {
    val message: String? = null
    message?.let{
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
    //Dengan menggunakan fungsi let seperti pada kode diatas, kita bisa mengurangi penggunaan operator safe call seperti berikut
    val messagee: String? = null
    val length = messagee?.length ?: 0 * 2
    val text = "text length $length"
    println(text)
    //Lalu bagaimana jika kita ingin menjalankan logika kode lain jika objeknya bernilai null?
    //Disini kita akan memanfaatkan fungsi lainnya yaitu run dan elvis operator yang sudah kita pelajari sebelumnya. Contoh
    val messageNull: String? = null
    messageNull?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }
    //Sedangkan untuk nilai kembalian, ia bergantung pada expression yang berada di dalam blok lambda seperti pada contoh diatas.
    //Karena pada baris terakhir dari blok lambda tersebut adalah fungsi println(), maka nilai yang akan dikembalikan adalah Unit.
    //Ini dikarenakan fungsi println() sendiri mengembalikan nilai Unit.

//fungsi ALSO sama seperti fungsi apply, dimana nilai yang dikembalikan adalah nilai dari konteks objek.
//Namun untuk konteks objeknya tersedia sebagai argumen (it).
//Fungsi also baiknya digunakan ketika ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
    val text2 = "Hello Kotlin"
    val result = text2.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")
}