package com.example.guiapractica

fun main() {

    val test1 = threeValues(10, 10, 10)
    val test2 = threeValues(8, 5, 5)
    val test3 = threeValues(20, 30, 5)
    val test4 = threeValues(4, 8, 18)
    val test5 = threeValues(null, 7, 6)
    val test6 = threeValues(80, 200, 40)
    val test7 = threeValues(15, 12, 7)
    val test8 = threeValues(6, null, 2)
    val test9 = threeValues(9, 50, 100)
    val test10 = threeValues(3, null, null)

     //Test
    println("Test1 Passed ${test1==0}")
    println("Test2 Passed ${test2==-1}")
    println("Test3 Passed ${test3==-2}")
    println("Test4 Passed ${test4==30}")
    println("Test5 Passed ${test5==-100}")
    println("Test6 Passed ${test6==-2}")
    println("Test7 Passed ${test7==-1}")
    println("Test8 Passed ${test8==-100}")
    println("Test9 Passed ${test9==159}")
    println("Test10 Passed ${test10==-100}")

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