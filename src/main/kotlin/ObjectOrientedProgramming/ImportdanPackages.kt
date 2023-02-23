package ObjectOrientedProgramming

//Package digunakan untuk mengelompokkan kelas, fungsi dan variabel yang mempunyai kemiripan fungsionalitas
//val someInt = kotlin.random.Random(0).nextInt(1,10)
//Kode tersebut menunjukkan bahwa kelas Random berada pada package kotlin.random
//Untuk meminimalisir hal tersebut kita cukup mengimpor package kelas Random. Dengan begitu kita tidak perlu menuliskan kode yang panjang secara berulang

//Importing Package untuk mengimpor suatu package kelas, fungsi atau variabel
//import packagename. ClassName
//import packagename.functionName
//import packagename.propertyName

/*
import kotlin.random.Random
val someInt1 = Random(0).nextInt(1,10)
 */

import kotlin.math.PI   //Kita juga dapat megimpor seluruh kelas dengan mengganti 'PI' dengan '*'
import kotlin.math.cos as cosinus   //as digunakan ketika kita menggunakan sebuah kelas, fungsi, maupun variabel yang memiliki nama yang sama namun berbeda packagenya. Ini bertujuan untuk menghindari ambiguitas
import kotlin.math.sqrt as akar

fun main() {
    println(PI)
    println(cosinus(120.0))
    println(akar(9.0))
}
