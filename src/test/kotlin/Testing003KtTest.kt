import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class Testing003KtTest {

    @Test
    fun sumTwoNumbers3FirstTaste() {
        assertEquals(8,sumTwoNumbers3(3,5))
    }
    @Test
    fun sumTwoNumbers3SecondTaste() {
        assertEquals(-8,sumTwoNumbers3(-3,-5))
    }
    @Test
    fun sumTwoNumbers3ThirdTaste() {
        assertEquals(2,sumTwoNumbers3(-3,5))
    }
     //if we run this test cases it will have 3 errors
    // to solve it delete abs from the dunction

}