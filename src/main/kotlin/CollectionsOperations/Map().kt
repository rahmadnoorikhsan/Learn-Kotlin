package CollectionsOperations

//Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya. Kita ambil contoh numberList yang sudah ada. lalu kita buat collection baru yang isinya adalah hasil kali 5 (lima) dari masing-masing item. Maka anda bisa menggunakan kode seperti berikut:
fun main() {
    val numberlist = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberlist.map {it * 5}
    val pembagianby2 = numberlist.map { it + 1}

    println(multipliedBy5)
    println(pembagianby2)
    //multipliedBy5 : [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
}
//it pada kode diatas akan merepresentasikan masing-masing item pada numberList