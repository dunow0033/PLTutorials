package com.example.pltutorials

class Rectangle (
    val a: Double,
    val b: Double
) : Shape("Rectangle"){

    constructor(a: Double): this(a, a)

    constructor(a: Int, b: Int): this(a.toDouble(), b.toDouble())

    init {
        println("$name created with a = $a and b = $b")
    }

    override fun area() = a * b

    override fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}