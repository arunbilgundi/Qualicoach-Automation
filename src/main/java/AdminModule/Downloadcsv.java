package AdminModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import studentmodule.login;

public class Downloadcsv extends GotoAdmin{

public Downloadcsv(WebDriver driver) {
	this.driver=driver;
}

public void getDownload() throws IOException{
	
	
	login l=new login(driver);
	l.login2();
		getDashboard();
		driver.findElement(By.linkText("Names of resources completed")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='centerpara'] /a /img[@alt='csv']")).click();
		
		
	}
}