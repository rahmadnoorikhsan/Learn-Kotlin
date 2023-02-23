import Coroutines.getCapital
import Coroutines.getIncome
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    val timeTwo = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your proft is ${income - capital}")
    }
    println("Complete in $timeTwo ms vs $timeOne ms")
}