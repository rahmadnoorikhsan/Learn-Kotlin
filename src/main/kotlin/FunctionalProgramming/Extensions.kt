package FunctionalProgramming

fun main() {
    // 10.printInt()
    // println(10.plusThree())
    println(10.slice)
}

/*
fun Int.printInt(){             //Extension Function
    print("value $this")
}
*/

/*
fun Int.plusThree(): Int{       //Jika extension functions tersebut dapat mengembalikan nilai, deklarasinya pun sama halnya seperti fungsi pada umumnya.
    return this +3
}
 */

val Int.slice5: Int              //Extension Properties
    get() = this/2
