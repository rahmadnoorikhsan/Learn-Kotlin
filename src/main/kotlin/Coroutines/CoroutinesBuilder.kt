package Coroutines

//fungsi async digunakan untuk memulai sebuah coroutine yang akan mengembalikan sebuah hasil.
//Ketika menggunakannya harus hati-hati karena ia akan menangkap setiap exception yang terjadi di dalam coroutine.
//jadi async akan mengembalikan Deferred yang berisi hasil atau exception
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}
suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

/*
fun main() = runBlocking {
    val capital = async { getCapital() }    //memanggil getCapital dan getIncome didalalam async
    val income = async { getIncome() }      //Maka async akan mengembalikan hasil dari masing-masing fungsi. Lalu untuk mengakses hasil tersebut, kita perlu menggunakan fungsi await
    println("Your profiy is ${income.await() - capital.await()}")
}
 */

fun main() = runBlocking{
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
}   //Kode yang dijalankan didalam async bisa selesai hampir 2 klai lebih cepat dibandingkan tanpa async!