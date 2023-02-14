package com.lannstark.lec11

/**
 * 프로퍼티의 접근 지시어
 */
final class Car(
    internal val name: String, // getter : internal
    private var owner: String, // getter & setter : private
    _price: Int // getter : public, setter : private
) {
    public var price = _price
        private set
}