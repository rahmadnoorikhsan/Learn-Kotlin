package FunctionalProgramming

//Dalam mendeklarasi lambda, khususnya jika ingin ditetapkan agar dapat mengembalikan nilai, terkadang kompiler tidak dapat menentukan tipenya. Alhasil, kita perlu menuliskannya secara eksplisit. Terdapat beberapa tipe deklarasi yang dapat kita gunakan untuk mendeklarasi lambda, antara lain

    /*
    var sum: (int) -> Int = { value -> value + value }
     */

//Tipe deklarasi pada kode diatas adalah contoh ketika kita ingin membuat lambda yang memiliki 1 (satu) parameter dengan tipe kembalian Int.

//Dengan ditetapkannya tipe deklarasi pada fungsi tersebut, memungkinkan kita untuk bisa menggunakannya sebagai argumen untuk fungsi lainnya. Contoh

/*
fun main() {
    printResult(10 ,sum3)
}

fun printResult(value: Int, sum3 : (Int) -> Int) {
    val result = sum3(value)
    println(result)
}

var sum3: (Int) -> Int = { value -> value + value}
 */

//Atau kita bisa melampirkannya secara langsung ketika fungsi printResult() diatas dipanggil seperti berikut:
fun main() {
    printResult(10){ value ->
        value + value
    }
}

fun printResult(value: Int, sum3: (Int) -> Int) {
    val result = sum3(value)
    println(result)
}

/*
    Konsep ini dinamakan sebagai Higher-Order Function,
    yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter,
    menjadikan tipe kembalian, ataupun keduanya.
    Yang perlu diperhatikan adalah, jika argumen terakhir dari fungsi merupakan sebuah lambda expression,
    maka lambda expression tersebut ditempatkan di luar parenthesis seperti pada contoh kode di atas.
 */