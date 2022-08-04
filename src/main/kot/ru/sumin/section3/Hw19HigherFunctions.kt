package ru.sumin.section3

fun main() {
    val listOfNumbers = listOf(1, 1, 1, -1)
    sumOfNumbers(listOfNumbers) { println((it.sum())) }

}

inline fun sumOfNumbers(numbers: List<Int>, function: (List<Int>) -> Unit) {
    function(numbers)
}