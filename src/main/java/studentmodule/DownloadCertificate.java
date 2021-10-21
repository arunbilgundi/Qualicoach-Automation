package studentmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DownloadCertificate extends driverInit {
	public WebDriver driver;
	public DownloadCertificate(WebDriver driver) {
		this.driver=driver;
	}

	public void download() throws Exception {
		login l=new login(driver);
		l.login1();
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
	Actions a = new Actions(driver);
	WebElement move = driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='Selenium Beginners']"));
	a.moveToElement(move).click().build().perform();
	driver.findElement(By.xpath("//*[@aria-controls='collapse7']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Selenium Beg Certificate')]")).click();
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(2000);
	
	}
}
