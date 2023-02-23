//Range dapat menentukan nilai awal dan akhir. Range dipresentasikan dengan operator (..) atau dengan fungsi rangeTo() dan downTo()
/*
    val kiraInt = 1..10
 */
//variabel kiraInt diatas mencakup nilai 1,2,3,4,5,6,7,8,9,10. Jarak antara dua nilai yang dicakup, ditentukan oleh step. Secara default, step bernilai 1.

//Untuk mendapatkan step kita bisa menggunakan properti atep seperti ini:
fun main() {
    val noUrut = 1..10
    println(noUrut.step)

    val stepNumber = 1..100 step 4
    println(stepNumber.step)

    //UNtuk mengubah nilai dari step bisa dilakukan seperti kita menginisialisasi nilai yang dicakup Range itu sendiri
    val noUndi = 1..10 step 3
    noUndi.forEach {
        print("$it ")
    }
    println(noUndi.step)

    //rangeTo()
    val nomor = 1.rangeTo(10)
    val numberRange = 1.rangeTo(100)
    numberRange.forEach{
        print("$it ")
    }
    println(numberRange)
    //operator (..) digantikan dengan fungsi rangTo()

    //downTo()
    val belakang = 10.downTo(1)
    belakang.forEach{
        print("$it ")
    }
    println(belakang)
    //downTo() untuk menentukan nilai dengan urutan terbalik (10,9,8,7,6,5,4,3,2,1)

    //kita juga bisa memeriksa apakah suatu nilai ada pada cakupan nilai Range
    val cari = 10.downTo(1)
    val no = 11
    if (no in cari) {
        println("nomor $no ada diantara 1-10")
    } else {
        println("nomor $no tidak ada diantara 1-10")
    }
    //kata kunci in memeriksa apakah 7 berada diantara kisaran 1 sampai 10

    //Expression yang dievaluasi pada if diatas sama seperti ketika menggunakan expression berikut:
    if (1 <= 7 && 7 <= 10) {
        println("nomor 7 ada diantara 1-10")
    }

    if (1 <= 8 && 8 <= 10) {
        println("nomor 8 ada di antara 1-10")
    }
    //Diatas kita telah memeriksa apakah suatu nilai ada pada cakupan Range.

    //kita juga bisa memeriksa apakah suatu nilai tidak ada pada nilai cakupan Range tersebut
    //Menggunakan kunci !in
    val turun = 10.downTo(1)
    if(11 !in turun) {
        println("Tidak ada 11 di Range")
    }

    if (10 !in turun) {
        println("Tebakan anda Benar")
    } else {
        println("Tebakan anda salah")
    }
    //Range pada KOTLIN mendukung beberapa tipe integral seperti IntRange, LongRange, dan CharRange.
    //Sehingga selain nilai numerik, kita juga bisa menentukan tipe Character sebagai nilai yang dicakup oleh Range
    val rangeKarakter = 'A'.rangeTo('F')
    rangeKarakter.forEach{
        print("$it ")
    }
    print(rangeKarakter)
    //Nilai pada variabel rangeKarakter diatas mencakup A,B,C,D,E,F
}