
//

package testHelpUsInRealLife012

class temperatureConverter1 {

    fun celsiusToKelvin1(celsius :Double):Double{
        return celsius + 273.15
    }
    fun fahrenheitToCelsius1(fahrenheit :Double):Double{
        return (fahrenheit-32) *(5.0/9.0)
    }

    fun fahrenheitToKelvin(fahrenheit :Double):Double{
        return (fahrenheit-32) *(5.0/9.0)+273.15
    }

// you can change this function to a better one (like may it have duplicated code )

    fun fahrenheitToKelvin1(fahrenheit :Double):Double{
        return celsiusToKelvin1(fahrenheitToCelsius1(fahrenheit))
    }


}