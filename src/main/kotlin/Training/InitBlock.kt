package Training

class Animal(pName: String, pAge: Int, pWeight: Double, pMamal: Boolean){
    private var name: String
    private val age: Int
    private val weight: Double
    private val mamal: Boolean

    init {
        name = pName
        age = if(pAge < 0) 0 else pAge
        weight = if(pWeight < 0) 0.1 else pWeight
        mamal = pMamal
    }

    fun getName() : String{
        return name
    }

    fun setName(newName: String){
        name = newName
    }
}

fun main() {
    val cat = Animal("Oyen", -1, -1.0, true)
    println("Nama: ${cat.getName()}")
    println(cat.setName("Ireng"))
    println(cat.getName())
}