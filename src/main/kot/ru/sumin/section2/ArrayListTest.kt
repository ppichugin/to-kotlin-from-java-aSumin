package ru.sumin.section2

fun main() {
    val listOfNumbers = ArrayList<Int>()
    listOfNumbers.add(6)
    val get = listOfNumbers[0]
    println(get)

    val listOf: List<Int> = ArrayList()
//    listOf.add(6) -> immutable list be default
    println(listOf.get(0))

    val lisOfMutableList: MutableList<Int> = ArrayList()
    lisOfMutableList.add(78)
    println(lisOfMutableList[0])
}