package com.example.coroutinelab.coroutinescontext

import android.util.Log
import com.example.coroutinelab.MainActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


//object TestDispatchers {
//    fun runMyFirstCoroutines() {
//        GlobalScope.launch(Dispatchers.Default) {
//            Log.d(
//                MainActivity::class.java.simpleName, "Dispatchers Default run on ${Thread.currentThread().name}")
//        }
//        GlobalScope.launch(Dispatchers.IO) {
//            Log.d(
//                MainActivity::class.java.simpleName, "Dispatchers IO run on${Thread.currentThread().name}")
//        }
//        GlobalScope.launch(Dispatchers.Unconfined) {
//            Log.d(
//                MainActivity::class.java.simpleName, "Dispatchers Unconfined run on ${Thread.currentThread().name}")
//        }
//        GlobalScope.launch(Dispatchers.Main) {
//            Log.d(
//                MainActivity::class.java.simpleName, "Dispatchers Main run on ${Thread.currentThread().name}")
//        }
//    }
//}

object TestDispatchers {
    fun runMyFirstCoroutines() {
        GlobalScope.launch(Dispatchers.Unconfined) {
            Log.d(MainActivity::class.java.simpleName, "Before delay - Dispachers Unconfined run on ${Thread.currentThread().name}")
            delay(1000)
            Log.d(MainActivity::class.java.simpleName, "Dispachers Unconfined run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch(Dispatchers.Main) {
            Log.d(MainActivity::class.java.simpleName, "Dispachers Main run on ${Thread.currentThread().name}")
        }
    }

    fun testMySecondWithContext() {
        GlobalScope.launch(Dispatchers.IO) {
            // Run long time task
            Log.d("myLog", "Run long time task - Thread:${Thread.currentThread().name}")
            delay(2000)
            withContext(Dispatchers.Main) {
                // Update UI here
                Log.d("myLog", "Update UI - Thread:${Thread.currentThread().name}")
            }
        }
    }
}

// Ví dụ 6
//fun main() {
//    val job1: Job = GlobalScope.launch {
//        delay(2000)
//        println("Hello Kotlin")
//    }
//    val job2: Job = GlobalScope.launch {
//        // job2 chờ đợi công việc của job1 hoàn thành rồi mới thực hiện
//        job1.join()
//        delay(1000)
//        println("I'm Coroutine")
//    }
//    Thread.sleep(4000)
//}

// Ví dụ 7
//fun main() {
//    runBlocking {
//        val job = launch(Dispatchers.Default) {
//            repeat(1000) {
//                delay(500)
//                println("I'm sleeping $it ...")
//            }
//        }
//        delay(1500)
//        job.cancel()
//        print("Cancelled coroutines")
//    }
//}

//Ví dụ 8
//fun main() {
//    runBlocking {
//        val startTime = System.currentTimeMillis()
//        val job = launch(Dispatchers.Default) {
//            var nextPrintTime = startTime
//            var i = 0
//            while (i < 5) { // computation loop, just waste CPU
//                // print a message twice a second
//                if (System.currentTimeMillis() >= nextPrintTime) {
//                    println("job: I'm sleeping ${i++} ...")
//                    nextPrintTime += 500
//                }
//            }
//        }
//        delay(1400) // delay a bit
//        println("main: I'm tired of waiting")
//        job.cancelAndJoin() // cancel the job and waits for its completion
//        println("main: Now I can quit")
//    }
//}

// ví dụ 9
//fun main() {
//    runBlocking {
//        val startTime = System.currentTimeMillis()
//        val job = launch(Dispatchers.Default) {
//            var nextPrintTime = startTime
//            var i = 0
//            var isActive: Boolean = true
//            while (isActive) { // computation loop, just waste CPU
//                // print a message twice a second
//                if (System.currentTimeMillis() >= nextPrintTime) {
//                    println("job: I'm sleeping ${i++} ...")
//                    nextPrintTime += 500
//                }
//            }
//        }
//        delay(1400) // delay a bit
//        println("main: I'm tired of waiting")
//        job.cancelAndJoin() // cancel the job and waits for its completion
//        println("main: Now I can quit")
//    }
//}

// ví dụ 10
//fun main() {
//    runBlocking {
//        val job = launch {
//            try {
//                repeat(1000) {
//                    delay(100)
//                    println("Hello Coroutine")
//                }
//            } finally {
//                println("Print from finally")
//            }
//        }
//        delay(300)
//        println("I want stop coroutine")
//        job.cancel()
//    }
//}

// Ví dụ 11
//fun main() {
//    runBlocking {
//        val job = launch {
//            try {
//                repeat(1000) {
//                    delay(100)
//                    println("Hello Coroutine")
//                }
//            } finally {
//                println("Print from finally")
//                delay(100)
//                println("Please print me last times")
//            }
//        }
//        delay(300)
//        println("I want stop coroutine")
//        job.cancel()
//    }
//}

// ví dụ 12
//fun main() {
//    runBlocking {
//        val job = launch {
//            try {
//                repeat(1000) {
//                    delay(100)
//                    println("Hello Coroutine")
//                }
//            } finally {
//                println("Print from finally")
//                withContext(NonCancellable) {
//                    repeat(2) {
//                        delay(100)
//                        println("Print from NonCancellable")
//                    }
//                }
//            }
//        }
//        delay(300)
//        println("I want stop coroutine")
//        job.cancel()
//    }
//}

// ví dụ 13
//fun main() {
//    runBlocking {
//        withTimeout(1800) {
//            repeat(1000) {
//                println("I'm sleeping $it")
//                delay(500)
//            }
//        }
//    }
//}

// ví dụ 14
//fun main() {
//    runBlocking {
//        val result = withTimeoutOrNull(1800) {
//            repeat(1000) {
//                println("I'm sleeping $it")
//                delay(500)
//            }
//            "Done"
//        }
//        println("Result = $result")
//    }
//}

// ví dụ 15
//fun main() {
//    runBlocking {
//        val result = withTimeoutOrNull(1800) {
//            repeat(2) {
//                println("I'm sleeping $it")
//                delay(500)
//            }
//            "Done"
//        }
//        println("Result = $result")
//    }
//}

