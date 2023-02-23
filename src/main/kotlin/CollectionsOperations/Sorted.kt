package CollectionsOperations

//Sorted digunakan untuk mengurutkan item yang ada di dalam collection. Secara default fungsi sorted() ini akan mengurutkan data secara ascending
fun main() {
    val kotlinChar = listOf('K', 'o', 't' , 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()

    println(ascendingSort)
    //ascending : [i, k, l, n, o, t]

    //Sedangkan untuk sorting secara descending,, kita dapat menggunakan fungsi sortedDescending()
    val kotlinChar1 = listOf('k', 'o', 't', 'l', 'i', 'n')
    val descendingSort = kotlinChar1.sortedDescending()

    println(descendingSort)
    //descendingSort : [t, o, n, l, k, i]
}