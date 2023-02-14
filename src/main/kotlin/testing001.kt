import kotlin.math.abs

//001 software testing types
//002 warmup for testing
//mobil application testing , is the expected result is right ??
//manual testing : is correct but it may have errors , and take more time

// we need to make code to test another code with using tools
// unit test: you have to test every unit idevidually , unit it maybe clas or function

// integration test : not only test the unit you should test the integriyty with the class
// and the class that has the database (testing with everything)
// test with ui

fun main() {
println(sumTwoNumbers(3,5)==8)
    println(sumTwoNumbers(-3,-5)==-8)
    println(sumTwoNumbers(-3,5)==2)
    // it has errors because we make it abs value that take positive number
    println(sumTwoNumbers1(3,5)==8)
    println(sumTwoNumbers1(-3,-5)==-8)
    println(sumTwoNumbers1(-3,5)==2)
}

fun sumTwoNumbers (firstNumber :Int, secondNumber: Int ): Int {
    return abs(firstNumber) + abs(secondNumber)
}
fun sumTwoNumbers1 (firstNumber :Int, secondNumber: Int ): Int {
    return firstNumber + secondNumber
}