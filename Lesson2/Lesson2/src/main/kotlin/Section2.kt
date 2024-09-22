fun main(){
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println("isUnit: $isUnit")
    println("----------------------------")
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println("isHot: $isHot")
    println("----------------------------")
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
}