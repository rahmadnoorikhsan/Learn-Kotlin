package FunctionalProgramming

//RECURSION merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks.

/*  //Jika kita memasukkan argumen dengan nilai besar ketika ingin menggunakannya seperti ini, maka pada konsol akan menampilkan eror
fun main() {
    println("Factorial 9999 is: ${factorial(9999)}")
}
 */
//fun main() {
//    println(factorial(2) * 4)
//    println("Factorial 9999 is: ${factorial(9999)}")
//}
fun factorial(n: Int): Int{
    return if(n==1) {
        n
    } else {
        n * factorial(n - 1)
    }
}       //program akan menciptakan tumpukan frame dengan jumlah berdasarkan nilai n dimana setiap frame akan mengkonsumsi memori

//TailCallRecursion yakni sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur
//Dengannya kita bisa meminimalisir penumpukan frame ketika kita menerapkan recursive.
//Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan.
fun factorialTail(n: Int, result: Int = 1): Int{
    val newResult = n * result
    return if (n==1) {
        newResult
    } else {
        factorialTail(n -1, newResult)
    }
}
//Namun dengan kode diatas kita tidak bisa langsung menghindari penumpukan frame.
//Ini karena secara default JVM tidak mendukung optimasi tail recursion.
//Untuk itu, Kotlin menyediakan modifier agar kita bisa tetap menerapkannya, yaitu modifier tailrec
tailrec fun factorialTailFix(n: Int, result: Int= 1): Int {
    val newResult = n * result
    return if (n == 1){
        newResult
    }else {
        factorialTailFix(n - 1, newResult)
    }
}

//Pada kode diatas, modifier tailrex ditempatkan sebelum kata kunci fun.
//Ketika sebuah fungsi ditandai dengan modifier tailrec,
//maka fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally

class Animal{
    var name: String = "Cat"
        get(){
            println("Fungsi Getter Terpanggil")
            return field
        }
        set(value){
        println("Fungsi Setter terpanggil")
        field = value
        }
//    val weight: Double,
//    val age: Int,
//    val isMamal: Boolean
}
//    fun eat(){
//        println("$name Eat! ")
//    }
//    fun sleep(){
//        println("$name Sleep! ")
//    }

fun main() {
//    val cat = Animal("Sweety", 15.5, 3, true)
//    println("Nama : ${cat.name}, Tinggi : ${cat.weight}, Umur : ${cat.age}, Mamalia : ${cat.isMamal}")
//    cat.eat()
//    cat.sleep()
    val cat = Animal()
    println("Nama: ${cat.name}")
    cat.name = "Sweety"
    println("Nama: ${cat.name}")
}