package com.lannstark.lec10

/**
 * 추상 클래스
 *
 * - 추상 프로퍼티가 아니라면 꼭 open을 붙혀줘야 한다.
 * - 추상클래스에서 자동으로 만들어진 getter를 override하려면 override 키워드를 사용해야 한다.
 * - 상위 클래스에 접근하는 키워드는 super로 java와 동일하다.
 * - 자바와 코틀린 모두 추상클래스는 인스턴스화 할 수 없다.
 */
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}