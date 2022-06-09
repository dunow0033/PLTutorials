package com.example.pltutorials

import java.lang.NumberFormatException

fun main(){
    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0, 4.0, 4.0)
    val triangle2 = Triangle(3.0, 3.0, 3.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0, 3.0)

    var integers = (1..10).toList().customFilter { it > 5 }
    var triple = Triple<Int, String, Boolean>(3, "hello", true)
    var customTriple = CustomTriple<Int, String, Boolean>(3, "hello", true)
    customTriple.printTypes()

    var shapes = listOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)
    shapes = shapes.customFilter { it.area() > 20.0 }
    for(shape in shapes) {
        println("${ shape.name }: Area = ${shape.area()}")
    }
}

fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T> {
    val resultList = mutableListOf<T>()
    for(item in this) {
        if(filterFunction(item)) {
            resultList.add(item)
        }
    }

    return resultList
}