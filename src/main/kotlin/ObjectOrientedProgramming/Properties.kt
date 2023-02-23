package ObjectOrientedProgramming

//Property Accessor secara standar ketika properti pada kelas dibuat mutable, maka Kotlin akan menghasilkan fungsi getter dan setter pada properti tersebut.
//Jika properti pada sebuah kelas dibuat read-only, Kotlin hanya akan menghasilkan fungsi getter pada properti tersebut.
//Namun sebenarnya Anda bisa membuat fungsi getter dan setter secara manual jika pada kasus tertentu anda perlu untuk override fungsi tersebut
/*
class Animalisme{
    var name: String = "Kucing"
}
fun main() {
    val kucing = Animalisme()
    println("Nama: ${kucing.name}")
    kucing.name = "Anjing"
    println("Nama : ${kucing.name}")
}
 */

//Pada kode ${kucing.name} sebenarnya terjadi proses pemanggilan fungsi getter pada properti name.
//Namun kita tidak melakukan override pada fungsi getter sehingga fungsi tersebut hanya mengembalikan nilai name saja.
//Begitu juga pada kode kucing.name = "Anjing" pada kode tersebut terjadi pemanggilan fungsi setter pada properti name.

//Tetapi jika melakukan override pada fungsi getter dan setter, maka kita dapat menambahkan kode lain pada fungsi getter sesuai dengan kebutuhan
class Animali{
    var names: String = "Dicoding Miaw"
        get() {     //pada fungsi get(), kita perlu mengembalikan nilai sesuai tipe data dari propertinya atau kita dapat mengembalikan nilai dari properti itu sendiri dengan menggunakan keyword field.
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value) {    //Fungsi set() memerlukan sebuah parameter. Ini merupakan sebuah nilai baru yang nantinya akan dijadikan nilai properti. pada kode ini parameter tersebut ditetapkan dengan nama value
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main() {
    val dicodingCat = Animali()
    println("Nama: ${dicodingCat.names}")
    dicodingCat.names = "Asu"
    println("Nama: ${dicodingCat.names}")
}
//Pendefinisian fungsi get() dan set() tidaklah penting,kita dapat mendefiniskan fungsi get() tanpa mendefinisikan fungsi set() dan juga sebaliknya.
//Yang terpenting pendeklarasiannya dilakukan setelah mendeklarasikan properti tersebut.
