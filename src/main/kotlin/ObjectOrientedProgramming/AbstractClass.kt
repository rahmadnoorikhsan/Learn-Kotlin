package ObjectOrientedProgramming

//Abstract class tidak dapat direalisasikan dalam sebuah objek namun tetap dapat menurunkan sifatnya kepada child class-nya
abstract class Kirik(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {
    fun eat(){
        println("$name sedang makan!")
    }
    fun sleep(){
        println("$name sedang tidur!")
    }
}
//Dengan begitu Kirik tidak dapat kita inisialisasikan menjadi sebuah objek

/*
fun main() {
    val kirik = Kirik("Kutuk", 2.6, 1, true)
}
 */
//Ketika kita mencoba membuat objek dari kelas Kirik, akan terdapat eror