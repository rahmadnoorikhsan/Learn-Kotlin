package ObjectOrientedProgramming

//Kotlin secara otomatis membuat sebuah default constructor pada kelas jika kita tidak membuat sebuah konstruktor secara manual
class Binatang{
    val name: String = "Anjing"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}

fun main() {
    val Anjing = Binatang()
    println("Nama: ${Anjing.name}, Berat: ${Anjing.weight}, Umur: ${Anjing.age}, Mamalia: ${Anjing.isMammal}")
}
//Ketika kita membuat sebuah objek, default konstruktor akan dipanggil.
//Konstruktor tersebut akan menginisialisasi properti yang terdapat pada kelas dengan nilai default