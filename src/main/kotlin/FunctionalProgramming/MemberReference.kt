package FunctionalProgramming

//Kita bisa memisahkan lambda exression menjadi fungsi tersendiri dan mereferensikannya langsung sebagai instance dari function type dengan cara seperti dibawah
val sumsum: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB
: Int): Int {
    return valueA + valueB
}
//Kode diatas ditulis dengan mekanisme Reflection yang berarti seperangkat fitur bahasa dan library yang memungkinkan kita untuk mengamati struktur kode dari proyek yang sedang kita kerjakan secara langsung

//FUNCTION REFERENCE
/*
fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber) //Dengan menggunakan :: kita bisa menggunakannya sebagai instanes dari function type.
                                                     //Penggunaan fungsi filter() yang menjadi bagian dari kelas List
    println(evenNumbers)
}
 */
//fun isEvenNumber(number: Int) = number % 2 == 0 //memeriksa apakah suatu angka merupakan sebuah bilangan genap
fun Int.isEvenNumber() = this % 2 == 0 //Bisa mereferensikan sebuah extensions function. Dengan ikut menyertakan objek yang menjadi receivernya sebelum operator ::

//PROPERTY REFERENCE

//Selain digunakan untuk mereferensikan sebuah fungsi.
//Operator :: juga dapat digunakan untuk mereferensikan sebuah properti.
//Dengan operator, kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti nama, fungsi setter getter, dll.Contoh
var message ="Kotlin" //Properti yang bersifat immutable, ::message akan mengembalikan nilai dengan tipe KProperty, yang mana hanya terdapat fungsi get() didalamnya

fun main() {
    println(::message.name) //Ekspresi ::message akan dievaluasi ke dalam objek dengan KMutableProperty yang memungkinkan kita untuk membaca nilainya dengan menggunakan get(), menetapkan nilai menggunakan set() dan mendapatkan nama dari properti tersebut menggunakan properti name
    println(::message.get())

    ::message.set("Kotlin Academy") //<- Error : Unresolved reference.

    println(::message.get())
}