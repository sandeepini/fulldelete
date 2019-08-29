package com.actitime.sampletest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void createUserTest(){
		System.out.println("test1");
	}
	
	
	@Test
	public void modifyUserTest(){
		System.out.println("test2");
	}
	
	
	@Test
	public void deleteUserTest(){
		
		WebDriver driver = new ChromeDriver();
		System.out.println("test3");
		driver.close();
		
	}

}
