package Collections

//MAP adalah sebuah collection yang dapat menyimpan data dengan format key-value.
fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia", //String kanan = Key //String kiri = Value
        "London" to "England",
        "New Delhi" to "India"
    )
    //Kita bisa menggunakan key"Jakarta" untuk mendapatkan value "Indonesia"
    println(capital["Jakarta"])
    //Atau bisa juga menggunakan fungsi getValue():
    println(capital.getValue("Jakarta"))

    //Saat menggunakan indexing"[]" konsol akan menampilkan hasil null saat key yang dicari tidak ada didalam Map.
    println(capital["Amsterdam"])
    //Sedangkan saat kita menggunakan getValue(),konsol akan memberikan sebuah Exception.
//    println(capital.getValue("Amsterdam"))

    //Kita dapat menampilkan key apa saja yang ada didalam Map dengan menggunakan fungsi keys(). Fungsi ini akan mengembalikan nilai berupa Set karena key pada Map haruslah unik.
    val mapKeys = capital.keys
    //mapValues: [Indonesia, England, India]

    //Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa map yang digunakan adalan mutable.
    val mutableCapital = capital.toMutableMap(
    )
    //Selanjutnya kita bisa menambahkna key-value baru menggunakan fungsi put()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin","Germany")

    /*
    Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan.
    Apabila terdapat sebuah mutable collection yanng diubah oleh lebih dari 1 proses, hasilnya akan sulit di prediksi.
    Untuk itu, sebaiknya gunakan immutable sebisa mungkin, jika memang dibutuhkan untuk diubah, baru gunakan mutable
    */

    val mySelf = mapOf(
        "Nama" to "Rahmad Noor Ikhsan",
        "Nim" to 2020150098,
        "Prodi" to "Teknik Informatika"
    )

    println(mySelf["Nama"])
    println(mySelf["Universitas"])
    println(mySelf.keys)
    println(mySelf.values)

    val mutableMySelf = mySelf.toMutableMap()

    mutableMySelf.put("Universitas", "UNSIQ")
    mutableMySelf.put("Kabupaten", "Wonosobo")
    print(mutableMySelf["Universitas"])
    print(mutableMySelf.values)
}
