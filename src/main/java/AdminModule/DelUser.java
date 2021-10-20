package AdminModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import studentmodule.login;



public class DelUser extends GotoAdmin {
	By users=By.xpath("//a[text()='Users']");
	By Edit=By.xpath("//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[1] /a[text()='Browse list of users']");
	By textbox=By.cssSelector("input[id='id_realname']");
	By filter=By.cssSelector("input[id='id_addfilter']");
	By row=By.xpath("//*[@class='lastrow'] /td[6] /a[1]");
	By delete=By.cssSelector("input[value='Delete']");
	public WebDriver driver;
	 public DelUser(WebDriver driver) {
		
		 this.driver=driver;
	}
	public void getDelete() throws IOException {
		login l=new login(driver);
		l.login2();
			getDashboard();
			getAdminstration();
			driver.findElement(users).click();
			driver.findElement(Edit).click();
			driver.findElement(textbox).sendKeys("Veena K M");
			driver.findElement(filter).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(row).click();
			driver.findElement(delete).click();
			
			
	 }
}
