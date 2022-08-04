package ru.sumin.section3

fun main() {
    val square: (Int) -> Int = { it * it }
    println(square(4))

    val perimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
    println(perimeter(11, 14))

    val sayHello: (String) -> Unit = { println("Привет, $it!") }
    sayHello("Petr")

    val sortedDescendingArray: (Array<Int>) -> Array<Int> = { it.sortedArrayDescending() }
    for (num in sortedDescendingArray(arrayOf(90, 45, 35, 3, 4, 2, 0, 100, 120))) {
        print(num.toString().plus(" "))
    }
}