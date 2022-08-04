package ru.sumin.section4.lesson29

fun main() {
    val programmer1 = Programmer("Java", "Петр", 35)
    val programmer2 = Programmer("Kotlin", "Петр П", 36)
    val programmer3 = Programmer("Golang", "Петр П В", 37)

    val worker1 = Worker("Вася", 31)
    val worker2 = Worker("Витя", 32)
    val worker3 = Worker("Дима", 33)

    val listOfWorkers = listOf(programmer1, programmer2, programmer3, worker1, worker2, worker3)

    for (worker in listOfWorkers) {
        println("Имя: ${worker.name} - ${worker.work()}")
    }
}