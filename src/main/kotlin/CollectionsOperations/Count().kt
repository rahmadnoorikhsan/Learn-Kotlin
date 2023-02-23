package CollectionsOperations

//Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada didalam collection
fun main() {
    val nomorList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(nomorList.count())

    //Didalam fungsi count() kita juga bisa menambahkan sebuah parameter berupa lambda yang berisi sebuah kondisi. Sebagai contoh kali ini kita akan menampilkan jumlah item pada nomorList yang merupakan kelipatan dari 3
    println(nomorList.count{ it % 2 == 0 })
    println(nomorList.count{ it % 1 == 0 })
}
//Pada kode diatas konsol akan menampilkan 3 sebagai jummlah item yang merupakan kelipatan 3, yaitu : 3, 6, dan 9