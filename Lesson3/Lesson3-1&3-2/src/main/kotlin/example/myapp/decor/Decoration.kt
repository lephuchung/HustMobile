package example.myapp.decor
data class Decoration(val rocks: String) {
}

data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}


fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

//fun makeDecorations() {
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//    println (decoration1.equals(decoration2))
//    println (decoration3.equals(decoration2))
//}
//fun main() {
//    makeDecorations()
//    println(Direction.EAST.name)
//    println(Direction.EAST.ordinal)
//    println(Direction.EAST.degrees)
//}

class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}
fun main() {
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
    println("-----------------------------------------------")
    val equipment = "fish net" to "catching fish"
    val (tool, use) = equipment
    println("$tool is used for $use")
//    val equipment = "fish net" to "catching fish"
//    println("${equipment.first} used for ${equipment.second}")
    println("-----------------------------------------------")
    val numbers = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")
//    val numbers = Triple(6, 9, 42)
//    println(numbers.toString())
//    println(numbers.toList())
    println("-----------------------------------------------")
    val list = listOf(1, 5, 3, 4)
    println(list.sum())
//    val list2 = listOf("a", "bbb", "cc")
//    println(list2.sum())
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })
    for (s in list2.listIterator()) {
        print("$s ")
    }
    println("\n-----------------------------------------------")
    val scientific = hashMapOf(
        "guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio"
    )
    println (scientific.get("guppy"))
    println(scientific.get("zebra fish"))
//    println("scientific.get("swordtail"")
    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
    println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
    println("\n-----------------------------------------------")
    var stringTest : String = "Xin chao Le Phuc Hung"
    println(stringTest + " co khoang trang: " + stringTest.hasSpaces())
    println(stringTest + " co khoang trang: " + stringTest.hasSpaces2())
}

//const val rocks = 3
//val value1 = complexFunctionCall() // OK
//const val CONSTANT1 = complexFunctionCall() // NOT ok
//object Constants {
//    const val CONSTANT2 = "object constant"
//}
//val foo = Constants.CONSTANT2

//class MyClass {
//    companion object {
//        const val CONSTANT3 = "constant in companion"
//    }
//}

fun String.hasSpaces(): Boolean {
    val found = this.indexOf(' ')
    // also valid: this.indexOf(" ")
    // returns positive number index in String or -1 if not found
    return found != -1
}
fun String.hasSpaces2() = indexOf(" ") != -1













