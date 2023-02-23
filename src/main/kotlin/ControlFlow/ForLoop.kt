//For merupakan konsep perulangan pada blok yang sama selama hasil evaluasi kondisi yang diberikan terpenuhi atau bernilai true. For dapat digunakan pada Ranges, Collections, Arrays dan apapun yang menyediakan iterator
fun main() {
    val contoh = 1..5
    for (i in contoh){
        println("nomor $i!")
    }
    //Kode diatas merupakan contoh perulangn pada Ranges dengan menggunakan range expression yang sudah kita pelajari sebelumnya. Karena menggunakan range expression, kita juga dapat menuliskannya seperti berikut:
    val rangeExp = 1.rangeTo(5)
    for (i in rangeExp){
        println("nomor $i!")
    }
    //Selain itu kita juga dapat menuliskan For Loop menggunakan range expression seperti berikut:
    val contohFor = 1.rangeTo(10) step 3
    for (i in contohFor) {
        println("nomor $i!")
    }

    val forPray = 1..100 step 5
    for ((index, value) in forPray.withIndex()) {
        println("nomor $value with index $index")
    }
    //Kita menambahkan ekstensi step yang akan mengembalikan nilai baru dengan tipe IntProgression dengan jarak nilai sebelumnya 3

    //Kita juga dapat mengakses indeks untuk setiap elemen yang ada pada Ranges dengan memanfaatkan fungsi withIndex() seperti berikut:
    val contohIndex = 1.rangeTo(10) step 3
    for ((index, value) in contohIndex.withIndex()) {
        println("nilai $value dengan index $index")
    }

    //Kita menggunakan kata kunci for untuk memulai proses perulangan. Untuk tujuan yang sama kita juga bisa memanfaatkan salah satu ekstensi pada Kotlin yaitu forEach. Contoh:
    val contohForEach = 1.rangeTo(10) step 3
    contohForEach.forEach{ value ->
        println("nilainya $value")
    }

    val money = 1.rangeTo(50) step 2
    money.forEachIndexed { index, _ ->
        println("your'e money kelipatan $index")
    }
    //forEach pada kode diatas merupakan sebuah lambda expression yang hanya memiliki satu argumen yaitu nilai tunggal yang dicakup pada ranges.

    //Jika  kita mendapatkan indeks dari tiap nilai yang didcakup kita bisa menggunakan ekstensi forEachIndexed seperti berikut:
    val contohFEI = 1.rangeTo(10) step 3
    contohFEI.forEachIndexed { index, value ->
        println("Nilai $value dengan index $index")
    }
    //forEachIndexed memiliki 2 argumen. pertama adalah index yang merupakan indeks dari tiap nilai. Kedua adalah value yang merupakan nilai tunggal yang dicakup oleh ranges itu sendiri.

    //Jika kita hanya ingin menggunakan argumen index, maka kita bisa mengubah argumen value menjadi "_" seperti berikut:
    val contohI = 1.rangeTo(10) step 3
    contohI.forEachIndexed { index, _ ->
        println("index $index")
    }
    //Sebenarnya ini merupakan sebuah aturan dimana ketika argumen dari sebuah lambda expression tidak digunakan, kita disarankan agar mengubahnya menjadi "_" untuk menggantikan nama dari argumen tersebut
}