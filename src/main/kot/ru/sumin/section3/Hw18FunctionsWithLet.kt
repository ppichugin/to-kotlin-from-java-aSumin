package ru.sumin.section3

val listOfNum: MutableList<Int>? = mutableListOf()

fun main() {

    with(listOfNum) {
        this?.let { it ->
            for (i in 0..1000) {
                it.add((Math.random() * 1000).toInt())
            }
            (0..99).withIndex()
                .filter { indexedValue -> get(indexedValue.index) % 2 == 0 }
                .forEach {
                    val getNumber = get(it.index)
                    println("Index: ${it.index}, value: $getNumber ")
                }
        }
    }
}