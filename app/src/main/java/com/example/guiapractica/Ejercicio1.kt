package com.example.guiapractica

fun main(){
    val res1 = sumar(1,5)
    val res2 = sumar(-5,100)
    val res3 = sumar(null,null)
    val res4 = sumar(10,10)
    val res5 = sumar(null, 100)
    val res6 = sumar(500, null)
    val res7 = sumar(10, null)
    val res8 = sumar(10, -5)
    val res9 = sumar(-100, -5)
    val res10 = sumar(0,0)

    println("Test1 passed ${res1==6}")
    println("Test2 passed ${res2==-1}")
    println("Test3 passed ${res3==-2}")
    println("Test4 passed ${res4==20}")
    println("Test5 passed ${res5==100}")
    println("Test6 passed ${res6==500}")
    println("Test7 passed ${res7==10}")
    println("Test8 passed ${res8==-1}")
    println("Test9 passed ${res9==-1}")
    println("Test10 passed ${res10==0}")
}

fun sumar(n1: Int?, n2: Int?):Int {
    var res = -1
    if (n1 != null && n2 != null){
        if (n1 >= 0 && n2 >= 0) {
            res = n1 + n2
        }
    }else{
        if(n1==null && n2==null){
            res=-2
        }else{
            res = n1 ?: n2!!
        }
    }
    return res
}