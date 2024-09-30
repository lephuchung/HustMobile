package example.myapp

//abstract class AquariumFish : FishAction {
//    abstract val color: String
//    override fun eat() = println("yum")
//}

interface FishColor {
    val color: String
}

interface FishAction  {
    fun eat()
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

//class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
//    FishColor by fishColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}

//class Plecostomus:  FishAction, FishColor by GoldColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}

//class Plecostomus: FishAction, FishColor {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class GoldenFish: FishAction, FishColor {
    override val color = "orange"
    override fun eat() {
        println("yummy")
    }
}

//class Shark: AquariumFish(), FishAction {
//    override val color = "grey"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
//}
//
//class Plecostomus: AquariumFish(), FishAction {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}

//class GoldenFish: AquariumFish() {
//    override val color = "orange"
//}