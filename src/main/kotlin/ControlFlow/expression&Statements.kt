import FunctionalProgramming.sum

//IF STATEMENT
/*
    val openOffice = 7
    val now = 8
    if (now > openOffice)
        print("Office already open")
    else
        print("Office close")
 */
//if dikatakan sebagai statement karena ia tidak mengembalikan nilai apapun, hanya sebagai percabangan pada bahasa kotlin

//IF EXPRESSION (statement yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel)
/*
    val openOffice = 7
    val now = 8
    val office = if (now > openOffice) "Office already open" else "Office close"

    print(office)
 */
//if akan mengembalikan variabel office. Apabila kondisi pada if terpenuhi maka variabel office akan berisi "Office already open" dan jika tidak makan akan berisi "Office close"

//didalam sebuah expression bisa terdapat expression lagi

//fun main() {
//    sum(1, 1 * 4)
//}
//fun sum(value1:Int, value2: Int) = value1 + value2
//pada kode 1 * 4 merupakan sebuah expression yang ada pada pemanggilan fungsi "sum()" alias fungsi yang mengembalikkan nilai. Setiap fungsi mengembalikkan nilai. Alhasil, pemanggilan sebuah fungsi merupakan sebuah expression

//contoh lain dari statement adalah inisialisasi sebuah variabel sbb :
/*
fun main() {
    val value3 = 10
    val value4 = 10

    sum(value3, value4)
}

fun sum(value3: Int, value4: Int) = value3 + value4
 */
//pada deklarasi variabel value3 dan value4 merupakan sebuah statement. Sedangkan pemanggilan fungsi sum seperti yang dijelaskan diatas merupakan sebuah expression

fun main() {
    val value1 = 20
    val value2 = 30

    sum(value1, value2)
}

fun sum(value1 : Int, value2: Int) = value1 * value2