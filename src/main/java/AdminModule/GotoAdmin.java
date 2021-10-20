package AdminModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import studentmodule.driverInit;



public class GotoAdmin extends driverInit {
	public WebDriver driver;
	
	By userbutton=By.className("userbutton");
	By dashboard=By.id("actionmenuaction-1");
	By administration=By.className("administration");
	
	public void getDashboard() throws NullPointerException {
		
		driver.findElement(userbutton).click();
		driver.findElement(dashboard).click();
	}
	
	public void getAdminstration() throws NullPointerException{
		driver.findElement(administration).click();
		
	}
	
	
}