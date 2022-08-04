package ru.sumin.section2

fun main() {
    val volume = volume(5, 2)
    println(volume)

}

fun volume(a: Int, b: Int = a, c: Int = a): Int = a * b * c
