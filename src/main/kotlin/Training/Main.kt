fun main(args: Array<String>) {
    println("Hello World!")

    val fullName = getFullName(middle = "Nur")
    println(fullName)

    val sumNumber = numberSum(10, 21)
    println(sumNumber)

    println("Rahmad ".printString())

    val value: Int? = null

    println(value?.printInt)
    println(numbe?.invoke(0, 0))

    val messageLength = name("Aku Ganteng")
    println("Length Character $messageLength")

    printResult(10) {value ->
        value + value
    }

    printResult(20) {value ->
        value * value
    }
}

fun getFullName(
    first: String = "Rahmad",
    middle: String = "Noor",
    last: String = "Ikhsan"): String {
    return "$first, $middle, $last"
}

fun numberSum (vararg number : Int): Int{
    return number.sum()
}

fun String.printString(): String{
    return this + "Clever"
}

val Int.printInt: Int
    get() = this.div(2)

typealias Arithmetic = ((Int , Int) -> Int)?
val numbe: Arithmetic = { valueA, valueB -> valueA + valueB }

val name = { message: String -> message.length }

inline fun printResult (value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    print(result)
}
