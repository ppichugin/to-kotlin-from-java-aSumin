package ru.sumin.section3

fun main() {
    val list = listOf<Int>(12, 3, 5)
    myWith(list) {
        println(sum())
        println(average())
    }
}

// пишем свою with fun

/*
fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
    list.operation()
}

fun myWith(string: String, operation: String.() -> Unit) {
    string.operation()
}

fun myWith(obj: Any, operation: Any.() -> Unit) {
    obj.operation()
}*/

inline fun <T> myWith(string: T, operation: T.() -> Unit) {
    string.operation()
}


inline fun <T, R> myWithReturn(string: T, operation: T.() -> R): R {
    return string.operation()
}