package ru.sumin.section2

fun main() {
    val array = arrayOf(1, 2, 3, 6, 90)
    println(array[1])

    val array2: Array<Int?> = arrayOf(1, 2, 3, 6, 90)
    array2[3] = null
    println(array[1])

    val array3 = arrayOfNulls<Int?>(5)
}