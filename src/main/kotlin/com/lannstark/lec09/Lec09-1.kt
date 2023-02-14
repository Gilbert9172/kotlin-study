package com.lannstark.lec09

/**
 * 클래스와 프로퍼티
 *
 * - kotlin에서는 필드만 만들면 getter, setter를 자동을 만들어준다.
 */
class PersonV0 constructor(name: String, age: Int) {

    val name = name;
    var Int = age;

}

/**
 * constructor 생략가능
 * 파라미터에 직접 필드 정의가능.
 */
class PersonV1(
    val name: String,
    var age: Int
)


fun main() {
    getterAndSetterInKotlin()
    usingJavaClass()
}

/**
 * getter & setter
 *
 * - `.필드`로 사용하면 된다.
 */
fun getterAndSetterInKotlin() {
    val person = PersonV1("Gilbert", 29)
    println(person.name)
    println(person.age)
    person.age = 20
    println(person.age)
}

/**
 * Java클래스 사용할 때도 동일
 */
fun usingJavaClass() {
    val person = JavaPerson("Gilbert", 29)
    println(person.name)
    println(person.age)
    person.age = 20
    println(person.age)
}