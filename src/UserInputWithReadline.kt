import java.lang.NumberFormatException

fun main() {
    try {

        print("Please Enter a Number: ")
        val input = readLine()?.toInt()
        println("Entered Number is: $input")

    }catch (e: NumberFormatException){
        print("Error $e")
    }
}
//Please Enter a Number: 15
//Entered Number is: 15