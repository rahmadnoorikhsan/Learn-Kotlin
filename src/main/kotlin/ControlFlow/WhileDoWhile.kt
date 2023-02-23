//WHILE
fun main() {
    var ulang = 1
    while (ulang <= 7){
        println("Hello, World!")
        ulang++
    }

    var selamat = 1
    while(selamat <= 100){
        println("Selamat")
        selamat++
    }

    var halo = 1
    while (halo <= 20){
        println("halo")
        halo++
    }
    /*
    Output :    Hello, World!
                Hello, World!
                Hello, World!
                Hello, World!
                Hello, World!
                Hello, World!
                Hello, World!
     */
//Selama nilai dari variabel counter kurang dari sama dengan 7, maka kode yang didalamnya akan terus dilakukan. lalu ketika kondisi tersebut sudah tak terpenuhi maka proses perulangan akan dihentikan

//While bersifat "ENTRY CONTROLLED LOOP". Artinya kondisi yang diberikan akan dievaluasi terlebih dahulu. Jika kondisi terpenuhi maka proses perulangan akan dihentikan

//Jika kondisi yang diberikan tidak terpenuhi sejak awal maka proses perulangan tidak akan dijalankan

    var ulang2 = 8
    while (ulang2 <= 7){
        println("Hello, World")
        ulang2++
    }


//Dengan while kita tidak perlu menuliskan fungsi println() secara berulang untuk mencetak teks ke dalam konsol

//DO WHILE
    var ulangdo = 1
    do {
        println("Hello, World!")
        ulangdo++
    } while (ulangdo <= 7)

    var hai = 1
    do{
        println("Hai")
        hai++
    } while (hai <= 100)

    var infinite = 1
    do{
       print(infinite)
    } while (infinite < 2)

//Do While bersifat Exit Controlled Loop dimana proses perulangan akan langsung dijalankan di awal. jika telah selesai, barulah kondisi yang diberikan akan dievakuasi

//Saat menggunakan While dan Do While perhatikan infinite loop, yaitu Kondisi dimana proses perulangan berlangsung terus menerus sampai aplikasi menjadi crash. Contoh infinite loop
//    var huruf = 'A'
//    do {
//        print(huruf)
//    } while (huruf <= 'Z')
}
//infinite loop terjadi jika kondisi yang diberikan selamanya terpenuhi atau bernilai true
//While do while sendiri tidak dapat digunakan untuk melakukan perulangan pada rentan angka. Untuk melakukannya kita bisa menggunakan For Loop