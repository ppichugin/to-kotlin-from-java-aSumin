package ru.sumin.section2

fun main() {
    val array = arrayOfNulls<Int?>(101)
    for (i in 0..100) {
        array[i] = i
    }
    for ((index, i) in array.withIndex()) {
        array[index] = i?.times(2)
        println(array[index])
    }
}