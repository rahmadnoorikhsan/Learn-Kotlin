package FunctionalProgramming

//"Function type" dapat membuat sebuah fungsi menjadi tipe data.

typealias Arithmetic = (Int, Int) -> Int
val sum: Arithmetic = {valueA, valueB -> valueA * valueB }
val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
//"typealias" cocok digunakan ketika kita mempunyai sebuah function type yang panjang. Dengannya, kita bisa memberikan nama untuk sebuah function type dan menggunakannya sebagai tipe untuk fungsi lainnya.

//Untuk membuat instance dari sebuah function type, terdapat beberapa cara. Salah satunya kita bisa memanfaatkan operator invoke() seperti berikut:
val sumResult = sum.invoke (10,10)      //kita bisa menghilangkan invoke()
val multiplyResult = multiply//.invoke(20,20)

//Kita juga bisa menandai function type sebagai nullable dengan menempatkan didalam tanda kurung dan diakhiri dengan safe call
typealias Arithmetic1 = ((Int, Int) -> Int)?
val sum1 : Arithmetic1 = { valueA,valueB -> valueA + valueB}
//berikut adalah contoh penggunaan function type yang ditandai sebagai nullable
    /*
        sum1?.invoke(10,20)
    */