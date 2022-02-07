package com.example.guiapractica

fun main() {
    val test1 = readArray(arrayListOf<Int>(5,5,5,5))
    val test2 = readArray(arrayListOf<Int>(0,0,0))
    val test3 = readArray(arrayListOf<Int>(10,10,20,20,20))
    val test4 = readArray(arrayListOf<Int>(15,20,15))
    val test5 = readArray(arrayListOf<Int>())
    val test6 = readArray(arrayListOf<Int>(60,80,100))
    val test7 = readArray(arrayListOf<Int>(2,4,6,10))
    val test8 = readArray(arrayListOf<Int>())
    val test9 = readArray(arrayListOf<Int>(124,140,180))
    val test10 = readArray(arrayListOf<Int>(-6,-6,-6,-6))

    //Tests
    println("Test1 passed ${test1==20}")
    println("Test2 passed ${test2==0}")
    println("Test3 passed ${test3==80}")
    println("Test4 passed ${test4==50}")
    println("Test5 passed ${test5==-1}")
    println("Test6 passed ${test6==240}")
    println("Test7 passed ${test7==22}")
    println("Test8 passed ${test8==-1}")
    println("Test9 passed ${test9==444}")
    println("Test10 passed ${test10==-24}")
}

fun readArray(array: ArrayList<Int>) : Int{
    var res = 0
    if (array.isEmpty()){
        res = -1
    }else{
        for (number in array){
            res += number
        }
    }
    return res
}