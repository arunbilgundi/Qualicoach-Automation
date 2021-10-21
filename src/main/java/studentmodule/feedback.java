package studentmodule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class feedback {
public WebDriver driver;
	
	public feedback(WebDriver driver) {
	this.driver=driver;
	}
	public void feedbackformtest() throws IOException {
		login l=new login(driver);
		l.login1();


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='Selenium Beginners']"));
		a.moveToElement(move).click().build().perform();
		try {
		driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[7] "));
		driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[7] / div[1] / div[1] "));
		driver.findElement(By.linkText("Answer the questions"));
	}catch(Exception e) {
		System.out.println("already attempted feedback");
	}
	}	
}
