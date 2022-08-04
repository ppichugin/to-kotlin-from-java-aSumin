package ru.sumin.section4.lesson35

fun main() {
    Db.writeRecord("1")
    DbWriter.writeToDbWithMerge("2", "3")
    for (str in Db.sqlDb) {
        println(str)
    }
}