package ObjectOrientedProgramming

class Kucing(val name: String, val weight: Double, val age: Int, val isMammal: Boolean= true)

fun main() {
    val kucing = Kucing("Gukguk", 2.5, 2)
    kucing.name //public(Properti yang dapat kita akses dari luar kelas Kucing)
}