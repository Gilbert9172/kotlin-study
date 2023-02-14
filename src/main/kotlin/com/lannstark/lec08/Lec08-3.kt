package com.lannstark.lec08

/**
 * 같은 타입의 여러 파라미터 받기(가변인자)
 */
fun main() {
    printAll("A","B","C")

    val array = arrayOf("D","E","F")
    printAll(*array)    // `*` : 스프레드 연산자
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}