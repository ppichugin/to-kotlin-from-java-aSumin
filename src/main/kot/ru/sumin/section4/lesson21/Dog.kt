package ru.sumin.section4.lesson21

class Dog {
    var nickname: String = ""
        set(value) {
            if (value != "" || value.isNotBlank()) {
                field = value.replaceFirstChar { ch -> ch.uppercaseChar() }
            }
        }
    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
    var weight: Double = 0.0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}