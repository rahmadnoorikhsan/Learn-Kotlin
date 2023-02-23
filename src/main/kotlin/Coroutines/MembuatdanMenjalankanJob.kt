package Coroutines

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//Job dapat diinisialisasikan menggunakan fungsi launch() maupun job()

//Menggunakan launch()
/*
fun main() = runBlocking {
    val job = launch (start = CoroutineStart.LAZY){
        TODO("Not implemented yet!")
    }
}
 */

//Menggunakan Job()
/*
fun main() = runBlocking {
    val job = Job()
}
 */

//Saat membuat sebuah job, kini kita bisa mulai menjalankan job tersebut.
//Caranya pun cukup sederhana, kita bisa menggunakan fungsi start() seperti berikut
fun main() = runBlocking{
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start() //Atau bisa juga dengan menggunakan fungsi join()
    println("Other task")
}   //Perbedaan dari keduanya adalah bahwa yang start() akan memulai job tanpa harus menunggu job tersebut selesai.
    //sedangkan join() akan menunda eksekusi sampai job selesai

/*
    Output start():
        Other task
        Start new job!
 */

/*
    Output join() :
        Start new job!
        Other task
 */