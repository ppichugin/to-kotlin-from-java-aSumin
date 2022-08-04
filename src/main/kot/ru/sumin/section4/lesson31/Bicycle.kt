package ru.sumin.section4.lesson31

class Bicycle(name: String) :AbstractTransport(name) {
    override fun drive() {
        println("Еду на велосипеде")
    }

}