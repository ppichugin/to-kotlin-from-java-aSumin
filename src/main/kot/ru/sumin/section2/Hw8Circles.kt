package ru.sumin.section2

fun main() {
    val array = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()) {
        array[index] = i
    }
    for (i in array.size - 1 downTo 0) {
        val current = array[i]
        if (current?.rem(5) == 0) {
            println(array[i])
        }
    }
}