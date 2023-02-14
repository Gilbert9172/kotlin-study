package com.lannstark.lec14


/**
 * 1. 컴파일러가 country의 모든 타입을 알고 있어,
 * 다른 타입에 대한 로직(else)를 작성하지 않아도 된다.
 *
 * 2. Enum에 변화가 있으면 알 수 있다.
 *
 * 3. when과 함께 사용함으로써 큰 장점을 갖게 된다.
 */
fun handelCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        // else를 작성하지 않아도 된다. 컴파일 시점에 Country 클래스가 초기화 되기 때문이다.
    }
}

enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
}