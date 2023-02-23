interface Ifly {
    fun fly()
    val numberOfWings: Int
    val speedFly: Int
}

class Bird(override val numberOfWings: Int, override val speedFly: Int): Ifly{
    override fun fly() {
        if(numberOfWings > 0) println("I flying with $numberOfWings wings with speed $speedFly km/h")
        else println("I flying without wings with speed $speedFly km/h")
    }
}

fun main() {
    val bird = Bird(3, 2)
    bird.fly()
}