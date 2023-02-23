// Private
class Flower(private var named: String){
    fun getName() : String {
        return named
    }

    fun setName(newName: String){
        named = newName
    }
}

fun main() {
    val rose = Flower("Sunny")
    println(rose.getName())
    rose.setName("Kamboja")
    println(rose.getName())
}

// Protected
open class Animals(private var name: String, protected val age: Int)

class Cat(pName: String, pAge: Int): Animals(pName, pAge)