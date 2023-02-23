package CoroutineDispatcher

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titikk penangguhan.
//Stelah penangguhan, coroutines akan dilanjutkan pada thread dimana komputasi penangguhan yang dipanggil.
//Sebagai contoh, ketika fungsi a memanggil fungsi b, yang dijalankan dengan dispatcher dalam thread tertentu, fungsi a akan dilanjutkan dalam thread yang sama dengan fungsi b dijalankan
fun main() = runBlocking{
    launch ( Dispatchers.Unconfined ) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}   //Artinya, coroutine telah dimulai dari main thread, kemudian tertunda oleh fungsi delay selama 1 detik. Setelah itu, coroutine dilanjutkan kembali pada thread DeafultExecutor

//Bersamaan dengan objek-objek tersebut, ada beberapa builder yang dapat digunakan untuk menentukan thread yang dibutuhkan:

//SINGLE THREAD CONTEXT

//Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang anda tentukan.
//Untuk menerapkannya, anda bisa memanfaatkan newSingleThreadContext()

/*
fun main() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch (dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}
 */
//Walaupun sudah menjalankan fungsi delay, coroutine akan tetap berjalan pada myThread

//THREAD POOL

//Sebuah dispatcher yang memiliki kumpulan thread.
//Ia akan memulai dan melanjutkan coroutine di salah satu thread yang tersedia pada kumpulan tersebut.
//Runtime akan menentukan bagaimana proses distribusi bebannya.
//Anda bisa menerapkan thread pool dengan fungsi newFIxedThreadPoolContext seperti berikut:

/*
fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch (dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}   //Pada kode di atas, kita telah menetapkan thread myPool sebanyak 3 thread. Runtime akan secara otomatis menentukan pada thread mana coroutine akan dijalankan dan dilanjutkan.
 */