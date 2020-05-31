package com.ap.Function

//Armstrong Numbers Between Two Integers
//https://www.programiz.com/kotlin-programming/examples/armstrong-number-function

fun main() {
    val low = 999
    val high = 99999

    for (number in low + 1..high - 1) {
        if (checkArmstrong(number))
            print("$number ")
    }
}

fun checkArmstrong(num: Int): Boolean {
    var digits = 0
    var result = 0
    var originalNumber = num

    // number of digits calculation
    while (originalNumber != 0) {
        originalNumber /= 10
        ++digits
    }

    originalNumber = num

    // result contains sum of nth power of its digits
    while (originalNumber != 0) {
        val remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), digits.toDouble()).toInt()
        originalNumber /= 10
    }

    if (result == num)
        return true

    return false
}

//Output - > 1634 8208 9474 54748 92727 93084