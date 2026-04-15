package Pratice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(GenericUtility.ListenersImplimentation.class)
public class TestNGPratices {
	
	@Test(priority = 1)
	public void UmarWakes() {
		//Assert.fail();
		System.out.println("Good Morning Umar");
	}
	
	@Test(priority = 2)  
	public void umarEating() {
		System.out.println("Umar Loves Eating Biryani");
	}
	
	@Test(priority = 3)
	public void UmarMakesReels() {
		System.out.println("FAAAHHHHHHH");
	}
	
	@Test(priority = 4)
	public void UmarSleeps() {
		System.out.println("Umar Night");
	}

}
