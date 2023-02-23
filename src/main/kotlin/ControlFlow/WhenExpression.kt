import kotlin.random.Random

//Selain IF EXPRESSION untuk menentukan statement dan expression, kita juga bisa gunakan WHEN EXPRESSION, yakni mekanisme yang memungkinkan nilai dari sebuah variabel/expression, mampu mengubah alur program

//contoh sederhana WHEN EXPRESSION
/*
fun main() {
    val value = 7
    //else akan dievaluasi jika tiada satupun kondisi yang terpenuhi pada branch sebelumnuya. Sama halnya seperti if exp, when exp dapat mengembalikan nilai dan dapat disimpan didalam sebuah variabel
    val stringOfValue = when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        //When akan mencocokan semua argumen yang berada di setiap branch berurutan sampai salah satu kondisi terpenuhi
        else -> "value cannot be reached" //When juga bisa menambahkan branch else
    }
    println(stringOfValue)
}

    //output : value is 7
 */
//else adalah hal wajib jika kita menggunakan When exp untuk mengembalikan nilai. Bagaimana jika kita melewatkannya? Akan tampil eror berikut:
//'when' expression must be exhaustive, add necessary 'else' branch

//jika memiliki dua atau lebih baris kode yang akan kita jalankan disetiap branch, kita bisa memindahkannya ke dalam curly braces

/*
fun main() {

    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undifined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)
}

        //output :
        //        Seven
        //        value is 7

 */

//when juga memungkinkan kita memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is atau !is
/*
fun main() {
    val anyType : Any = 100L
    when (anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}
 */
    // output : the value has a Long type

//When exp juga bisa memeriksa nilai yang terdapat pada sebuah RANGE atau COLLECTION.
//RANGE = tipe data yang dapat menentukan nilai awal dan akhir

/*
fun main() {
    val value = 27
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range") //memeriksa apakah nilai dari value terdapat di cangkupan nilai ranges
        !in ranges -> println("value is outside the range") //memeriksa apakah nilai dari value tidak terdapat pada nilai yang dicakup oleh ranges
        else -> println("value undefined") //mengevaluasi jika dua kondisi sebelumnya tidak terpenuhi
    }
}

    //output : value is in the range

 */

//Menangkap subjek dari when exp didalam sebuah variabel

/*
fun main() {
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}

fun getRegisterNumber() = Random.nextInt(100)
 */

//Contoh when exp diatas memiliki kesamaan dengan if exp. If exp sebaiknya digunakan ketika kondisi yang diberikan tidak lebih dari 2 dan kondisi yang diberikan tidak terlalu rumit

/*
val anyType : Any = 100L
if (anyType is Long){
    println("the value has a Long type")
} else {
    println("the value is not Long type")
}
 */

//Berbeda dengan When exp, ia bisa digunakan ketika kondisi yang diberikan lebih dari 2
//fun main() {
//    val anyType : Any = 100L
//    when (anyType) {
//        is Long -> println("the value has a Long type")
//        is Int -> println("the value has a Int type")
//        is Double -> println("the value has a Double type")
//        else -> println("undefined")
//    }
//}

fun main() {
    val number = 35

    val stringOfValue = when (number) {
        30 -> {
            print("Thirty ")
            "Is 30"
        }
        31 -> {
            print("Thirty one ")
            "Is 31"
        }
        32 -> {
            print("Thirty two ")
            "Is 32"
        }
        else -> {
            print("Undenifed ")
            "Number cannot be reached"
        }
    }

    println(stringOfValue)

    // menentukan tipe data menggunakan is dan !is
    val anyType: Any = 0.123F

    when(anyType) {
        is Float -> println("Yes, this is Float")
        is Int -> println("Yes, this is Integer")
        else -> println("undenifed")
    }

    // memeriksa nilai menggunakan range dan collection
    val num = 400
    val range = 10..100

    when (num) {
        in range -> println("Number in range")
        !in range -> println("Number outside range")
    }

    //Sejak kotlin 1.3, kita bisa menangkap subjek when expression didalam variabel
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    val logInNumber = when(val logIn = getLogInNumber()){
        in 1..10 -> 10 * logIn
        in 11..20 -> 20 * logIn
        else -> logIn
    }
}

fun getRegisterNumber() = Random.nextInt(50)
fun getLogInNumber() = Random.nextInt(100)