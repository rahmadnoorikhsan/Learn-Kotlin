package Training

interface Iswim{
    fun swim()
    val numberOfSirip: Int
}

fun swimWithSirip(fish: Iswim){
    fish.swim()
}

fun main() {
    swimWithSirip(object: Iswim{
        override fun swim() {
            if(numberOfSirip > 0) println("Fish swim with $numberOfSirip sirip")
            else println("Fish swim without Sirip")
        }

        override val numberOfSirip: Int
            get() = -1
    })
}