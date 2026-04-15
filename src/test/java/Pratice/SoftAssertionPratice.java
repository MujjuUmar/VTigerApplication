package Pratice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPratice {
	@Test
	public void softAssertion() {
		String expectedFood = "Biryani";
		String actualFood = "Chicken Biryani";
		System.out.println("Soft Assertion Starts");
		SoftAssert s = new SoftAssert();
		s.assertEquals(expectedFood, actualFood);
		s.assertTrue(actualFood.equals(expectedFood));
		System.out.println("Soft Assertion Ends Here");
		s.assertAll();
		
	}
}