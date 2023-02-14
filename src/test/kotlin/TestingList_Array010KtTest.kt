import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TestingList_Array010KtTest {

    @Test
    fun should_ReturnSortedListOfLargestThreeNumbers_When_EnterAListLargerThanThree() {
        //given a list of 4 positive integers
        val listCotainFourNumbers = listOf(4,6,2,9)
        //when find the largest 3 numbers
        val largestThreeNumbers =getLargestThreeNumbersOrNull(listCotainFourNumbers)
        //then check if it is getting correct largest three numbers
        assertEquals(listOf(9,6,4),largestThreeNumbers)


    }

    @Test
    fun should_ReturnSortedArrayOfLargestThreeNumbers_When_EnterAListLargerThanThree() {
        //given a list of 4 positive integers
        val listCotainFourNumbers1 = arrayOf(4,6,2,9)
        //when find the largest 3 numbers
        val largestThreeNumbers1 =getLargestThreeNumbersOrNull1(listCotainFourNumbers1)
        //then check if it is getting correct largest three numbers

   /**   assertEquals(arrayOf(9,6,4),largestThreeNumbers1) **/

         // it will cause an error
        // to fix it
        assertArrayEquals(arrayOf(9,6,4),largestThreeNumbers1)

    }
}