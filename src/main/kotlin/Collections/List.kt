data class Usered(val nama: String = "HAj")
//List tidak hanya bisa menyimpan data dengan tipe yang sama. Namun juga bisa berisi bermamcam-macam tipe daya seperti INt,STRING, BOOLEAN atau yang lainnya
fun main() {
    //val listnomor: List<Int> = listOf(1, 2, 3, 4, 5)
//Karena kompiler bisa mengetahui tipe data yang ada dalam objek List, maka kita tak perlu menulis secara eksplisit
    val nomorlist = listOf(1, 2, 3, 4, 5)
    val charlist = listOf('a', 'b', 'c')
//Sedangkan untuk membuat List dengan tipe data yang berbeda, cukup measukkan saja data tersebut seperti kode berikut :
    val anyList = listOf('a', "Kotlin", 3, true)
//Karena setiap objek pada kotlin merupakan turunan dari kelas Any, maka variabel anyList tersebut akan memiliki tipe data List<Any>. Jika kita tampilkan list diatas maka konsol akan menampilkan :
//[a, Kotlin, 3, true]

//Bahkan kitapun bisa memasukkan sebuah data class ke dalam List tersebut :
    /*
    val anyList1 = listOf('a', "Kotlin", 3, true, User())
     */

//Untuk mengakses posisi tertentu dari list tersebut, kita bisa menggunakan fungsi indexing seperti berikut :
    println(anyList[3]) //Indeks dimulai dari 0

//Memanipulasi data pada List dengan tipe mutable. Untuk menambah, menghapus, atau mengganti nilai yang sudah ada, caranya hanya perlu menggunakan fungsi mutableListOf seperti berikut:
    val anyListt = mutableListOf('a', "Kotlin", 3, true, Usered())
    anyListt.add('d')//menambah item diakhir List
    anyListt.add(1, "Love") //menambah item pada indeks ke-1
    anyListt[3] = false //mengubah nilai item pada indeks ke-3
    anyListt.removeAt(0) //menghapus item pada indeks ke-0

    val anyListed = mutableListOf("Kotlin", 2, 0.1, 100L)

    anyListed.add(1, 25)
    anyListed[3] = 0.2
    anyListed.removeAt(3)
    anyListed.add(200L)

    print(anyListed)
}