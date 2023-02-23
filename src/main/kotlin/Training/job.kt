import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking{
    val job = launch(start = CoroutineStart.LAZY) {
        delay(5000L)
        println("Start New job!")
    }

    delay(1000L)
    job.cancel(cause = CancellationException("Time's up!"))
    println("Job cancelling...")
    if(job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}