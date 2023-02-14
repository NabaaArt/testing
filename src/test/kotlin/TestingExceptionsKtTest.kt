import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.lang.reflect.Executable

class TestingExceptionsKtTest {

    @Test
    fun should_throwException_when_SecondNumberIsZero() {
      //given two numbers the second one is zero
        val firstNumber=5
        val secondNumber = 0
        // when divide by zero
        val divideExecutable:org.junit.jupiter.api.function.Executable = org.junit.jupiter.api.function.Executable {divide(firstNumber,secondNumber)}
        // then exception should be thrown
     assertThrows(Exception::class.java,divideExecutable)

        // it takes 2 parameters (class , executable (class from junit) )
        //we need to check in assertThrows function otherwise it will get checked in divideExecutable
        // the rest of the function won't execute!!!!
    }
}