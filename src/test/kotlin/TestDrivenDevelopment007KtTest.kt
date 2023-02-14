import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TestDrivenDevelopment007KtTest {

    @Test
    fun should_ReturnCorrectAverage_When_HaveCorrectInput() {
        //given correct height and age
        val age =10
        val height =110
        //when calculate the average
        val average = findGrowthAverage(age ,height)
        //then check the result
        assertEquals(11,average)

    }
    @Test
    fun should_ReturnMinus1_When_AgeLargestThan18(){
        //given correct height and older age
        val age =25
        val height =175
        //when calculate the average
        val average = findGrowthAverage(age ,height)
        //then check the result
        assertEquals(-1,average)

    }
    @Test
    fun should_ReturnMinus1_When_AgeIsZero(){
        //given correct height and age is zero
        val age =0
        val height =175
        //when calculate the average
        val average = findGrowthAverage(age ,height)
        //then check the result
        assertEquals(-1,average)

    }
    @Test

    fun should_ReturnMinus1_When_AgeIsNegative(){
        //given correct height and wrong age in minus
        val age =-5
        val height =175
        //when calculate the average
        val average = findGrowthAverage(age ,height)
        //then check the result
        assertEquals(-1,average)

    }
    @Test

    fun should_ReturnMinus1_When_HeightSmallerThan30(){
        //given short height and correct age
        val age =16
        val height =25
        //when calculate the average
        val average = findGrowthAverage(age ,height)
        //then check the result
        assertEquals(-1,average)
    }

    @Test
    fun should_ReturnMinus1_When_HeightLargerThan210(){
        //given tall height and correct age
        val age =4
        val height =300
        //when calculate the average
        val average = findGrowthAverage(age ,height)
        //then check the result
        assertEquals(-1,average)
    }

    @Test
    fun should_ReturnMinus1_When_EnterWrongAgeAndHeight(){
        //given wrong height and age
        val age =4
        val height =300
        //when calculate the average
        val average = findGrowthAverage(age ,height)
        //then check the result
        assertEquals(-1,average)
    }

    @Test
    fun should_ReturnCorrectAverage_When_TheAverageCanBeRoundedToNextNumber(){
        //given wrong height and age
        val age =18
        val height =192
        //when calculate the average
        val average = findGrowthAverage(age ,height)
        //then check the result
        assertEquals(11,average)
    }


}