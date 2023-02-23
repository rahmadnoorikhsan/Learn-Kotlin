abstract class Ban(wheels: Int)
class Car(speed: Int) : Ban(4)
class Motor(speed: Int): Ban(2)

fun main() {
//    var car = Car(200)
//    var motor = Motor(100)
//    var ban : Ban = car
//    ban = motor
    val carList = listOf(Car(200), Motor(100))
    val banList = carList

    for (i in 10 until 12) {
        print("$i ")
    }
}