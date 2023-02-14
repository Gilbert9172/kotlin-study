package com.lannstark.lec07

/**
 * try-catch-finally
 *
 * - Java와 문법적으로 동일하다.
 * - 하나의 Expression으로 간주한다.
 */
fun main() {

}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}을 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV12(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("Finally")
    }
}