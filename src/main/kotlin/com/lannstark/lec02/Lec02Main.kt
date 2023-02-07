package com.lannstark.lec02

/**
 * 1. Kotlin에서의 null 체크
 *
 * 코틀린에서는 null이 가능한 타입을 완전히 다르게 취급한다.!!
 * String != String?
 */

// return null 불가능
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("Null이 들어왔습니다.")
    /*
    if (str == null) {
        throw IllegalArgumentException("Null이 들어왔습니다.")
    }
    return str.startsWith("A")
    */
}

// return null 가능
fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A") //→ null을 반환할 수 있기 때문에 Elvis연산자 사용하지 않음
    /*
    if (str == null) {
        return null
    }
    return str.startsWith("A")
    */
}

// return null 불가능
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
    /*
    if (str == null) {
        return false
    }
    return str.startsWith("A")
    */
}

/**
 * 2. Safe Call과 Elvis 연산자
 *
 * - Safe Call: null이 아니면 실행하고, null이면 그래도 return null
 * - Elvis : 앞의 연산결과가 null이면 뒤에 있는 값을 사용한다.
 */
fun main() {

    // <<< Safe Call >>>
    val str: String? = "ABC"

    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // null이 들어올 수 있는 타입의 경우 바로 .length를 사용할 수 없다는 오류
    // println(str.length)
    println(str?.length)    // return 3

    // 변수가 null인 경우
    val str1: String? = null
    println(str1?.length)


    // <<< Elvis >>>
    val str2: String? = "ABC"
    println(str2?.length ?: 0) //=> 앞의 결과가 null이면 return 0

    // <<< never Null >>>
    println(startsWithA4("ABC"))
    //println(startsWithA4(null)) //-> RuntimeError
}

/**
 * 3. 무조건 Null이 아닌 경우!
 *
 * - !!
 * - 절대로 NULL이 들어올 수 없기 때문에 컴파일러에서 에러가 생기지 않음
 */
fun startsWithA4(str: String?):Boolean {
    return str!!.startsWith("A")
}


