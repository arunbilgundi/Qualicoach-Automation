package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginObj 
{
	public WebDriver driver;
	public loginObj(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement uName()
	{
		return driver.findElement(By.xpath("//input[@id='username']"));
	}
	
	public WebElement pwd()
	{
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	
	public WebElement ok()
	{
	return driver.findElement(By.cssSelector("#loginbtn"));
	}
}
