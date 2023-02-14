package testingClass011

class temperatureConverter {

    fun celsiusToFahrenheit(celsius :Double):Double{
        return celsius*(9.0/5.0)+32
    }

    fun celsiusToKelvin(celsius :Double):Double{
        return celsius + 273.15
    }

    fun fahrenheitToCelsius(fahrenheit :Double):Double{
        return (fahrenheit-32) *(5.0/9.0)
    }

    fun fahrenheitToKelvin(fahrenheit :Double):Double{
        return (fahrenheit-32) *(5.0/9.0)+273.15
    }
    fun kelvinToCelsius(kelvin :Double):Double{
        return kelvin-273.15
    }

    fun kelvinToFahrenheit(kelvin :Double):Double{
        return (kelvin-273.15) *(9.0/5.0) +32
    }


}