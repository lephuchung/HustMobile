fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    Lesson1p2()
    Lesson1p3()
    Lesson1p4()
    Lesson1p5()
}

fun Lesson1p2(){
    println("1 + 1 = ${1 + 1}")
    println("53 - 3 = ${53 - 3}")
    println("50 / 10 = ${50 / 10}")
    println("1.0 / 2.0 = ${1.0 / 2.0}")
    println("2.0 * 3.5 = ${2.0 * 3.5}")
    println("----------------------------------")
    println("6 * 50 = ${6 * 50}")
    println("6.0 * 50.0 = ${6.0 * 50.0}")
    println("6 * 50.0 = ${6 * 50.0}")
    println("----------------------------------")
    println("2.times(3) = ${2.times(3)}")
    println("3.5.plus(4) = ${3.5.plus(4)}")
    println("2.4.div(2) = ${2.4.div(2)}")
    println("----------------------------------")
    val i: Int = 6
    val b1 = i.toFloat()
    println("i = $i")
    println("b1 = $b1")
    println("----------------------------------")
    val b2: Byte = 1
//    val i1: Int = b2
//    val i2: String = b2
//    val i3: Double = b2
    val i4: Int = b2.toInt()
    val i5: String = b2.toString()
    val i6: Double = b2.toDouble()
    println("b2 = $b2")
    println("i4 = $i4")
    println("i5 = $i5")
    println("i6 = $i6")
    println("----------------------------------")
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println("oneMillion = $oneMillion")
    println("socialSecurityNumber = $socialSecurityNumber")
    println("hexBytes = $hexBytes")
    println("bytes = $bytes")
    println("----------------------------------")
    var fish = 1
    fish = 2
    val aquarium = 1
//    aquarium = 2
    println("fish = $fish")
    println("aquarium = $aquarium")
    println("----------------------------------")
    var lakes: Int = 2
//    lakes = 2.5
    println("lakes = $lakes ")
    println("----------------------------------")
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")
}

fun Lesson1p3(){
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
    println("----------------------------------")
    val fish = 50
    if (fish in 1..100) {
        println("fish = $fish")
    }
    println("----------------------------------")
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
    println("----------------------------------")
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}

fun Lesson1p4(){
//    var rocks: Int = null
    var rocks: Int? = null
    println("rocks = $rocks")
    println("----------------------------------")
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
        println("fishFoodTreats = $fishFoodTreats")
    }
    rocks = rocks?.dec() ?: 0
    println("rocks = $rocks")
    println("----------------------------------")
//    var s: String? = null
    var s: String? = "Hello world"
    val len = s!!.length
    println("len = $len")
}

fun Lesson1p5(){
    val school = listOf("mackerel", "trout", "halibut")
    println("school = $school")
    println("----------------------------------")
    val myList: MutableList<String> = mutableListOf("tuna", "salmon", "shark")
    println("myList = $myList")
    myList.remove("shark")
    println("myList = $myList")
    println("myList[1] = ${myList[1]}")
//    myList[1] = 2
    myList[1] = "dolphin"
    println("myList = $myList")
    println("----------------------------------")
    val school2 = arrayOf("shark", "salmon", "minnow")
//    println("school2 = ${school2}")
    println("school2 = ${java.util.Arrays.toString(school2)}")
    println("----------------------------------")
    val mix = arrayOf("fish", 2)
    println("mix = ${java.util.Arrays.toString(mix)}")
//    mix[2] = 2 // Can't add element into array
    mix[1] = 3 // Can re-assign element
    println("mix = ${java.util.Arrays.toString(mix)}")
    println("----------------------------------")
    val numbers = intArrayOf(1,2,3)
    println("numbers = ${java.util.Arrays.toString(numbers)}")
//    numbers[2] = "hehe"; // Only int is allowed
    numbers[2] = 4;
    println("numbers = ${java.util.Arrays.toString(numbers)}")
    println("----------------------------------")
    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers2
    println("numbers2 = ${java.util.Arrays.toString(numbers2)}")
    println("numbers3 = ${java.util.Arrays.toString(numbers3)}")
    println("foo2 = ${java.util.Arrays.toString(foo2)}")
    println(foo2[5])
    println("----------------------------------")
    val numbers4 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers4, oceans, "salmon")
    val odd3List = arrayOf(numbers4, oceans, "salmon")
    val odd2List = listOf(java.util.Arrays.toString(numbers4), oceans, "salmon")
    println("oddList = $oddList")
    println("odd2List = $odd2List")
    println("odd3List = ${java.util.Arrays.toString(odd3List)}")
    println("----------------------------------")
    val array = Array (5) { it * 2 }
    println("array = ${java.util.Arrays.toString(array)}")
    println("----------------------------------")
    val school3 = arrayOf("shark", "salmon", "minnow")
    for (element in school3) {
        print(element + " ")
    }
    print("\n")
    for ((index, element) in school3.withIndex()) {
        println("Item at $index is $element")
    }
    println("----------------------------------")
    for (i in 1..5) print(i)
    print("\n")
    for (i in 5 downTo 1) print(i)
    print("\n")
    for (i in 3..6 step 2) print(i)
    print("\n")
    for (i in 'd'..'g') print (i)
    print("\n")
    println("----------------------------------")
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water")

    repeat(2) {
        println("A fish is swimming")
    }
}
