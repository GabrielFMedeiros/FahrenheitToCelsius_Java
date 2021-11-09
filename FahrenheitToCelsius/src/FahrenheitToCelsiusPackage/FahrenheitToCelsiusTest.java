package FahrenheitToCelsiusPackage;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FahrenheitToCelsiusTest {
	FahrenheitToCelsiusJava convertor = new FahrenheitToCelsiusJava();
	
	@DataProvider(name="test-data")
	public Object[][] dataProv(){
		return new Object[][] {
			{32, 0},
			{50, 10},
			{212, 100},
			{-40, -40},
			{-459.67, -273.15}
		};
	}
	
	@Test(dataProvider="test-data")
	public void convert_Fahrenheit_To_Celsius(double args1, double args2) {
		System.out.println("Test convert Fahrenheit_To_Celsius");
		double value = convertor.convertFahrenheitToCelsius(args1);
		double asserts = args2;
		assertTrue(value == asserts);
	}
}
