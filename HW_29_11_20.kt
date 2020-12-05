package com.example.myapplication


//Написати програму на мові Kotlin, яка буде проходити по циклу від 0 до 100
//і виводити слово Piff для кожного числа, яке кратне 3, і слово Paff,
//для чисел, які кратні 5. Написати хоча б 2 різних варіанта реалізації.


fun main() {

    val div1=3
    val div2=5
    val total=100

    //_____________Option 1_______________
    for (i in 0..total){
        if (i % div1 == 0) {
            println("For+if: $i = Piff")
        }
        if (i % div2 == 0) {
            println("For+if: $i = Paff")
        }
    }

    //_____________Option 2_______________
    val arr = Array(size= total){i -> (i+1)}
    arr.forEach {
        if (it % div1 == 0) println("Array+foreach: $it= Piff")
        if (it % div2 == 0) println("Array+foreach: $it= Paff")
    }

    //_____________Option 3_______________
    var a=0
        while (a<(total+1)){
            if (a % div1 == 0) {
                println("While+if: $a = Piff")
            }
            if (a % div2 == 0) {
                println("While+if: $a = Paff")
            }
            a++
        }
}