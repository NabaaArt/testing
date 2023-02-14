import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled

class IgnoringTests009KtTest {

    @Test
    @Disabled
    fun should_ReturnMinus1_WHen_AgeLargestThan18() {
        //given correct height and wrong age
        val age =25
        val height =175
        //when calculate the average
        val average = findGrowthAverage2(age ,height)
        //then check the result
        assertNull(average)

    }
}