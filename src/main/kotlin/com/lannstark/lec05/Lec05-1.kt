package com.lannstark.lec05

/**
 * if/if-else/if-else if-else 모두 Java와 문법이 동일하다.
 * 코틀린에서는 Expression으로 취급한다.
 * 때문에 코틀린에는 삼항연산자가 없다.
 * Java의 Switch는 Kotlin에서 when으로 대체되었고,
 * when은 더 강력한 기능을 갖는다.
 */
fun main() {
    validateScoreIsnotNegative(30)
}

fun validateScoreIsnotNegative(score: Int): Unit {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없다.")
    }
}
