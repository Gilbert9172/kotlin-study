package com.lannstark.lec14

/**
 * 3. Sealed Class & Sealed Interface
 *
 *  `[ Sealed Class ]`
 *  - 추상 클래스를 만들었지만, 사용자가 지정한 클래스에서만 해당 클래스를
 *  상속받을 수 있게 끔 한 클래스
 * - 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다. 즉, 런타임때 클래스 타입이 추가될 수 없다.
 * - 하위 클래스는 이 Sealed Class와 같은 패키지에 있어야 한다.
 *
 *
 * Enum 클래스와의 차이
 *
 * - 클래스를 상속 받을 수 있다.
 * - 하위 클래스는 하나 이상의 인스턴스를 생성할 수 있다.
 */

fun main() {
    handleCar(Avante())
}


private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println("자동차 아반테")
        is Sonata -> println("자동차 소나타")
        is Grandeur -> println("자동차 그렌저")
    }

}

sealed class HyundaiCar(
    val name: String,
    val price: Long,
)

class Avante : HyundaiCar("아반테", 1000L)
class Sonata : HyundaiCar("소나타", 2000L)
class Grandeur : HyundaiCar("그렌저", 3000L)