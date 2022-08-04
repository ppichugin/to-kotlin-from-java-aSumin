package ru.sumin.section4.lesson23

fun main() {
    val employee = Employee("Bob", "CEO", 2000)
    employee.toDo()
    employee.fullInfo()
}

fun Employee.fullInfo() {
    println("Name: $name Job title: $title Start year: $year Стаж: $stage")
}