package com.example.guiapractica

fun main() {

    val test1 = threeValues(5, 10, 5)

     //Test
    println("Test1 Passed ${test1==-2}")
}

fun threeValues(firstValue : Int?, secondValue : Int?, thirdValue : Int?): Int {
    var res = 0
    if (firstValue != null && secondValue != null && thirdValue != null) {
        if (firstValue > secondValue && firstValue > thirdValue){
            res = -1
        }else if (secondValue > firstValue && secondValue > thirdValue){
            res = -2
        }else if (thirdValue > firstValue && thirdValue > secondValue){
            res = firstValue + secondValue + thirdValue
        }else if (firstValue == secondValue && firstValue == thirdValue && secondValue == firstValue && secondValue == thirdValue && thirdValue == firstValue && thirdValue == secondValue){
            res = 0
        }
    }else{
        res = -100
    }
    return res
}