import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GivenWhenThen005KtTest {

    @Test
    fun isEven1() {
        //given an odd number
        val numberToCheck =9
        //when check if the number is even
        val result = isEven1(numberToCheck)
        fun isEven_theNumberIsEven_returnTrue(){
            assertTrue(isEven1(2))
        }
    }

    @Test
    fun sumTwoNumbers2() {
        //given two positive numbers
        val firstNumber=3
        val secondNumber=5
        //when find the summation of two numbers

        val sumResult = sumTwoNumbers2(3,5)

        fun sumTwoNumbers3FirstTaste() {
            assertEquals(8,sumTwoNumbers2(3,5))
        }

    }
}