package ObjectOrientedProgramming

//Init Block memiliki beberapa fungsi selain menginisialisasi properti kelas.
//Satu fungsi lainnya adalah untuk membantu dalam memvalidasi sebuah nilai properti sebelum diinisialisasi.
//Pada kelas Kewan contohnya, kita dapat melakukan verifikasi bahwa berat dan umur hewan tidak boleh bernilai kurang dari nol.
//Untuk membuatnya, kita dapat menggunakan keyword init kemudian inisialisasikan semua properti didalam blok tersebut dengan parameter kelas:
class Spesies(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val nameSpesies: String
    val weightSpesies: Double
    val ageSpesies: Int
    val isMammalSpesies: Boolean

    init {
        this.weightSpesies = if(pWeight < 0) 0.1 else pWeight
        this.ageSpesies = if(pAge < 0) 0 else pAge
        this.nameSpesies = pName
        this.isMammalSpesies = pIsMammal
    }   //Untuk menghindari ambiguitas kita dapat menggunakan keyword this dalam menginisialisasi properti tersebut dalam blok init.

}
//Primary constructor dan init harus saling terhubung.
//Fungsi init dijalankan ketika suatu objek dibuat dengan menggunakan primary constructor
fun main() {
    val dicodingCat = Spesies("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.nameSpesies}, Berat: ${dicodingCat.weightSpesies}, Umur: ${dicodingCat.ageSpesies}, mamalia: ${dicodingCat.isMammalSpesies}")
}