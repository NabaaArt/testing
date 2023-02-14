import kotlin.math.round

// 009 ignoring test in JUnit

//when you want to change condition in function then make a test for that changing after a while when
//you delete your changes in the function and when you try to run your tests it will cause an error

// ho to disable test case

fun findGrowthAverage2(age :Int , height :Int ): Int ? {
    if (age !in 1..72 || height !in 30..210) {
        return null
    } else {
        return round(height.toDouble() / age.toDouble()).toInt()
    }
}