//DESTRUCTURING DECLARATIONS adalah proses memetakan objek menjadi sebuah variabel

/*
class User(val nama : String, val umur : Int)
data class DataUser(val nama : String, val umur : Int)

fun main() {
    val dataUser = DataUser("Ikhsan", 20)

    //val name = dataUser.component1()
    //val age = dataUser.component2()
    //Fungsi component1() dan componetn2() dihasilkan sesuai dengan jumlah properti yang ada pada data class tersebut. JIka sebuah data class memiliki sejumlah N properti, maka secara otomatis componentN() akan dihasilkan

    val(name, age) = dataUser
    //Kita juga dapat membuat beberapa variabel dari objek secara langsung dengan kode seperti berikut:
    println("Nama saya $name, Saya umur $age years old")
}
 */

//Kesimpulannya, seperti aspek-aspek lain dari kotlin,data class bertujuan untuk mengurangi jumlah kode boilerplate yang anda tuliskan.

//Dan perlu diketahui bahwa data class tidak hanya sekedar untuk mengelola properti yang ada di dalamnya. Ketika mempunyai data yang sangat kompleks, kita juga bisa menerapkan sebuah behavior di dalam data class. Contoh sederhananya, kita bisa membuat fungsi didalam data class seperti berikut:
data class DataUser(val name: String, val age: Int)//{
//    fun intro(){
//        println("Nama saya $name, Saya umur $age years old")
//    }
//}

data class DataAccess(val name: String, val address: String){
    fun tell(){
        println("My name is $name, my address in $address")
    }
}
fun main() {
    val dataUser = DataUser("Rahmad", 20)

    val (nama, umur) = dataUser
//    dataUser.intro()
    println("Halo nama saya $nama, umur saya masih $umur")

    val dataAccess = DataAccess("Ikhsan", "Wonosobo")
    dataAccess.tell()
}