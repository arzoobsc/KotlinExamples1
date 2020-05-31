package com.ap.Arrays

//Program to Calculate Average Using Arrays
//https://www.programiz.com/kotlin-programming/examples/average-arrays

fun main() {
    val numArray = doubleArrayOf(45.3, 67.5, -45.6, 20.34, 33.0, 45.6)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println("The average is: %.2f".format(average))
}

//Output - > The average is: 27.69