package FunctionalProgramming

data class Item (val key: String, val value: Any)

//SLICE fmenyaring item dari posisi tertentu dan membutuhkan sebuah argumen berupa Range yang digunakan untuk menentukan posisi pertama dan terakhie yang akan disaring
fun main() {
    val total = listOf(1,2,3,4,5,6,7,8,9,10)
    val slice = total.slice(3..5)
    val slice1 = total.slice(3..6 step 2) //Karena menggunakan Range, kita juga bisa menggunakan operator step ketika argumennya disematkan
    println(slice)
    println(slice1)

    //Jika ingin menentukan posisi yang lebih spesifik, kita bisa mendefinisikannya didalam sebuah colection, kemudian disematkan sebagai argumen
    val index = listOf(2,3,5,8)
    val total1 = listOf(1,2,3,4,5,6,7,8,9,10)
    val slice3 = total1.slice(index)
    println(slice3)
    //Harus berhati-hati dalam menentukan cakupan index untuk mendapatkan data. Karena dapat menyebabkan terjadinya ArrayIndexOutOfBoundsException jika posisi yang ditentukan tidak terdapat pada objek collection

//DISTINCT untuk menyaring item yang sama
    val totalDis = listOf(1,2,1,3,4,5,2,3,4,5)
    val distinct = totalDis.distinct()
    println(distinct)

    //Kita Juga bisa menggunakannya pada collection dengan tipe parameter seperti data class
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3","Awesome"),
        Item("3","as"),
        Item("3", "Programming"),
        Item("3", "Language")

    )

val distinctItems = items.distinctBy { it.key }
distinctItems.forEach{
    println("${it.key} with value ${it.key}")
}

    //distinctBy() menyaring item yang memiliki panjag sama
    val textby = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctby = textby.distinctBy{
        it.length
    }
    println(distinctby)
    //fungsi distinct() tidak dapat digunakan pada object Map Collection

//CHUNKED untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array. chunked() membutuhkan nilai yang akan digunakan sebagai jumlah indeks untuk pemisah
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)

    //Kita bisa menggunakannya untuk memodifikasi setiap nilai yang sudah dipecah. Contoh, hasil dari nilai yang sudah dipecah ingin kita buat menjadi huruf kecil
    val kata = "QWERTY"
    val chunkedTransform = kata.chunked(3){
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
    //Argumen yang berada pada lambda expression diatas mempresentasikan setiap nilai yang sudah dipecah
}