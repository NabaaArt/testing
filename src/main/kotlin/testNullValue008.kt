import kotlin.math.round

//008 test null value

// making nullable function

fun findGrowthAverage1(age :Int , height :Int ): Int ?{
    if (age !in 1..18||height !in 30 ..210){
        return null
    }else{
        return round( height.toDouble()/ age.toDouble()).toInt()
    }

}