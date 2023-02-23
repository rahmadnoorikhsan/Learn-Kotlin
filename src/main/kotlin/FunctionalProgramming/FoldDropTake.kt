package FunctionalProgramming

//FOLD dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold()
fun main() {

val numbers = listOf(1,2,3)
val fold = numbers.foldRight(10) { current, item ->      //Argumen current mempresentasikan nilai awal
                                                          //Argumenn item mempresentasikan masing-masing item yang berada pada numbers
    println("current $current")
    println("item $item")
    println()
    current+item
}

println("Fold result: $fold")

    val numbered = listOf(1, 2, 3, 100)
    val foldNumber = numbered.foldRight(5) {item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result $foldNumber")

//fold() memerlukan 2 argumen yaitu nilai awal untuk perhitungan dan lambda expression yang nilai kembaliannya digunakan untuk menentukan nilai awal selanjutnya

//foldRight() akan melakukan proses iterasi dari indeks terakhir dan posisi dari argumen pada lambda expression nya pun berbeda, dimana argumen item berada pada posisi pertama dan argumen current berada pada posisi kedua

//DROP fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan
val number = listOf(1,2,3,4,5,6)
val drop = number.drop(3)        //Memotong 3 angka dari awal
                //droplast()        //Memotong angka dari akhir

println(drop)

//TAKE bisa kita manfaatkan untuk enyaring item yang berada di dalam sebuah objek collection
    val total = listOf(1,2,3,4,5,6)
    val take = total.take(3)      //Memotong indeks pertama
                    //takelast()     //Memotong indeks terakhir
    println(take)
}
