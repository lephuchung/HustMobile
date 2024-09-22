fun main(){
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
    println("----------------------------")
    feedTheFish4()
}
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun feedTheFish4() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

//fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
//    return when {
//        temperature > 30 -> true
//        dirty > 30 -> true
//        day == "Sunday" ->  true
//        else -> false
//    }
//}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"