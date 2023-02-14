import kotlin.math.round

// 007 test driven development TTD

// means you have to write test unit (or the program)before writing the unit

// requirements : write a function that accept age (years) and height (centimeter)then find the average growth in centemeter per year
//the function should accept age from 1 to 18 and height from 30 cm to 210 cm else the function should return -1

fun findGrowthAverage(age :Int , height :Int ): Int {
    if (age in 1..18&&height in 30 ..210){
        //or(age !in 1..18 || height !in 30 ..210) return -1
      var result =height.toDouble()/ age.toDouble()
       return round( result).toInt()
    }else{
        return -1
    }

}

fun main() {
    println( findGrowthAverage(18,192))
    println( round(3.6))
}