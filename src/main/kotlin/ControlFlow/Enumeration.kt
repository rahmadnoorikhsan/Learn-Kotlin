package ControlFlow

fun main() {
    /*
    val colorRed = 0xFF0000
    val colorGreen = 0x00FF00
    val colorBlue = 0x0000FF
    */

    //nilai dari beberapa variabel diatas berpotensi salah atau tertukar dengan nilai variabel lain. untuk meminimalisir kesalahan, kita memerlukan Enumeration
    val colorMerah = ColorAll.RED
    val colorHijau = ColorAll.GREEN
    val colorBiru = ColorAll.BLUE
    val colorGold = ColorAll.GOLD
    val colorPink = ColorAll.PINK

    //Mendapatkan Daftar dari objek enum
    val colors: Array<ColorAll> = ColorAll.values()
    colors.forEach {color ->
        println("$color")
    }

    //Mendapatkan nama dari objek enum
    val color: ColorAll = ColorAll.valueOf("GOLD")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")

    //mendapatkan daftar objek enum dan nama objek enum dengan cara umum dengan enumValue dan enumValueOf
    val colorEnum: Array<ColorAll> = enumValues()
    colorEnum.forEach { colored ->
        println(colored)
    }

    val colorValue: ColorAll = enumValueOf("GOLD")
    println("Color is $colorValue")
    println("Color value is ${color.value.toString(16)}")

    //Konsep enum sama seperti array, kita bisa mengetahui posisi dengan "ordinal"
    val colorGoldPosition: ColorAll = ColorAll.GOLD

    println("Position Gold is ${colorGoldPosition.ordinal}")

    //Untuk mengecek instance enum itu sendiri menggunakan WHEN EXPRESSION
    when(colorBiru){
        ColorAll.RED -> print("Color is Red")
        ColorAll.GREEN -> print("Color is Green")
        ColorAll.BLUE -> print("Color is Blue")
        ColorAll.GOLD -> print("Color is Gold")
        ColorAll.PINK -> print("Color is Pink")
    }
}
enum class ColorAll(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    GOLD(0xFFD700),
    PINK(0xFFC0CB)
    }

    //Kita bisa mendefinisikan sebuah Kelas Enum menggunakan kata kunci enum dan setiap objek yang berada didalamnya dipisahkan oleh koma(,).
    //Objek yang berada di dalam Enum secara implisit bersifat "static" dan "final" sehingga tidak dapat mengubahnya setelah dideklarasikan
    /*
        contoh implementasi paling mendasar dari Enum:

        enum class Color{
            RED,GREEN,BLUE
        }
     */
    //objek yang telah didefinisikan menjadi tipe data Enum dapat mengakses "attribute" atau "method" didalam kelas Enum itu sendiri
    //Konsep ini sama halnya seperti Array. Bedanya, Enum berbentuk constant. Berikut contoh ketika kita ingin mengakses objek yang berada didalam kelas Enum:
/*fun main() {
    val color : Color = Color.RED
    print(color)
}

enum class Color{
    RED,GREEN,BLUE
}
 */
    //Setiap objek yang dideklarasikan merupakan instance dari kelas Enum tersebut. Kita bisa menginisialisasinya seperti berikut :
/*
enum class Color (val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
 */
    //Selain itu, kita juga dapat mendeklarasikan anonymous class untuk setiap objek Enum, misal :
/*
enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue(){
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}
 */
    //Setiap enum class memiliki sebuah synthetic method yang memungkinkan kita mendapatkan daftar objek Enum dan nama dari tiap Enum itu sendiri.
/*fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }
}

enum class Color(val value: Int) {
    RED(0xff0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

    //output : RED, GREEN, BLUE
 */

    //Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi "values()". Sedangkan untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi "valueOf()"
/*fun main() {
    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

    output:
        Color is Red
        Color value is ff0000
 */

    /*
    Anda juga bisa mendapatkan property yang didalam class Color seperti contoh "value" pada kode di atas dengan cara "color.value" Khusus pada kasus diatas, kita menambahkan toString(16) untuk menampilkan angka yang berupa HexaDesimal
    Saat menggunakan "valueOf()", perhatikan argumen yang kita masukkan ke dalam fungsi tersebut. Jika argumen yang kita masukkan tidak sama dengan salah satu objek enum makan akan terjadi kesalah "IllegalArgumentException"
    */

    //Selain "values()" dan "valueOf()", kita bisa mendapatkan daftar objek Enum dan nama dari objek enum dengan cara yang lebih umum. dengan fungsi "enumValues()" dan "enumValueOf"

/*fun main() {
    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

    output:
        RED
        GREEN
        BLUE
        Color is RED
     */

    //Konsep Enumeration sama seperti Array. Selain mendapatkan daftar dan nama, kita juga bisa mendapatkan posisi tiap objek menggunakan properti "ordinal"

/*fun main() {
    val color: Color = Color.GREEN

    print("Position GREEN is ${color.ordinal}")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

    //output : Position GREEN is 1
 */

    //diatas telah disebutkan bahwa setiap ojek merupakan instance dari enum class yang kita definisakan. Lantas bagaimana cara kita mengecek instance dari Enum itu sendiri? untuk mengeceknya gunakan "When Expression"
    /*
    val color: Color = Color.GREEN

    when(color) {
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
*/
    //Ketika menggunakan "when" untuk mengecek instance dari enum, lebih baik masukan setiap objek enum yang kita definisikan. Jika kita melewatkan salah satu objek, peringatan berikut akan muncul: 'when' expression on enum is recommended to be exhaustive