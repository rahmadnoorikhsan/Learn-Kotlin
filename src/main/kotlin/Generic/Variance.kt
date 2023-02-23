package Generic

//Variance adalah konsep yang memiliki subtipe yang sama dan tipe argumen yang berbeda saling berkaitan satu sama lain
//Variance dibutuhkan ketika kita ingin membuat kelas atau fungsi generic dengan batasan yang tidak akan mengganggu dalam penggunaannya.
abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class Motor(speed: Int) : Vehicle(2)

fun main() {
    val car = Car(200)
    val carList = listOf(Car(100), Car(120))    //Memasukkan salah satu kelas yang merupakan subtipe dari kelas Vehicle kedalam generic list
    val motor = Motor(100)
    var vehicle: Vehicle = car
    var vehicleList = carList
    vehicle = motor
}   //Bisa diperhatikan pada kode diatas merupakan subtipe dari Vehicle sehingga kita bisa melakukan assignment antara dua variabel tersebut
