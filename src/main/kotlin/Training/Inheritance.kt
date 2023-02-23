abstract class Animaled(val name: String, val weight: Double, val age: Int, val isCarnivora: Boolean){
    open fun eat(){
        println("$name sedang Makan!")
    }
    open fun sleep(){
        println("$name sedang Tidur!")
    }
}

class CatJava(pName: String, pWeight: Double, pAge: Int, pIsCarnivora: Boolean, pfunColor: String, pNumberOfFeet: Int)
    : Animaled(pName, pWeight, pAge, pIsCarnivora){

    fun playWithHuman(){
        println("$name bermain dengan manusia !")
    }

    override fun eat(){
        println("$name sedang akan ikan !")
    }

    override fun sleep(){
        println("$name sedang tidur di bantal !")
    }
}

class Fish(pName: String, pWeight: Double, pAge: Int, pIsCarnivora: Boolean, pScaleColor: String, pNumberOfFin: Int)
    : Animaled(pName, pWeight, pAge, pIsCarnivora){
        fun swim(){
            println("$name sedang berenang di sungai !")
        }

    override fun eat() {
        super.eat()
    }

    override fun sleep() {
        super.sleep()
    }
}

class Snake(pName: String, pWeight: Double, pAge: Int, pIsCarnivora: Boolean, pSkinColor: String, pIsToxic: Boolean)
    : Animaled(pName, pWeight, pAge, pIsCarnivora){

    fun bite(){
        println("$name is bite human !")
    }

    override fun eat() {
        super.eat()
    }

    override fun sleep() {
        super.sleep()
    }
}
fun main() {
    val orangeCat = CatJava("Oyen", 1.5, 2, true, "Orange", 5)

    orangeCat.playWithHuman()
    orangeCat.eat()
    orangeCat.sleep()

    val fishChana = Fish("Chana", 0.5, 1, false, "Black", 1)

    fishChana.swim()
    fishChana.eat()
    fishChana.sleep()

    val snake = Snake("King Cobra", 1.0, 2, true, "Black", true)

    snake.bite()
    snake.eat()
    snake.sleep()
}