//Ketika melakukan perulangan, terkadang kita dihadapkan dengan data yang tidak sesuai harapan. COntoh:
fun main() {
    val ngelist = listOf(1,2,3,null,5,null,7)
    for (i in ngelist) {
//        if (i == null) continue
        print(i)
    }
    //output : 123null5null7
    //proses perulangan pada kode diatas akan menghasilkan nilai null. Jika kita mengelola nilai tersebut, ada potensi NullPointerException disana. Untuk melewatkan atau menghentikan proses perulangan yang bernilai null, kita bisa menggunakan Break dan COntinue

    /*
        Continue digunakan untuk melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya. Sementara itu, Break digunakan untuk menghentikan proses iterasi
     */
    //Berikut adalah contoh proses iterasi pada kode diatas. Kita akan coba melewatkannya jika nilai yang dihasilkan adalah null
    val ngelistya = listOf(1, 2, 3, null, 5, null, 7)

    for (i in ngelistya) {
        if (i == null) continue
        println(i)
    }
    //Kode diatas kita menggunakan kata kunci continue. Jika hasil evaluasi expression yang bernilai true, maka proses iterasi akan dilewatkan dan lanjut ke proses iterasi berikutnya.

    //Contoh jika kita ingin menghentikan proses iterasi ketika nilai yang dihasilkan bernilai null
    val ngelistcok = listOf(1, 2, 3, null, 5, null, 7)

    for (i in ngelistcok) {
        if (i == null) break
        println(i)
    }
    //Penggunaan break pada kode diatas akan langsung menghentikan proses iterasi jika variabel i bernilai null

    /*
        BREAK DAN CONTINUE LABELS
     */
    //Pada KOtlin, sebuah expression dapat ditandai dengan sebuah label. Label pada kotlin memiliki sebuah identifier yang diikuti dengan tanda @. COntoh dari sebuah label adalah foo@ atau bar@

    //Untuk melabeli sebuah expression, kita cukup menempatkan label di depannya. COntoh:
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if (j > 2) break@loop
        }
    }
    //Pada kode diatas, break yang sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan label. Break akan menghentikan proses perulangan terluar dari dalam proses perulangan, dimana break tersebut dipanggil
}
