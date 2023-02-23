package Generic

/*
interface List<T>{
    operator fun get(index: Int) : T    //tipe parameter T bisa kita gunakan sebagi tipe reguler yang mengembailkan tipe dari sebuah fungsi
}

class LongList : List<Long>{
    override fun get (index: Int) : Long {  //Long digunakan sebagai tipe argumen untuk List, sehingga fungsi yang berada didalamnya akan menggunakan Long sebagai tipe dasarnya
        return this[index]
    }
}

class ArrayList<T> : List<T>{
    override fun get(index: Int) : T {  //Tipe argumen
        return this[index]
    }
}   //Dengan demikian ketika kita menggunakan kelas ArrayList, kita perlu menentukan tipe argumen dari kelas tersebut saat diinisialisasi
 */

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstlong = longArrayList.get(0)
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<P> {
    operator fun get(index: Int) : P
}