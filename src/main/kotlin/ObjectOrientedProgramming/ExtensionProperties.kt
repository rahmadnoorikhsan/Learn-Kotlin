package ObjectOrientedProgramming

//Extension properties dilakukan diluar kelas.
//Dengan demikian, Extension properties hanya bisa didefinisikan dengan cara menyediakan getter atau setter secara explisit
class Anomali(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Anomali.getAnomaliInfo : String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Mamalia: ${this.isMammal}"
//Dengan menambahkan Extension properties getAnomaliInfo pada kelas Anomali, maka kita dapat menggunakan properti tersebut pada sebuah objek kelas Anomali
fun main() {
    val dicodingCat = Anomali("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnomaliInfo)
}