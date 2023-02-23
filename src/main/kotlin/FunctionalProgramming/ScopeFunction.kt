package FunctionalProgramming

/*
    Fungsi inilah yang dinamakan sebagai scope function.
Beberapa fungsi yang berada di dalamnya natra lain let, run, with, apply, also.
Pada dasarnya beberapa fungsi tersebut melakukan tugas yang sama yaitu mengeksekusi blok kode dari dalam sebuah objek.
Yang membedakannya dalah bagaimana objek tersebut tersedia dan seperti apa hasil yang didapat dari seluruh expression yang berada di dalam blok.
Cara mengakses scope function ada 2 cara, yaitu Lambda receiver (this), dan lambda argumen (it).
Keduanya memiliki kapabilitas yang sama dan tentunya digunakan untuk kasus yang berbeda.
 */

//LAMBDA RECEIVER (this)

//Beberapa fungsi yang menggunnakan lambda receiver adalah run, with, dan apply.
//Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja menghilangkan "this". Misal penggunaan fungsi "apply"
val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}
//Cara ini memiliki kekurangan yaitu kita tidak dapat membedakan objek receiver dengan objek yang berada dari luar lingkup fungsi tersebut.
//Alih-alih, cara ini lebih ditujukan untuk operasi objek itu sendiri, seperti memanggil fungsi dan inisialisasi nilai dari anggota yang menjadi bagian dari objek tersebut.

//LAMBDA ARGUMENT (it)

//Fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also.
//Berbeda dengan lambda receiver, nilai dari argumen tersebut dapat kita gunakan untuk diproduksi atau diinisialisasikan untuk variabel lain. Contoh
fun main() {

/*val text = "Hello"
text.let {
    val message = "$it Kotlin"
    println(message)
}
 */
//Secara default, nama dari argumen tersebut adalah it, namun kita dapat mengubahnya seperti berikut:
val text = "Hello"
text.let { value ->
    val message = "$value Kotlin"
    println(message)
}
}