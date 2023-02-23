package CollectionsOperations

// Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection. Kita juga bisa menambahkan sebuah kondisi dengan parameter lambda.
// Namun perlu diperhatikan jika kita menambahkan sebuah kondisi padahal kondisi tersebut tidak terpenuhi, apa hasilnya? Exception!
fun main() {
    val nomorList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = nomorList.first { it > 10 }

    print(moreThan10)
}