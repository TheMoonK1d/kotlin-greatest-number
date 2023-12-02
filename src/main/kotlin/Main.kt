fun main() {
    println("Enter 1st number")
    val num1 = readln().toInt()
    println("Enter 2nd number")
    val num2 = readln().toInt()
    println("Enter 3rd number")
    val num3 = readln().toInt()
    var greatest : Int = num1

    if (num1 > num2){
        greatest = num1
    }else if (num1 < num2){
        greatest = num2
    }

    if (greatest > num3){
        println("$greatest is the biggest number")
    }else if (greatest < num3) {
        println("$num3 is the biggest number")
    }else{
        println("$greatest is the biggest number")
    }
}