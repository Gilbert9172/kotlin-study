package com.lannstark.lec05

/**
 * 3. switch & when
 *
 * - when 또한 Expression이다.
 */
fun main() {
    println(getGradeWithSwitch(80))
    println(getGradeWithSwitch(55))
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else  -> "D"
    }
}

fun checkTypeUsingWhen(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        is Int -> obj > 2
        else -> false
    }
}

fun judgeNumber(number: Int) {
    return when (number) {
        -1, 1, 0 -> println("어디서 많이 본 숫자")
        else -> println("노노")
    }
}

// when 뒤에 값이 없다면 Java의 Early Return과 같이 사용할 수 있다.
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수 입니다.")
        else -> println("주어지는 숫자는 홀수 입니다.")
    }
}