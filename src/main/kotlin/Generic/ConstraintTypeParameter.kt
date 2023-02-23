package Generic

//Dalam penerapan generic, kita bisa mengatasi tipe apa saja yang dapat digunakan sebagai parameter.
//Untuk menentukan batasan tersebut, bisa dengan menambahkan tanda titik dua(:) setelah tipe parameter yang kemudian diikuti oleh tipe yang akan dijadikan batasan

/*
class ListNumber<T : Number> : List<T>{ //Number sebagai bayasan tipe argumen. Dengan begitu kita hanya bisa memasukkan tipe argumen Number pada kelas ListNumber
    override fun get(index: Int) : T{
        /* .. */
    }
}
 */
/*
fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    //val numbers3 = ListNumber<String>() // error : Type argument is not withiin its bounds
}

class ListNumber<T : Number> : List<T>{
    override fun get(index: Int) : T{
        /* .. */
    }
}
 */