package TemperatureConverter;
class TemperatureConverter {
    // Method to convert Celsius to Fahrenheit
    double convertTemperature(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        return fahrenheit;
    }
    // Method to convert Fahrenheit to Celsius
    double convertTemperature(double fahrenheit, boolean isFahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        return celsius;
    }
    // Method to convert Celsius to Kelvin
    double convertTemperature(double celsius, String unit) {
        if (unit.equalsIgnoreCase("Kelvin")) {
            double kelvin = celsius + 273.15;
            System.out.println(celsius + "°C is equal to " + kelvin + "K");
            return kelvin;
        } else {
            System.out.println("Invalid unit for conversion.");
            return -1;
        } } }
