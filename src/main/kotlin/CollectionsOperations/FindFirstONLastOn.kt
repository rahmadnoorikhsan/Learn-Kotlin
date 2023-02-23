package CollectionsOperations

//Sebuah fungsi yang digunakan untuk mencari item pada sbuah collection. Untuk mencari item pertam yang sesuai dengan kondisi yang akan kita tentukan, kita bisa menggunakan fungsi find(). Contoh mencari angka ganjil pertama
fun main() {
    val nomorList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = nomorList.find{ it % 2 == 1 }
    val firstOrNullNumber = nomorList.firstOrNull{ it % 2 == 0 }
    val lastOrNull= nomorList.lastOrNull{ it % 2 == 0 }
    println(firstOddNumber)
    println(firstOrNullNumber)
    println(lastOrNull)

    //firstOddNumber : 1
    //firstOrNullNumber : null
}
// Fungsi find() ini memiliki cara kerja yang sama dengan fungsi firstOrNull(). Artinya, jika didalam collection tidak ditemukan data yang sesuai, maka fungsi akan mengembalikan nilai null.
// Tidak seperti fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item, fungsi find() dan firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi.
// Kemudian jika anda ingin mencari item terakhir, gunakan fungsi lastOrNull()