@file:OptIn(DelicateCoroutinesApi::class)

package com.example.coroutinelab.firstcoroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//fun main() {
//    GlobalScope.launch {
//        delay(1000)
//        print("Hello ")
//    }
//    print("World ")
//    Thread.sleep(2000)
//}

fun main() {
    runBlocking {
        delay(1000)
        println("Hello ")
        delay(1000)
        println("World ")
    }
    println("After runBlocking")
}