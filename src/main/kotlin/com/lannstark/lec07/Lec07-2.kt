package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * Checked Exception & UnChecked Exception
 * Checked Exception이 안생긴다?
 *
 * -> Kotlin에서는 Checked, Unchecked 구분하지 않는다.
 * 모두 Unchecked Exception으로 간주한다.
 */
fun main() {
    readFile()
}

fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
}