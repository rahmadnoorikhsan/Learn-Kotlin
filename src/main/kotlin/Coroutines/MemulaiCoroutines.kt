package Coroutines
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{   //fungsi runBlocking untuk memulai coroutine utama
    launch {    //fungsi launch untuk menjalankan coroutine baru
        delay(1000L)    //menunda kode berikutnya selama 1 detik    //delay adalah fungsi yang spesial pada coroutines. Ia merupakan sebuah suspending function yang tidak akan memblokir sebuah thread
        println("Coroutines!")
    }   //Selama proses penundaan tersebut, main thread akan terus berjalan sehingga fungsi println("Hello,") akan langsung dijalankan. Setelah 1 detik, baru fungsi println("Coroutines!") akan dijalankan.
    println("Hello,")
    delay(2000L)    //digunakan untuk menunda selama 2 detik sebelum JVM berakhir
}