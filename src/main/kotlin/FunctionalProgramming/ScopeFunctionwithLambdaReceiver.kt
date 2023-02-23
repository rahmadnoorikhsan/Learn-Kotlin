package FunctionalProgramming

//RUN akan mengembalikan nilai berdasarkan expression yang berada didalam blok Lambda.
//Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
//Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisai objek dan perhitungan untuk nilai kembalian. Contoh
fun main() {

    val text = "Halo"
    val resultRun = text.run {
        val from = this
        val to = this.replace("Halo", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $resultRun")


//WITH bukanlah sebuah extension melainkan hanyalah fungsi biasa.
//Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver. Contoh
    val message1 = "Hello Kotlin!"
    val resultWith = with(message1) {
        println("value is $this")
        println("With length ${this.length}")
    }

//Nilai yang akan dikembalikan adalah berdasarkan expression yang berada di dalam blok lambda. Contoh
    val resultWith2 = with(message1) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(resultWith2)
    //Fungsi With disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan nilai kembalian

//APPLY adalah nilau dari konteks objeknya dan objek konteksnya tersedia sebagai receiver(this).
//Baiknya fungsi Apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya. Perhatikan kode berikut:
    val messageApply = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }
    println(messageApply.toString())
}
