package Pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssessingOrangeHRMUsingDDD {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\JAVA\\Selenium-section3-properties\\OrangeHRM.properties");
		Properties prop=new Properties();
		prop.load(file);
		String url=prop.getProperty("Url");
		String UN=prop.getProperty("username");
		String Pw=prop.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(UN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Pw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}