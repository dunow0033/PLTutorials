package com.example.pltutorials

abstract class Shape(
    var name: String
) {
    constructor(name: String, vararg dimensions: Double) : this(name)

    init {
        println("I am the super class!")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }
}