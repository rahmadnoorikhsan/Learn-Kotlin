package ObjectOrientedProgramming

//Hak akses protected mirip seperti private, namun pembatasanya lebih luas dalam sebuah hirarki kelas.
//Hak akses protected digunakan ketika kita mengnginkan sebuah anggota dari induk kelas dapat diakses hanya oleh kelas yang merupakan turunannyta.
open class Satwa(val name: String, protected val weight: Double)

class Macan(pName: String, pWeight: Double) : Satwa(pName, pWeight) //properti weight pada kelas Satwa memiliki hak akses protected. Kita tetap bisa mengaksesnya dari kelas Macan yang termasuk dalam hirarki kelas Satwa. Namun kita tidak dapat mengakses properti tersebut secara langsung dari luar hirarki kelasnya

fun main() {
    val macan = Macan("Oren", 2.0)
    println("Saya Macan ${macan.name}")
    //println("Berat macan ${macan.weight}") //Cannot access 'Weight': it is protected in 'Macan'
}
