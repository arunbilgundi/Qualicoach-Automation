package studentmodule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UpdateProfile extends driverInit {
	
	public WebDriver driver;
	public UpdateProfile(WebDriver driver) {
		this.driver=driver;
	}

	
	public void update() throws IOException {
		login l=new login(driver);
		l.login1();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='userbutton']")).click();
		driver.findElement(By.xpath("//*[@data-title='profile,moodle']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit profile')]")).click();
		driver.findElement(By.xpath("//*[@id='id_firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='id_firstname']")).sendKeys("Test141");
		driver.findElement(By.xpath("//*[@value='Update profile']")).click();
			
}
}
