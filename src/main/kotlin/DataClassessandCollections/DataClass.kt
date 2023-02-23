//class Pengguna(val nama: String, val umur: Int)
//data class Datapengguna(val nama: String, val umur : Int)

/*
fun main() {
    val pengguna = Pengguna("Rahmad Noor Ikhsan", 20)
    val datapengguna = Datapengguna("Rahmad Noor Ikhsan", 20)

    println(pengguna)
    println(datapengguna)
    //objek Pengguna menghasilkan teks Pengguna@4dd8dc3. pengguna adalah nama dari kelas itu sendiri, dan @4dd8dc3 adalah memory address dari kelas tersebut.
    //objek Datapengguna menghasilkan teks Datapengguna(name = Rahmad Noor Ikhsan, age = 20), yaitu nama kelas disertai dengan semua properti didalamnya dan value dari properti tersebut
}
 */

    /*
        Dengan begitu, anda bisa langsung mengetahui semua informasi dari datapengguna hanya dengan melihat value dari properti yang ada. Mengapa demikian?
        Karena seperti yang sudah disampaikan sebelumnya, data class akan secara otomatis menghasilkan fungsi toString() didalamnya.
        Tanpa data class, kita perlu membuat fungsi toString() secara manual untuk mendapatkan informasi seperti yang diberikan oleh objek datapengguna
     */
    //Contoh untuk menampilkan informasi yang jelas dari objek pengguna, maka kita perlu menambahkan fungsi toString() seperti berikut:
/*
class Pengguna(val nama: String, val umur: Int){
        override fun toString(): String {
            return "Pengguna(nama=$nama, umur=$umur)"
        }
}
//Dengan menambahkan fungsi toString() seperti diatas, maka objek pengguna akan bisa menghasilkan teks yang sama dengan objek datapengguna
fun main() {
    val pengguna = Pengguna("Rahmad Noor Ikhsan", 20)

    println(pengguna)
}
 */
//Selanjutnya, Kelebihan lain dari data class adalah ia sudah memiliki fungsi equals() secara otomatis. Maka jika anda ingin melakukan komparasi konten antara 2 buah objek, lakukanlah dengan mudah seperti contoh dibawah ini:
/*
fun main() {
    val datapengguna = Datapengguna("Rahmad", 20)
    val datapengguna2 = Datapengguna("Noor", 17)
    val datapengguna3 = Datapengguna("Ikhsan", 21)

    println(Datapengguna.equals(datapengguna2))
    println(Datapengguna.equals(datapengguna3))
}
 */
    //Konsol akan langsung memberi tahu apakah kedua objek tersebut sama atau tidak ketika anda menjalankan fungsi main():
    /*
        true
        false
     */
//Lain halnya jika kita melakukan komparasi pada 2 buah objek yang bukan dari data class. Kita tidak bisa mendapatkan hasil yang akurat karena konsol akan selalu menghasilkan nilai false. Sebagai contoh perhatikanlah kode berikut:

/*
fun main() {
    val pengguna = Pengguna("Rahmad", 20)
    val pengguna2 = Pengguna("Noor", 19)
    val pengguna3 = Pengguna("Ikhsan", 18)

    println(pengguna.equals(pengguna2))
    println(pengguna.equals(pengguna3))
}
 */
//MAka hasilnya akan sama saja, false semua. Hal ini karena dia tidak membandingkan kontennya, melainkan lokasi object (referensi) pada memory.
    /*
        false
        false
     */

//Dan jika anda menginginkan hasil yang akurat seperti pada data class, maka anda perlu membuat fungsi equals() secara manual:
/*
class User(val name : String, val age : Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}
 */
//Anda perlu menuliskan beberapa boilerplate code diaras untuk mendapatkan hasil yang sesuai. Belum lagi ketika anda menambahkan fungsi equals(), anda juga perlu menambahkan fungsi hashCode()

//MENYALIN DAN MEMODIFIKASI DATA CLASS
//fun main() {
//    val datapengguna = Datapengguna("Rahmad", 20)
//    val datapengguna2 = Datapengguna("Noor", 19)
//    val datapengguna3 = Datapengguna ("Ikhsan", 18)
//    val datapengguna4 = datapengguna.copy() //menyalin sebuah objek dengan sangat mudah dengan memanfaatkan fungsi copy()
//    val datapengguna5 = datapengguna.copy(umur = 21) //Memodifikasi objek dengan nilai baru menggunakan fungsi copy()
//
//    println(datapengguna4)
//    println(datapengguna5)
//}
//Tanpa data class, untuk melakukan tugas seperti ini kita memerlukan sebuah instance baru untuk mengubah nilai dari suatu objek. Dengan demikian kita harus memodig=fikasi properti yang kita maksud. Tugas iini akan berulang dan membuat kode yang kita tulis, jauh dari paradigma clean code

class User (val name: String, val age: Int){

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DateUser(val name: String, val address: String, val yearBirthDay: Int)

fun main() {
   val user = User("Ikhsan", 20)
    val dataUser = DateUser("Ikhsan", "Wonosobo", 2002)
    val dataUser1 = DateUser("Noor", "Wonosobo", 2002)
    val dataUser2 = DateUser("Ikhsan", "Wonosobo", 2002)
    val datauser3 = dataUser.copy(name = "Rahmad")

    println(user)
    println(datauser3)
    println(dataUser1)
    println(dataUser2)
    println(dataUser.equals(dataUser1))
    println(dataUser.equals(dataUser2))
}