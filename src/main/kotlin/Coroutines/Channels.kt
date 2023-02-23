package Coroutines

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//Channels adalah nilai deffered yang menyediakan cara mudah untuk mentrasnfer nilai tunggal antara coroutine.
//Pada dasarnya, channels sangat mirip dengan BlockingQueue. Namun, alih-alih memblokir sebuah thread, channels menangguhkan sebuah coroutine yang jauh lebih ringan.

fun main() = runBlocking(CoroutineName("main")){
    val channel = Channel<Int>()
    launch (CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")     //mengirimkan nilai dari hasil komputasi dengan menggunakan fungsi send
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) { println(channel.receive()) }    //Di coroutine lain (main) channel menerima nilai dengan menggunakan fungsi receive
    println("received in ${Thread.currentThread().name}")
}   //Kesimpulannya, channels memungkinkan komunikasi yang aman antar kode concurrent. Ia mwmbuat kode concurrent dapat berkomunikasi dengan mengirim dan menerima pesan tanpa harus peduli di thread mana coroutine berjalan.