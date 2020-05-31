import java.util.*

//Print an Integer entered by an user in Kotlin using Scanner
fun main() {
    val reader = Scanner(System.`in`)
    print("Enter a Number: ")

    var integer: Int = reader.nextInt()

    println("Your Entered Number is: $integer")
}
//Enter a Number: 5
//Your Entered Number is: 5