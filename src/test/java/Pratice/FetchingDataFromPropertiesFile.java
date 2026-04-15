package Pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.internal.Either;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fil=new FileInputStream("C:\\Users\\Admin\\Desktop\\JAVA\\Selenium-section3-properties\\Data.properties");
		Properties prop=new Properties();
		prop.load(fil);
		String url=prop.getProperty("Url");
		String UN=prop.getProperty("username");
		String Pw=prop.getProperty("password");
		System.out.println(url);
		System.out.println(UN);
		System.out.println(Pw);
		
		
		
	}

}
