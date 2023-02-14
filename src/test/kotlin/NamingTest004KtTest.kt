import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NamingTest004KtTest {

    @Test
    fun isEven() {
        fun should_ReturnTrue_when_TheNumberIsEven(){
            assertEquals(true,isEven(4))
            //or
            assertTrue(isEven(4))
        }
        fun should_ReturnFalse_when_TheNumberIsOdd(){
            assertFalse(isEven(9))
        }
        fun isEven_theNumberIsEven_returnTrue(){
            assertTrue(isEven(2))
        }
    }
}