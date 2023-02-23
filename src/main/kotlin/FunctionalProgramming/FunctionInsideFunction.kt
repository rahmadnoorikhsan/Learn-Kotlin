package FunctionalProgramming

//Innerfunction
fun setWord(message: String) {
    fun printMessage() {
        println(message)
    }

    printMessage() //Didefinisikan didalam fungsi setWord()
}
//Inner Function sebagai Extensions Function
fun sum(valueA: Int,valueB: Int, valueC: Int): Int{
    fun Int.validateNumber(){
        if(this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }
    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}

fun multication(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.valueNumber(){
        if(this == 0){
            throw IllegalArgumentException("value must be better 0")
        }
    }

    valueA.valueNumber()
    valueB.valueNumber()
    valueC.valueNumber()

    return valueA * valueB * valueC
}

fun main() {
    println(multication(10, 5,20))
}