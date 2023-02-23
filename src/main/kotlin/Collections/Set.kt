package Collections

fun main() {
    val integerSet = setOf(1,2,4,2,1,5)
    println(integerSet) //fungsi setOf akan membuang angka yang sama

    val setA = setOf(1,2,4,2,1,5)
    val setB = setOf(1,2,4,5)
    //Urutsn pada set bukanlah sesuatu yang penting, sehingga apabila kita bandingkan dua buah Set yang memiliki nilai yang sama dan urutan yang berbeda, akan tetap dianggap sama.
    println(setA == setB)

    //Kita juga bisa melakukan pengecekan apakah sebuah nilai ada di dalam Set dengan menggunakan kata kunci in
    println(5 in setA)

    //Kemudian ada juga fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2(dua) buah Set.
    val setC = setOf(1,5,7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    //Pada Mutable Set kita bisa menambah dan menghapus iter namun tak bisa mengubah nilai seperti pada List.
    val mutableSet = mutableSetOf(1,2,4,2,1,5)
    //mutableSet[2] = 6 //tidak bisa mengubah set immutable
    mutableSet.add(6) //menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

    val reqSet = setOf(1, 2, 3, 2, 4, 5, 1)
    val rekSet = setOf(1, 2, 3, 4, 5, 8, 9)
    println(reqSet == rekSet)
    println(6 in reqSet)
    val unionSet = reqSet.union(rekSet)
    val intersectSet = reqSet.intersect(rekSet)

    println(unionSet)
    println(intersectSet)
}