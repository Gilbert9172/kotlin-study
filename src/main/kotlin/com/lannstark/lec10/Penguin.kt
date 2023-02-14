package com.lannstark.lec10

/**
 * `[ 인터페이스 구현 ]`
 *
 * - 인터페이스 구현도 :을 사용한다.
 * - 중복되는 인터페이스를 특정할 떄 `super<타입>.함수` 사용.
 */
class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    // 프로퍼티를 오버라이드 할 때, 부모의 프로퍼티 앞에 open 키워드를 붙혀줘야 한다.
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 10
}