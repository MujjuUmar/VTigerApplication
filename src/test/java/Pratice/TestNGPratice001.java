package Pratice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(GenericUtility.ListenersImplimentation.class)
public class TestNGPratice001 {
	
	@Test(priority = 1)
	public void umarWakes() {
		//Assert.fail();
		System.out.println("Good Morning Umar Sath");
	}
	
	@Test(priority = 2 , dependsOnMethods = {"umarWakes", "umarChats"})
	public void umarEats() {
		System.out.println("Umar Eating his W***");
	}
	
	
	@Test(priority = 3 , invocationCount = 0)
	public void umarMakesReels() {
		System.out.println("Umar make great contant");
	}
	
	@Ignore
	@Test(priority = 4)
	public void umarSleeps() {
		System.out.println("Good Night Umar");
	}
	
	
	@Test(priority = -2)
	public void umarChats() {
		System.out.println("I love my wifey");
	}
 
}
