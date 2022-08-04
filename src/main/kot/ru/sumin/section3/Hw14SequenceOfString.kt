package ru.sumin.section3

fun main() {
    var test = 1000001
    val employees: Sequence<String> = generateSequence("Сотрудник №${test++}") { it.take(11).plus(test++) }
    for (str in employees.take(100)) {
        println(str)
    }
}