fun main() {
    /*
    contoh sederhana penggunaan if dengan memanfaatkan operator greater than untuk membandingkan nilai

    val openHours = 7
    val now = 20
    if (now > openHours){
        println("office already open")
    }

     Jika if digunakan untuk mengembalikan nilai atau menetapkan nilai dari sebuah variabel maka if wajib memiliki branch else

     val openHours = 7
     val now = 20
     val office = String
     if (now > openHours){
        office = "Office already open"
     } else {
        office = "Office is closed"
     }
     */

    val openHours = 7
    val now = 7
    val office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    //Blok else if akan dijalankan jika hasil evaluasi pada branch sebelumnya bernilai false. Jika hasil evaluasi pada branch else if juga bernilai nilai false, maka lanjut ke evaluasi branch selanjutnya.
    println(office)

    val am = 12
    val pm = 24
    val nowHour = 25
    val hour = if (nowHour <= am){
        "It is now $nowHour AM"
    } else if(nowHour <= pm){
        "it is now $nowHour PM"
    }else {
        "You entered \"Wrong\" Time"
    }

    print(hour)
}