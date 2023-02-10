package com.lannstark.lec03

// 기본 타입
/**
 * 코틀린의 변수는 초기값을 보고 타입을 추론하며,
 *
 * 기본 타입들은 간의 변환은 명시적으로 이루어진다.
 */
fun main() {
    val num1 = 3
    //val num2: Long = num1 //-> TypeMismatch
    val num2: Long = num1.toLong()
    val ans = num1.plus(num2)
    println(ans.javaClass.name)


    val num3: Int? = 3
    val num4: Long = num3?.toLong() ?: 0L
    val ans1 = num3?.plus(num4)
    println(ans1?.javaClass?.name)

}
