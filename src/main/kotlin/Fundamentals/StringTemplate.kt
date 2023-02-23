fun main() {
    //Stirng template merupakan sebuah fitur yang memungkinkan kita untuk menyisipkan sebuah variabel ke dalam sebuah string tanpa concatenation (penggabungan objek String menggunakan +)
    /*
    val name = "Kotlin"
    print("My name is " + name)

    //output : My name is Kotlin
     */

    //String Template hanya perlu menambahkan variabel dengan "$"
    val name = "Kotlin"
    println("My name is $name")

    //Kita juga bisa menyisipkan objek lain misal Int atau Double
    val nama = "Kotlin"
    val old = 3
    println("My name is $nama, im $old years old")

    val address = "Wonosobo"
    val numberHome = 12
    println("My address is $address, My home is number $numberHome")

    //Kita juga bisa menyisipkan sebuah expression, sisipkan expression ke dalam curly braces yang diikuti karakter "$"
    val hour = 7
    println("Office ${if(hour > 7) "already close" else "is Open"}")

    val Time = 12
    println("It is ${if(Time > 12) "$Time Pm" else "$Time Am"}")

    val have = 5
    println("I'm ${if (have > 2) "Rich" else "poor"}")
    //dengan string template kita lebih mudah membuat objek String yang dinamis
}