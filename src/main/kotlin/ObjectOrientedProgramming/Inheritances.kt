package ObjectOrientedProgramming

//Dalam OOP, beberaa objek yang berbeda bisa saja memiliki kesamaan dalam hal tertentu. Disitulah konsep inheritance atau pewarisan harus diterapkan
//Pewarisan dapat mencegah kita melakukan perulangan kode
class Cat(val name: String, val furColor: String, val weight: Double, val age: Integer, val numberOfFeet: Integer, val isCarnivore: Boolean) {
    fun eat(){
        println("$name sedang makan!")
    }
    fun sleep(){
        println("$name sedang tidur!")
    }
    fun playWithHuman(){
        println("$name bermain dengan Manusia!")
    }
}

/*
    Tidak ada masalah dengan kode tersebut, tetapi ketika kita akan membuat kelas dari diagram lainnya
    contohnya seperti Fish maka kita harus menuliskan ulang properti seperti name, weight, age dan properti atau fungsi yang sama lainnya.
    Hal ini dapat mengurangi efisiensi dalam menuliskan kode.
 */

//class ChildClass : ParentClass {      //Dalam Kotlin untuk melakukan extends pada sebuah kelas dapat dilakukan dengan tanda :

//}

open class Hutan(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {    //Untuk membuat sebuah super atau parent class kita akan membutuhkan open class. Kelas pada Kotlin secara default bersifat final, oleh karena itu kita harus mengubahnya menjadi open class sebelum melakukan extends kelas tersebut.

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang Turu!")
    }
}

class Meow(pName: String, pWeight: Double, pAge: Int, pisCarnivore: Boolean, val funColor: String, val numberOfFeet: Int)
    :Hutan(pName,pWeight,pAge,pisCarnivore){

    fun playWithHuman(){
        println("$name bermain dengan Manusia!")
    }
    override fun eat(){
        println("$name sedang makan Daging!")
    }
    override fun sleep(){
        println("$name sedang tidur!")
    }
}   //Dengan begitu, selain fungsi yang terdapat didalamnya, kelas Cat juga dapat mengakses seluruh fungsi dan properti yang terdapat kelas Hutan

fun main() {
    val kucing = Meow("Kucing Oren", 3.2, 2, true, "Brown", 4)

    kucing.playWithHuman()
    kucing.eat()
    kucing.sleep()
}