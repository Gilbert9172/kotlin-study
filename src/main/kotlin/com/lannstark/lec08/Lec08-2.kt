package com.lannstark.lec08

/**
 * default parameter & named argument
 *
 * - named argument : builder를 직접 만들지 않고, builder의 장점을 가지게 된다.
 * - kotlin에서는 Java함수를 가져다 사용할 때는 named argument를 사용할 수 없다.
 */
fun main() {
    repeat("Gilbert")
    repeat("Gilbert", num = 5, useNewLine = false)
}

fun repeat(
    str: String,
    num: Int =3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}