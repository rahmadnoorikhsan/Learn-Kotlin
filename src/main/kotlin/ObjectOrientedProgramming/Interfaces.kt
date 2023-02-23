package ObjectOrientedProgramming

//Interfaces merupakan suatu konsep sifat umum yang nantinya digunakan oleh suatu kelas agar dapat memiliki sifat tersebut
//Tujuan dari interface ini hanya untuk diimplementasikan oleh sebuah kelas.
//Kelas yang mengimplementasikan sebuah interface diharuskan melakukan override seluruh propertu dan fungsi sekaligus mendefinisikan isi fungsi yang terdapat pada interfacesnya

interface Ifly {    //Pada umumnya penamaan sebuah interface dituliskan dengan awalan hurug I kapital
    fun fly()
    val numberOfWings: Int  //untuk menambahkan sebuah properti pada interface, kita cukup menuliskannya seperti pada kelas namun tanpa melakukan inisialisasi nilai
}

class Bird (override val numberOfWings: Int): Ifly{   //Sama seperti fungsi, kita juga diharuskan melakukan override properti. overriding properti bisa dilakukan pada sebuah konstruktor kelas
    override fun fly() {     //kita harus melakukan override fungsi yang terdapat pada Ifly
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I flying without wings")
    }
}