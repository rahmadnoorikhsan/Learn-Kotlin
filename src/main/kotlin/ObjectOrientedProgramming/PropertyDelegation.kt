package ObjectOrientedProgramming

import kotlin.reflect.KProperty

class DeleteName {      //Sebelum mendelegasikan sebuah properti kita perlu membuat kelas delegasi terlebih dahulu
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }
    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
         println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
         println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
         value = newValue
    }
}

class Hewan {
    var jeneng: String by DeleteName()      //Kemudian untuk mendelegasikan sebuah properti kelas, kita gunakan keyword by dalam menginisialisasi properti tersebut kemudian diikuti dengan namanya
}

class Person{
    var jeneng: String by DeleteName()
}

class Hero{
    var jeneng: String by DeleteName()
}

/*
fun main() {
    val hewan = Hewan()
    hewan.jeneng = "Dicoding Guk"
    println("Nama Hewan: ${hewan.jeneng}")

    val person = Person()
    person.jeneng = "Ikhsan"
    println("Nama Orang: ${person.jeneng}")

    val hero = Hero()
    hero.jeneng = "Sumanto"
    println("Nama Pahlawan: ${hero.jeneng}")
}
 */

//Kemudian mari kita membuat sebuah objek dari kelas Hewan, ubah dan akses nilai propertinya kemudian jalankan
class DelegateGenericClass {
    private var value: Any = "Default"
    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama  seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}
class Animals {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}
fun main() {
    val animal = Animals()
    animal.name = "Dicoding Kucing"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}
//Kita telah memberikan nilai pada setiap properti dengan tipe data yang berbeda.
//Tetapi dengan DelegateGenericClass(), pengelolaan properti dapat digunakan pada seluruh tipe data properti