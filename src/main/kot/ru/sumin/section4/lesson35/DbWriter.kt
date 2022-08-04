package ru.sumin.section4.lesson35

class DbWriter {
    companion object {
        fun writeToDbWithMerge(str1: String, str2: String) = Db.writeRecord(str1.plus(str2))
    }
}