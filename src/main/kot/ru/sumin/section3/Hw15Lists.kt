package ru.sumin.section3

fun main() {
    val names = mutableListOf<String>()
    for (i in 0..10) {
        names.add("Фамилия${(Math.random()*100).toInt()} Имя${(Math.random()*100).toInt()}")
        println(names[i])
    }

    var firstNameThenLastName: MutableList<Pair<String, String>> = mutableListOf()
    for (name in names) {
        val stringList: List<String> = name.split(" ")
        val lastName = stringList[0]
        val firstName = stringList[1]
        firstNameThenLastName.add(Pair(firstName, lastName))
    }

    for (i in 0..10) {
        println("First name: ${firstNameThenLastName[i].first}, Last name: ${firstNameThenLastName[i].second}")
    }

    println("second variant")
    val lastNames = names.map { it.substringBefore(" ") }
    val firstNames = names.map { it.substringAfter(" ") }

    var zippedNames = lastNames.zip(firstNames)
    for (name in zippedNames) {
        println("Last name: ${name.first}, First name: ${name.second}")
    }
}