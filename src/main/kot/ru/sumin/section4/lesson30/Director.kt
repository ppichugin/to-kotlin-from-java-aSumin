package ru.sumin.section4.lesson30

class Director(name: String, age: Int) : Worker(name, age) {
    override fun work() {
        println("Управляю процессом")
    }
}