package ObjectOrientedProgramming

class Anjing(private var name: String, private val weight: Double, private  val age: Int, private val isMammal: Boolean = true) {
/*
fun main() {
    val anjing = Anjing("Shaggy", 2.5, 2)
    println("Nama: ${anjing.name}, Berat: ${anjing.weight}, Umur: ${anjing.age}, mamalia: ${anjing.isMammal}")
    //Dengan menggunakan private, maka kita tidak diizinkan untuk mengakses properti pada kelas Anjing tersebut dari luar kelasnya
}
 */
//Satu-satunya cara untuk mengakses properti private dari sebuah kelas adlah dengan menambahkan fungsi getter dan setter secara manual
    fun getName() : String {
        return name
    }
    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val anjing = Anjing("Shaggy", 2.5, 2)
    println(anjing.getName())
    anjing.setName("Dog")
    println(anjing.getName())
}
