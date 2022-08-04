package ru.sumin.section3

fun main() {
    val listOfName: List<String> = listOf("Андрей", "Павел", "Аркадий", "Филарет", "авокадо")
    val getNamesStartsWithA: (List<String>) -> List<String> = {
        it.filter { s ->
            s.startsWith("А").or(s.startsWith("а"))
        }
    }

    for (name in getNamesStartsWithA(listOfName)) {
        println(name)
    }

    val randomNumbers: MutableList<Int> = MutableList(size = 1_000) { (Math.random() * 1000).toInt() }
    val randomNumbers2: MutableList<Int> = mutableListOf(5, 30, 4, 10)

    val filteredNumbersConvertToString: (MutableList<Int>) -> List<String> =
        { it ->
            it
                .filter { i -> (i % 3 == 0 || i % 5 == 0) }
                .map { it * it }.sortedDescending().map { it.toString() }
        }

    for (str in filteredNumbersConvertToString(randomNumbers2)) {
        print("$str, ")
    }

}
