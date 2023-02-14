package testHelpUsInRealLife012

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import testingClass011.temperatureConverter



// @AfterAll notation it will execute the functions at the last
class temperatureConverter1Test {

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    internal class temperatureConverter1Test {

        lateinit var converter: temperatureConverter1

        @BeforeAll
        fun setup() {
            converter = temperatureConverter1()
        }


        @Test //this is notation
        fun should_ReturnCorrectKelvin_When_EnterFahrenheit() {
            //given
            val fehrenheit = 113.0
            //when
            val kelvin = converter.fahrenheitToKelvin1(fehrenheit)
            //then
            assertEquals(318.15, kelvin)
        }
    }
}