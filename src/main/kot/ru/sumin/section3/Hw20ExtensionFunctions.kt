package ru.sumin.section3

fun main() {
    println(8.isPrime())

}

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}