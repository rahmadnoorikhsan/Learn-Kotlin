package Coroutines

import kotlinx.coroutines.*

//Hanya job yang sedang aktif yang dapat dibatalkan. Anda bisa melakukan dengan memanggil fungsi cancel()
@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("time is up!"))    //parameter cause yang bisa digunakan untuk memberitahu kenapa sebuah job dibatalkan
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}