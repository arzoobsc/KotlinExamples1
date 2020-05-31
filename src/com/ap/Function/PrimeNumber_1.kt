package com.ap.Function
//Kotlin Program to Display Prime Numbers Between Intervals Using Function

fun main() {
    var low = 20
    val high = 50

    while (low < high){
        if (checkPrimeNumber(low))
            print("$low ")

        ++low
    }
}

fun checkPrimeNumber(num: Int): Boolean{
    var flag = true

    for (i in 2..num / 2){
        if (num % i == 0){
            flag = false
            break
        }
    }

    return flag
}

