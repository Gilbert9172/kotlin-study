package com.lannstark.lec05

/**
 * 2. Expression & Statement
 *
 * Statement가 Expression을 포함한다.
 * - Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
 * - Expresssion : 하나의 값으로 도출되는 문장.
 *
 * 자바에서 if-else의 경우에는 하나의 값이 정해저 있지 않기 때문에 Statement지만,
 *
 * 코틀린엔서는 if-else를 Expression으로 취급한다.
 *
 * 참고로 자바의 삼항연산자의 경우에는 Expression이다.
 *
 */
fun main() {
    println(getPassOrFail(30))
    println(getGrade(86))
    println(scoreInRange(77))
    println(scoreInRange(1000))
}

fun getPassOrFail(score: Int): String {
    /* 코틀리에서 if-else는 Expression이기 때문에 아래와 같이 바꿀수 있다.
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
    */
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun scoreInRange(score: Int) {
    if (score in 0..100) {
        println("학생의 점수는 ${score}점 입니다.")
    } else {
        println("올바른 점수를 입력해 주세요.")
    }
}
