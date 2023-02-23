interface List<T>{
    operator fun get(index: Int) : T
}

class LongList: List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}

fun main() {
    val points = mapOf<String, Int>("Alfian" to 10)
    println(points)

    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}