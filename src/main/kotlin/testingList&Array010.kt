//010 testing list and array in kotlin using junit

fun main() {
    val largestThreeNumbers = getLargestThreeNumbersOrNull(listOf(4,6,2,9))
    largestThreeNumbers?.forEach{
        println(it)
    }
    // if we make it array
    val largestThreeNumbers1 = getLargestThreeNumbersOrNull1(arrayOf(4,6,2,9))
    largestThreeNumbers1?.forEach{
        println(it)
    }

    println(largestThreeNumbers1)
    // this line will print : [Ljava.lang.Integer;@3feba861
    //and that means when you deal with array , it will compare this array address with another array address in the memory
}

fun getLargestThreeNumbersOrNull1(inputArray:Array<Int>):Array<Int>{
    return inputArray.sortedDescending().take(3).toTypedArray()
}

fun getLargestThreeNumbersOrNull(inputList:List<Int>):List<Int>{
    return inputList.sortedDescending().take(3)
}