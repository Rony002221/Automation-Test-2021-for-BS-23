package net.bs23.automation.exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Base.getDriver();
		
		//Navigating site
		
		driver.get("https://www.phptravels.net/");
		
		//click to tour
		WebElement element = driver.findElement(By.className("text-center tours  active"));
		element.click();
		
		// select tour type
		
		WebElement element = driver.findElement(By.className("chosen-single")).sendKeys("Yacht");;
		element.click();
		
		// select date
		

		WebElement element = driver.findElement(By.id("DateTours")).sendKeys("09/07/2021");;
		element.click();
		
		
		
		
		
	}

}
