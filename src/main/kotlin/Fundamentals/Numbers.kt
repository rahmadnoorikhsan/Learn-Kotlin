fun main() {
    /*Int (32 Bit)
    Int adalah tipe data yang umumnya digunakan untuk menyimpan nilai numerik. Int dapat menyimpan data dari range -2^31 sampai +2^31-1. Dengan ukuran 32 Bit kita bisa menggunakannya untuk menyimpan nilai yang besar. Catatannya, tetap lihatlah batasan nilai maksimal yang dapat dimasukkan.
     */
    val intnumber = 100

    /*Long (64 Bit)
    Long adalah tipe data yang digunakan untuk menyimpan nilai numerik yang lebih besar yaitu dari range -2^63 sampai +2^63-1. Long bisa didefinisikan secara eksplisit:
     */
    val longNumber: Long = 100
    //atau dengan menambahkan suffix L seperti berikut:
    val longNumbers = 100L

    /*Short (16 Bit)
    Short merupakan sebuah bilangan bulat yang hanya dapat menyimpan nilai yang kecil karena hanya berukuran 16 Bit
     */
    val shortNumber: Short = 10

    /*Byte (8 Bit)
    Dengan ukuran yang kecil, Byte hanya mampu menyimpan nilai yang kecil sama halnya seperti Short. Byte biasa digunakan untuk keperluan proses membaca dan menulis data dari sebuah stream file atau jaringan
     */
    val byteNumber = 0b11010010

    /*Double (64 Bit)
    Sama halnya dengan Long yang memiliki ukuran yang besar, Double mampu menyimpan nilai numerik yang besar pula. Pada umumnya Double digunakan untuk menyimpan nilai numerik pecahan sampai dengan maksimal 15-16 angka di belakang koma
     */
    val douubleNumber = 1.3

    /*Float (32 Bit)
    Sama seperti Double, namun memiliki ukuran yang lebih kecil, yakni hanya sampai 6-7 angka di belakang koma
     */
    //val floatNumber: Float = 0.123456789f

    //Untuk mengetahui nilai maksimal tipe Number (MAX_VALUE) sementara nilai minimal (MIN_VALUE)
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val maxLong = Long.MAX_VALUE
    val minLong = Long.MIN_VALUE

    println(maxInt)
    println(minInt)
    println(maxLong)
    println(minLong)

    //jika kita memasukan nilai yang melebihi nilai maksimal, maka akan terjadi overflow. Nilai yang akan dikembalikan adalah nilai minimal yang dapat disimpan
    //val overRangeInt = Int.MAX_VALUE + 1 //This Operation has led to an overflow

    //println("Max Int: $maxInt")
    //println("Over range Int: $overRangeInt")

    //Output :
    //Max Int: 2147483647
    //Over range Int: -214783648

    //Operator Matematika
    val numberOne = 27
    val numberTwo = 10

    println(numberOne + numberTwo)
    println(numberOne / numberTwo) //hasil pembagian pada tipe Int akan dibulatkan kebawah

    //operasi perkalian dan pembagian didahulukan
    println(5+4*4)
    //jika ingin operasi 5+4 didahulukan gunakan tanda kurung
    println((5+4)*4)

    //Tidak bisa melakukan konversi secara langsung. Contoh konversi dari Byte ke Int
    /*
    val byteNumber: Byte = 1
    val intNumber: Int = byteNumber //compile error
     */

    //Untuk mengatasinya, lakukan konversi dengan bantuan beberapa fungsi seperti toInt() berikut:
    val byteNumberr: Byte = 100
    val intNumberr: Int = byteNumberr.toInt()

    println(intNumberr)
    /*
    Fungsi konversi yang dapat digunakan:
    - toByte()  : Byte
    - toShort() : Short
    - toInt()   : Int
    - toLong()  : Long
    - toFloat() : Float
    - toDouble(): Double
    - toChar()  : Char
     */

    //contoh lain
    val stringNomor = "23"
    val intNomor = 3

    println(intNomor + stringNomor.toInt())

    //Kotlin juga bisa menuliskan nilai numerik yang "readable" dengan menggunakan tanda underscores
    val readableNumber = 1_000_000
    print(readableNumber)
}