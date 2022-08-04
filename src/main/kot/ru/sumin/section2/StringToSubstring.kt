package ru.sumin.section2

fun main() {
    println(getString("Hello"))
    println(sum(1, 2, 3, 4, 5))
}

fun getString(str: String) = str.substring(0, 2.coerceAtMost(str.length))

fun sum(vararg numbers: Int): Int {
    var summ = 0
    for (num in numbers) {
        summ += num
    }
    return summ
}