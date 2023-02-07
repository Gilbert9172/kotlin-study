package com.lannstark.lec02

data class NullCheckPrac(var name: String) {

}

fun main() {
    val instance = NullCheckPrac("Gilbert")
    println(instance.name)
}