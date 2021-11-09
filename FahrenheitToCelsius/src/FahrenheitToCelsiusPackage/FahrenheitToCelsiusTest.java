package FahrenheitToCelsiusPackage;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FahrenheitToCelsiusTest {
	FahrenheitToCelsiusJava convertor = new FahrenheitToCelsiusJava();
	
	@Test
	public void convert_Fahrenheit_To_Celsius() {
		System.out.println("Test convert Fahrenheit_To_Celsius");
		double value = convertor.convertFahrenheitToCelsius(32);
		double asserts = 0;
		assertTrue(value == asserts);
	}
}
