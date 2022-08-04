package ru.sumin.section2

fun main() {

    val numbers = mutableListOf(3, 1, 2, 1, 34, 4, 156, 0, 3, 200, 3, 5, -2)
    numbers.forEach { print("  $it") }
    println("\n- Сортировка массива")
    sort(numbers).forEach { print("  $it") }
    println("\n- Сортировка vararg")
    sort(3, 1, 2, 1, 34, 4, 156, 0, 3, 200, 3, 5, -2).forEach { print("  $it") }
    println("\n- Сортировка Mutable List")
    sort(numbers).forEach { print("  $it") }
}

fun sort(array: Array<Int>): List<Int> {
    var changes: Int
    var temp: Int
    var step = 0
    do {
        changes = 0
        for (index in 0..array.size - 2 - step) {
            if (array[index] > array[index + 1]) {
                temp = array[index]
                array[index] = array[index + 1]
                array[index + 1] = temp
                changes++
            }
        }
        step++
    } while (changes != 0)
    return array.toList()
}

fun sort(vararg numbers: Int): List<Int> = sort(numbers.toTypedArray())

fun sort(list: MutableList<Int>): List<Int> = sort(list.toTypedArray())