package com.lannstark.lec14

/**
 * Data class
 *
 * - Java에서도 record class라고 JDK 16부터 도입됨.
 * - equals, hashcode, toString을 자동을 만들어 준다.
 */
fun main() {
    val dto1 = PersonDto("gilbert", 29)
    val dto2 = PersonDto("gilbert", 39)
    println(dto1 == dto2)
    println(dto1 === dto2)
    println(dto1)
}

data class PersonDto(
    val name: String,
    val age: Int,
)