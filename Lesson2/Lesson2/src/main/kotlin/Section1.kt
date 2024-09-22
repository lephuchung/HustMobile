fun main(args: Array<String>){
    fun printHelloInside(){
        println("Hello inside")
    }
    printHelloInside()
    printHelloOutside()
    println("----------------------------")
    val tempString: String = "world"
    println("Hello, ${if (args.size != 0) args[0] else tempString}")
}

fun printHelloOutside(){
    println("Hello outside")
}