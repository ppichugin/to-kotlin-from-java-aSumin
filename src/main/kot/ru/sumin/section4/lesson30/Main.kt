package ru.sumin.section4.lesson30

fun main() {
    val programmer1 = Programmer("Java", "Петр", 35)
    val programmer2 = Programmer("Kotlin", "Петр П", 36)
    val programmer3 = Programmer("Golang", "Петр П В", 37)

    val worker1 = Seller("Вася", 31)
    val worker2 = Seller("Витя", 32)
    val worker3 = Seller("Дима", 33)

    val listOfWorkers = mutableListOf<Worker>(programmer1, programmer2, programmer3, worker1, worker2, worker3)
    listOfWorkers.add(Director("Boss", 45))

    for (worker in listOfWorkers) {
        worker.work()
        if (worker is Cleaner) {
            print("${worker.name} - ")
            worker.clean()
        }
    }

    fun upCastList(list: List<Worker>): List<Cleaner> {
        val listOutput: MutableList<Cleaner> = mutableListOf()
        for (worker in list) {
            if (worker is Cleaner) {
                listOutput.add(worker)
            }
        }
        return listOutput
    }

    val cleaners = listOfWorkers.filter { it is Cleaner }.map { it as Cleaner }.forEach { cleaner -> cleaner.clean() }

}