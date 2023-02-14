package testingClass011

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


//byjus.com for testing cases website

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// this notation used when use instance because the instance is not static

internal  class temperatureConverterTest {

    // we have to make instance for required things

 lateinit var converter :temperatureConverter

    @BeforeAll
    fun setup(){
      converter = temperatureConverter()
      // we have to call this function before test function , use before all notation it will execute first to the test case
     }



    @Test //this is notation
    fun should_ReturnCorrectKelvin_When_EnterFahrenheit() {
        //given
        val fehrenheit =113.0
        //when
         val kelvin = converter.fahrenheitToKelvin(fehrenheit)
        //then
    assertEquals(318.15,kelvin)
    }
}