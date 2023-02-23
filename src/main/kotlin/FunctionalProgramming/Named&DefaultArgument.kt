package FunctionalProgramming

//Named Argument
fun main() {
    val fullName = getFullName(first = "Rahmad", middle = "Noor", last = "Ikhsan") //Bisa mengacak posisi
    print(fullName)
}

fun getFullName (first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

    //Default Argument
/*
    fun main() {

    val fullName1 = getfullName2(first = "Rahma D.") //Ketika menetapkan nilai default, kita tak perlu khawatir saat lupa melampirkan sebuah argumen. Tentunya ini menghindari kita dari error. Meskipun begitu, kita tetap bisa melampirkan sebuah argumen
    print(fullName1)
  }
 */
    fun getFullName2(
        first1: String = "Rahmad",
        middle1: String = "Noor",
        last1: String = "Ikhsan"
    ): String {
        return "$first1 $middle1 $last1"
    }
//ditambahi fun main seperti Named Argument
