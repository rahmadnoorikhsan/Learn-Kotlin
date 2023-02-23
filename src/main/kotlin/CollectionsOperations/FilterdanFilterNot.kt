package CollectionsOperations

fun main() {

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    val ganjilList = numberList.filter { it % 2 == 1 }
    println(evenList)
    println(ganjilList)

    //eventList: [2, 4, 6, 8, 10]

    //Filter() untuk menyaring bilangan yang habis dibagi 2(dua) atau biasa disebut dengan bilangan genap.
    //Selain itu kita juga dapat memfilter list berdasar hasil yang tidak sesuai dengan kondisi yang diberikan. Caranya adalah dengan menggunakan fungsi filterNot()
    val notEvenList = numberList.filterNot{ it % 2 == 0 }
    val notGanjilList = numberList.filterNot { it % 2 == 1 }

    println(notEvenList)
    println(notGanjilList)
    //notEvenlist : [1, 3, 5, 7 ,9]
}

//Jadi bisa disimpulkan bahwa filterNot() merupakan kebalikan dari filter()