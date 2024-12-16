package com.example.coroutinelab.async_await

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

// ví dụ 16
suspend fun doSomethingFunny1(): Int {
    delay(1000)
    return 10
}
suspend fun doSomethingFunny2(): Int {
    delay(1000)
    return 20
}
//
//fun main() {
//    runBlocking{
//        val time = measureTimeMillis{
//            val a = doSomethingFunny1()
//            val b = doSomethingFunny2()
//            println("a + b = ${a + b}")
//        }
//        println("Time = $time")
//    }
//}

// ví dụ 17
//fun main() {
//    runBlocking {
//        val time = measureTimeMillis {
//            val a: Deferred<Int> = async { doSomethingFunny1() }
//            val b: Deferred<Int> = async { doSomethingFunny2() }
//            println(a.await() + b.await())
//        }
//        println("Time = $time")
//    }
//}

// ví dụ 18
//fun main() {
//    runBlocking {
//        val job1 = launch {
//            launch {
//                delay(100)
//                println("coroutine 1: Hello")
//                delay(1000)
//                println("coroutine 1: Goodbye")
//            }
//            launch {
//                delay(100)
//                println("coroutine 2: Hello")
//                delay(1000)
//                println("coroutine 2: Goodbye")
//            }
//        }
//        delay(500)
//        job1.cancel()
//    }
//}

// ví dụ 19
//fun main() {
//    runBlocking{
//        val job1 = launch {
//            launch {
//                delay(100)
//                println("coroutine 1: Hello")
//                delay(1000)
//                println("coroutine 1: Goodbye")
//            }
//            launch{
//                delay(100)
//                println("coroutine 2: Hello")
//                delay(1000)
//                println("coroutine 2: Goodbye")
//            }
//            GlobalScope.launch{
//                delay(100)
//                println("coroutine 3: Hello")
//                delay(1000)
//                println("coroutine 3: Goodbye")
//            }
//        }
//        delay(500)
//        job1.cancel()
//        delay(2500)
//    }
//}

// ví dụ 20
//fun main() {
//    runBlocking{
//        val job = launch{
//            repeat(3) {
//                delay(100)
//                println("coroutine:$it")
//            }
//            println("Print from parent")
//        }
//        job.join()
//        delay(1000)
//    }
//}

// ví dụ 21
//fun main() {
//    runBlocking{
//        val job = launch{
//            repeat(3) {
//                launch{
//                    delay(100)
//                    println("coroutine:$it")
//                }
//            }
//            println("Print from parent")
//        }
//        job.join()
//        delay(1000)
//    }
//}

// ví dụ 22
//fun main() {
//    runBlocking {
//        val job = GlobalScope.launch {
//            println("Throw Exception from Launch")
//            throw NullPointerException()
//        }
//        // chờ đợi coroutine hoàn thành
//        job.join()
//        val deferred = GlobalScope.async {
//            println("Throw Exception from Async")
//            throw IndexOutOfBoundsException()
//        }
//    }
//}

// ví dụ 23
//fun main() {
//    runBlocking {
//        val job = GlobalScope.launch {
//            println("Throw Exception from Launch")
//            throw NullPointerException()
//        }
//        // chờ đợi coroutine hoàn thành
//        job.join()
//        val deferred = GlobalScope.async {
//            println("Throw Exception from Async")
//            throw IndexOutOfBoundsException()
//        }
//        deferred.await()
//    }
//}

// ví dụ 24
//fun main() {
//    runBlocking {
//        val job = GlobalScope.launch {
//            try {
//                println("Throw Exception from Launch")
//                throw NullPointerException()
//            } catch (e: NullPointerException) {
//                println(e.toString())
//            }
//        }
//        // chờ đợi coroutine hoàn thành
//        job.join()
//        val deferred = GlobalScope.async {
//            println("Throw Exception from Async")
//            throw IndexOutOfBoundsException()
//        }
//        try {
//            deferred.await()
//        } catch (e: IndexOutOfBoundsException) {
//            println(e.toString())
//        }
//    }
//}

// ví dụ 25
//fun main() {
//    runBlocking {
//        val handler = CoroutineExceptionHandler { _, exception ->
//            println("Error here: ${exception.toString()}")
//        }
//        val job = GlobalScope.launch(handler) {
//            println("Throw Exception from Launch")
//            throw NullPointerException()
//        }
//        // chờ đợi coroutine hoàn thành
//        job.join()
//        val deferred = GlobalScope.async {
//            println("Throw Exception from Async")
//            throw IndexOutOfBoundsException()
//        }
//        try {
//            deferred.await()
//        }catch (e: IndexOutOfBoundsException) {
//            println(e.toString())
//        }
//    }
//}

// ví dụ 26
//fun main() {
//    runBlocking {
//        val handler = CoroutineExceptionHandler { _, exception ->
//            println("Error here: ${exception.toString()}")
//        }
//        val job = GlobalScope.launch(handler + Dispatchers.Default) {
//            println("Throw Exception from Launch")
//            throw NullPointerException()
//        }
//        // chờ đợi coroutine hoàn thành
//        job.join()
//        val deferred = GlobalScope.async(handler) {
//            println("Throw Exception from Async")
//            throw IndexOutOfBoundsException()
//        }
//        deferred.await()
//    }
//}

// ví dụ 27
//fun main() {
//    runBlocking {
//        val handle = CoroutineExceptionHandler {_, exception ->
//            println("Exception: $exception")
//        }
//        val job = GlobalScope.launch(handle) {
//            launch {
//                println("Coroutine 1")
//                delay(300)
//                println("Coroutine 1 continue")
//                throw IndexOutOfBoundsException("Coroutine 1")
//            }
//            launch {
//                println("Coroutine 2")
//                delay(200)
//                throw NullPointerException("Coroutine 2")
//            }
//            launch {
//                println("Coroutine 3")
//                delay(400)
//                println("Coroutine 3 continue")
//                throw ArithmeticException("Coroutine 3")
//            }
//        }
//        job.join()
//        delay(1000)
//    } // end of runBlocking
//}

// ví dụ 28
//fun main() {
//    runBlocking {
//        val handle = CoroutineExceptionHandler {_, exception ->
//            println("Exception: $exception with suppressed ${exception.suppressed.contentToString()}")
//        }
//        val job = GlobalScope.launch(handle) {
//            launch {
//                println("Coroutine 1")
//                delay(300)
//                println("Coroutine 1 continue")
//                throw IndexOutOfBoundsException("Coroutine 1")
//            }
//            launch {
//                try {
//                    delay(Long.MAX_VALUE)
//                } finally {
//                    throw ArithmeticException("Coroutine 2")
//                }
//            }
//
//            launch {
//                println("Coroutine 3")
//                delay(400)
//                println("Coroutine 3 continue")
//                throw ArithmeticException("Coroutine 3")
//            }
//        }
//        job.join()
//        delay(1000)
//    } // end of runBlocking
//}

// ví dụ 29
//fun main() {
//    runBlocking {
//        val supervisorJob = SupervisorJob()
//        with(
//            CoroutineScope(coroutineContext +
//                supervisorJob)
//        ) {
//            val firstChild = launch {
//                println("Print from First Child")
//                throw NullPointerException()
//            }
//            val secondChild = launch {
//                firstChild.join()
//                println("print from second Child. First Child is Active: ${firstChild.isActive}")
//                try {
//                    delay(1000)
//                } finally {
//                    println("Second Child Cancelled")
//                }
//            }
//            firstChild.join()
//            println("Cancelling SupervisorJob")
//            supervisorJob.cancel()
//            secondChild.join()
//        }
//    }
//}

// ví dụ 30
//fun main() {
//    runBlocking {
//        supervisorScope {
//            val firstChild = launch {
//                println("Print from First Child")
//                throw NullPointerException()
//            }
//            val secondChild = launch {
//                firstChild.join()
//                println("print from second Child. First Child is Active: ${firstChild.isActive}")
//                try {
//                    delay(1000)
//                } finally {
//                    println("Second Child Cancelled")
//                }
//            }
//            firstChild.join()
//            secondChild.join()
//        }
//    }
//}

// ví dụ 31
//fun foo(n: Int) : Sequence<Int> = sequence {
//    for (i in 0..n) {
//        if (i % 2 == 0)
//            yield(i)
//    }
//}
//fun main() {
//    foo(10).forEach {
//        println(it)
//    }
//}
//fun main() {
//    foo(10).map{it * it}.forEach {
//        println(it)
//    }
//}
//fun main() {
//    foo(10).filter { it < 8 }.forEach {
//        println(it)
//    }
//}

// ví dụ 32
fun main() {
    runBlocking {
        val foo = foo(200)
        foo(5).collect {
            println("i = $it")
        }
    }
}
fun foo(n : Int): Flow<Int> = flow {
    for(i in 0..n) {
        delay(1000)
        emit(i)
    }
}