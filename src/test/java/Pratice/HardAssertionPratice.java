package Pratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPratice {
	@Test
	public void strictLevelComparision() {
		String expectedName = "Ramu";
		String actualName = "Umar";
		System.out.println("Hard Assertion Starts");
		Assert.assertEquals(actualName, expectedName);
		Assert.assertEquals(actualName.equals(expectedName), true);
		System.out.println("Hard Assertion mid ");
		Assert.assertFalse(actualName.equals(expectedName));
		Assert.assertTrue(actualName.contains(expectedName));
		System.out.println("Hard Assertion End's");
		
	}

}
