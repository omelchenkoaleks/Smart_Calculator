package calculator

import java.util.*

val scanner = Scanner(System.`in`)
lateinit var result: String

fun main() {
    result = readInputString()
    result
            .run(::parseStringIntoNumbers)
            .run(::sumOfTwoNumbers)
            .run(::println)
}

fun sumOfTwoNumbers(listNumbers: MutableList<Int>): Int {
    val oneNum = listNumbers[0]
    val twoNum = listNumbers[1]
    return oneNum + twoNum
}

fun readInputString(): String {
    return scanner.nextLine().trim()
}

fun parseStringIntoNumbers(string: String): MutableList<Int> {
    val numbers = mutableListOf<Int>()
    val stringWithoutSpaces = string.split(" ")
    stringWithoutSpaces.forEach {
        numbers.add(it.toString().toInt()) // trick )
    }
    return numbers
}