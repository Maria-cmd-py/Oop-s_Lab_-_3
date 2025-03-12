package TemperatureConverter;
public class WeatherApp {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        // Convert Celsius to Fahrenheit
        converter.convertTemperature(25.0); // 25°C to Fahrenheit
        // Convert Fahrenheit to Celsius
        converter.convertTemperature(77.0, true); // 77°F to Celsius
        // Convert Celsius to Kelvin
        converter.convertTemperature(25.0, "Kelvin"); // 25°C to Kelvin
    }
}