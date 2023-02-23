package FunctionalProgramming

//Lambda tanpa Receiver (tidak menggunakan DSL)


fun buildString(): String{
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

//Contoh kode StringBuilder yang diatas digunakan untuk menambahkan kata satu per satu


fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    println(message)
}
//Dengan menggunakan DSL, Anda dapat menyingkat kode tersebut dan cukup fokus pada fungsi append-nya saja. Berikut adalah contoh membuat Lambda with Receiver :
fun buildString(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}
//Pada kode diatas, StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action. Dengan begitu kita dapat memanggil parameter action tersebut dari variabel yang bertipekan StringBuilder.
//Kita sebagai client bisa menggunakan suatu fungsi yang kompleks cukup dengan menggunakan fungsi append yang dipanggil di dalam block buildString. Anda tidak perlu tahu bagaimana proses buildString dibaliknya, yang terpenting adalah hasilnya sesuai dengan yang diharapkan