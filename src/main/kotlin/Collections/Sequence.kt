package Collections

// Sequence merupakan collection yang bisa dikategorikan ke dalam lazy evaluation. Jika eager evaluation hanya akan mengevaluasi item jika benar-benar diperlukan.
// Misalnya anda mempunyai collection dengan jumlah data 10 atau 100, itu mungkin tidak akan memberi pengaruh besar terhadap performa program. Namun apa yang terjadi jika data yang ada pada collection mencapai ratusan ribu atau jutaan? Waktu program akan betambah signifikan jika semua datanya harus dievaluasi
fun main() {
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2}.forEach{ println(it)}

    // Contoh diatas, kita memiliki data collection sejumlah 1 juta item, kemudian masing-masing data akan disaring berdasarkan angka yang merupakan kelipatan 5 lalu dikalikan 2 dan akhinya ditampilkan pada konsol. Dengan eager evaluation atau dikenal dengan horizontal evaluation, list akan menyelesaikan proses filter terhadap 1 juta data baru kemudian melakukan mapping data sampai akhirnya ditampilkan di konsol

    // Untuk menerapkan lazy atau vertical evaluation maka kita perlu mengubah list menjadi sequence. Caranya sangat sederhana yaitu dengan memanggil fungsi asSequence()
    val list1 = (1..1000000).toList()
    list1.asSequence().filter { it % 5 == 0}.map { it * 2 }.forEach { println(it) }

    // Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1. Karena tidak memenuhi kondisi pada filter maka operasi tidak akan dilanjutkan ke map(). Sampai dengan iterasi ke-5 akan dilakukan mapping, angka 5 akan dikalikan 2 dan ditampilkan pada konsol, setelah itu akan dilanjutkan ke iterasi berikutnya sampai dengan iterasi ke-1 juta

    // Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library yaitu generateSequence()
    val sequenceNomor = generateSequence (1) { it + 1 }
    // Pada kode diatas kita telahg membuat variabel sequenceNomor dengan menuliskan generateSequence() fungsi ini memiliki 2 parameter. Parameter pertama adalah item pertama yang ada didalam collection. Parameter kedua adalah lambda expression berisi perubahan pada masing-masing item.
    // Pada contoh kode tadi, setiap item merupakan item sebelumnya ditambah 1. Fungsi generateSequence() akan membuat collection sequence secara tak terbatas. Alhasil, kita perlu menambahkan fungsi take() supaya program tidak mengalami infinite loop
    val sequenceNomorCopy = generateSequence (1) { it + 1 }
    sequenceNomorCopy.take(5).forEach { print("$it ") }
}