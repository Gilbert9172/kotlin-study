package com.lannstark.lec07

import java.io.BufferedReader
import java.io.FileReader

/**
 * try - with - resources
 *
 * - 코틀린에는 없다. 어떻게 처리해야 하지? -> Use를 사용한다.
 * - 코틀린의 언어적 특징을 활용해 close를 호출해준다.
 */
fun main() {
    readFile("./a.txt")
}

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}