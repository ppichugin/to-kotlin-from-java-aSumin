package ru.sumin.section4.lesson31

class Car(override var name: String = "Машина") : AbstractTransport(name) {
    override fun drive() {
        println("Веду машину")
    }

    fun startEngine(): Boolean {
        println("Запускаю машину")
        return true
    }
}