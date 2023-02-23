fun main() {
    /*
    Array adalah tipe daya yang memungkinkan kita untuk menyimpan beberapa objek di dalam sebuah variabel.

    Array di Kotlin dipresentasikan oleh kelas "Array" yang memiliki fungsi "get" dan "set" serta properti "size". Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function "arrayOf()"
     */
    val array = arrayOf(1,3,5,7)
    array[3] = 10

    println(array[3])

    //Kita juga dapat memasukkan nilai dengan berbagai jenis tipe data ke dalam "arrayOf()"
    val mixArray = arrayOf(1,3,5,7,"Dicoding",true)
    mixArray[4] = "Dicoding Indonesia"

    println(mixArray[4])
    /*
    Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan memanfaatkan beberapa fungsi spesifik berikut:
    > intArrayOf()       : IntArray
    > booleanArrayOf()   : BooleanArray
    > charArrayOf()      : CharArray
    > longArrayOf()      : LongArray
    > shortArrayOf()     : ShortArray
    > byteArrayOf()      : ByteArray
     */

    //Kita juga bisa membuat Array yang hanya bisa dimasukkan nilai dengan tipe data Int, gunakan "intArrayOf()"
    val intArray = intArrayOf(1,3,5,7)

    //Kita juga bisa mendapatkan nilai tunggal dari sekumpulan nilai yang berada didalam sebuah Array dengan memanfaatkan Indexing
    println(intArray[2])

    //Dengan indexing kita juga bisa mengubah nilai tunggal tersebut
    intArray[2] = 11                   // [1,3,11,7]

    println(intArray[2])

    //Selain menggunakan library function "arrayOf()" dalam pembuatan objek Array, kita juga bisa menggunakan "Array()". Constructor pada "Array()" membutuhkan 2 argumen yaitu "size" dan fungsi lambda
    val inttArrayy = Array(4,{i -> i *   i}) //[0,1,4,9]

    print(inttArrayy[3])
    /*
    > 4 sebagai size Array
    > Fungsi lambda diatas ada dua:
        1. Untuk mengambil indeks Array yang akan digunakan sebagai argumen.
        2. Menentukan elemen Array yang akan dimasukkan ke dalam indeks tersebut
     */

    //CATATAN
    /*
    Apa itu library Function?
        Library Function merupakan sekumpulan fungsi bawaan KOTLIN STANDART LIBRARY yang dapat digunakan
        untuk menerapkan suatu komponen dengan cara yang sederhana dengan memanfaatkan Lambda Expression
     */
}