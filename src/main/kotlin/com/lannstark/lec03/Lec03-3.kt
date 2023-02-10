package com.lannstark.lec03

fun main() {
    // String interpolation / String indexing
    문자열_가공하기()
    인덴트_사용하기()
    특정_문자_가져오기()
}

// 코틀린의 특이한 타입 3가지
/**
 * 1. Any
 *
 *  - Java의 Object와 같음
 *  - 모든 타입의 부모임
 */

/**
 * 2. Unit
 *
 * - Java의 void와 동일한 역할 (생략가능)
 * - Unit은 이 자체로 타입 인자를 사용 가능하다.
 */

/**
 * 3. Nothing
 *
 * - 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
 * - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등...
 */

/**
 * 4. String interpolation / String indexing
 *
 * - ${person.name}
 * - 변수 이름만 사용하더라도 ${}를 사용하는 것이 가독성, 일괄 변화, 정규식 활용 측면엔서 좋다.
 */
fun `문자열_가공하기`() {
    val person: Person = Person("gilbert", 29)
    println("저의 이름은 ${person.name}이고, 나이는 ${person.age} 입니다.")

    val name: String = "kevin"
    println("name = $name")
}

fun `인덴트_사용하기`() {
    val name = "gilbert"
    var str = """
        a
        b
        ${name}
    """.trimIndent()
    println(str)
}

fun `특정_문자_가져오기`() {
    val name = "gilbert"
    println(name[0])
    println(name[1])
    println(name[2])
}
