 //function atau fungsi merupakan sebuah prosedur yang memiliki ketekaitan dengan pesan dan objek
    /*

    fun functionName(param1: Type1, param2: Type2, ...): ReturnType{
        return result
    }

     */
//    fun setUser(name: String, age: Int): String {
//        return "Your name is $name, and you $age years old"
//    }
//
fun setMe(address: String, numberPhone: Long) = "My Adrress is $address, and my number phone is $numberPhone"
    /*
    fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
     */

    //jika tidak ingin fungsi yang mengembalikan nilai
    /*
    fun printUser(name: String) {
        print("Your name is $name)
    }
     */

fun setUser(name: String, age: Int) = "Your name is $name,and you $age years old"

fun printUser(name: String){
    println("Your name is $name")
}

fun printNumber(number: Int){
    println("My number home is $number")
}fun main() {
     val user = setUser("Alfian", 19)
     println(user)

     printUser("Alfian")

     val me = setMe("Wonosobo", 62831293820)
     println(me)

     printNumber(100)
}