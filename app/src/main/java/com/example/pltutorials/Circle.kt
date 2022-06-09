package com.example.pltutorials

import kotlin.random.Random
import kotlin.math.PI
import kotlin.math.pow

class Circle (
    val radius: Double
) : Shape("Circle"){

    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init {
        println("$name created with radius = $radius")
    }

    override fun area() = radius.pow(2) * ImportantNumbers.PI

    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}