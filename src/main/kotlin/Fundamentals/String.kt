fun main() {

    //String berebntuk array, sehingga kita bisa mendapatkan karakter tunggal dengan mudah. caranya memanfaatkan indexing seperti berikut
    val text = "kotlin"
    val firstChar = text[0]
    val secondChar = text[1]

    println("First character of $text is $firstChar, and Second character of $text is $secondChar")

    //melakukan iterasi terhadap objek string dengan menggunakan for-loop
    for (char in text) {
        print("$char ")
    }

    /*
    Kotlin memiliki 2 jenis tipe Literal String
       -Escaped String
           yang memungkinkan kita untuk mengurangi ambiguitas nilai yang berbeda di dalam sebuah string
     */
    /*
        val statement = "Kotlin is Awesome!"
        kemudian kita akan menambahkan tanda petik ganda di dalam sebuah string spt brkt
        val statement = "Kotllin is "Awesome!"""
        maka akan terjadi ambiguitas nilai pada variabel statement karena kompiler tidak dapat mengetahui akhir dari baris nilai untuk variabel statement
     */
    //untuk mengatasi hal tersebut maka bisa menggunakan escaped dengan menambahkan karatker backslash (\)
    val statement = "Kotlin is \"Awesome!\""
    println(statement)
    /*
    escaped selain \"
    -\t : menambah tab kedalam teks
    -\n : membuat baris baru di dalam teks
    -\' : menambah karakter single quote kedalam teks
    -\" : menambah karakter double quote kedalam teks
    -\\ : menambah karakter backslash kedalam teks
     */
    //Unicode
    val nama = "Unicode test: \u00A9"
    println(nama)
    /*
        -Raw String
             yang memungkinkan kita menuliskan multiline dan arbitrary text
        Ketika ingin membuat beberapa baris string biasanya kita melakukan escaped terhadap string dengan memanfaatkan karakter escape "\n"
        contoh :

    val line = "line 1\n" +
            "Line 2\n" +
            "Line 3\n" +
            "Line 4\n"
     */
    //Dengan Raw String kita dapat membuat dengan lebih mudah

    val line = """
        Kotlin 
        Itu
        Menantang
        Adrenaline
        """.trimIndent()

    print(line)
}