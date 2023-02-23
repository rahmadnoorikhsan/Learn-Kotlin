fun main() {
//Conjunction atau AND (&&)
// Operator AND (&&) akan mengembalikan nilai true jika semua hasil evaluasi expression yang diberikan bernilai true.
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }
    println("Office is open : $isOpen")
    /*dapat disederhanakan seperti ini:

    val officeOpen = 7
    val officeCLosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed
    print("Office is open : $isOpen")

     */

    //Disjunction atau OR (||)
    //Berbeda dengan operator AND (&&), operator OR (||) akan mengembalikan nilai true jika hasil evaluasi dari salah satu expressions yang diberikan bernilai true
    val officeOpenn = 7
    val officeClosedd = 16
    val noww = 20

    val isClose = noww < officeOpenn || noww > officeClosedd

    println("Office is closed : $isClose")

    //Negation atau NOT (!)
    //Berbeda dengan operator AND (&&) dan operator OR(||), operator NOT(!) digunakan untuk melakukan negasi pada hasil evaluasi expression yang diberikan. Contoh, Jika hasil expressions setelah dievaluasi bernilai true, maka operator NOT akan mengembalikan nilai false
    val officeOpennn = 7
    val nowww = 10
    val isOpennn = nowww > officeOpennn

    if (!isOpennn){
        println("Office is closed")
    } else {
        println("Office is open")
    }

    //New statement
    val isAm = 1
    val isPm = 12
    val timeNow = 15

    //AND
    val isTimeAm = timeNow >= isAm && timeNow <= isPm
    //OR
    val isTimePm = timeNow <= isAm || timeNow > isPm
    //NOT
    val isTimeAmRight = timeNow > isPm

    println("It is Time Am : $isTimeAm")

    println("It is Time Pm : $isTimePm")

    if(!isTimeAmRight) {
        print("it is Time Am")
    }else {
        print("It is Time Pm")
    }
}
