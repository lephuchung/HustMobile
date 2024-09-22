fun main(){
    var dirtyLevel = 20
    val waterFilter1 = { dirty : Int -> dirty / 2}
    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println("waterFilter1: " + waterFilter1(dirtyLevel))
    println("waterFilter2: " + waterFilter2(dirtyLevel))
    println("----------------------------")
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))
    println(updateDirty(15, ::increaseDirty))
    println("----------------------------")
    var dirtyLevel6 = 19
    dirtyLevel6 = updateDirty(dirtyLevel6) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel6)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
fun increaseDirty( start: Int ) = start + 1