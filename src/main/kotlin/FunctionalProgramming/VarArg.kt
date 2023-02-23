package FunctionalProgramming

fun main() {
    val nomor = sumNomor(10, 20, 30, 40)
    print (nomor)
}
fun sumNomor(vararg nomor: Int) : Int {
    return nomor.sum()
}

//Menerapkan tipe Generik untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg
fun<T> asList(vararg input: T) : List <T> {
    val result = ArrayList<T>()
    for(item in input)
        result.add(item)
    return result
}

/* //Karena pada dasarnya sebuah Array, maka kita bisa memanggil fungsi atau properti yang tersedia pada kelas Array dari dalam fungsi tersebut. Misal siza
fun main() {
    val nomor = getNomorSize(10,20,30,40)
    print(nomor)
}

fun getNomorSize(vararg nomor: Int) : Int{
    return nomor.size
}

//output :5
 */

//kapan kita membutuhkan vararg?  Ketika sebuah fungsi yang menggunakannya tidak mengetahui jumlah argumen yang akan disematkan ketika fungsi tersebut dipanggil.
/*
    ATURAN FARARG

    Pertama, di dalam sebuah fungsi, tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.
    //fun sumNumbers(vararg number: Int, vararg number2: Int)

    Selanjutnya jika kita ingin menambahkan parameter baru tanpa kata kunci vararg, parameter yang ditandai dengan vararg sebaiknya berada pada posisi terakhir. Contohnya seperti berikut:
    /*
    fun main() {
        sets("Kotlin", 10, 10)
    }

    fun sets(name: String, vararg number: Int): Int {
        ...
    }
    */

 */
