package ObjectOrientedProgramming

class Animal(val nama: String,
             val berat: Double,
             val umur: Int,
             val mamalia: Boolean
) {
    fun eat(){
        println("$nama Makan!")
    }

    fun sleep() {
        println("$nama Tidur!")
    }
}

fun main() {
    val kucing = Animal("Anjing", 5.1, 3, true)
    println("Nama : ${kucing.nama}, Berat : ${kucing.berat}, Umur: ${kucing.umur}, Mamalia: ${kucing.mamalia}")
    kucing.eat()
    kucing.sleep()
}