package AdminModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import studentmodule.driverInit;
import studentmodule.login;


public class verifyLogin{
 
	@Test
	public void firstTest() throws IOException {
		driverInit d=new driverInit();
		WebDriver driver=d.driver();
		login l=new login(driver);
		l.login2();
		driver.close();
	}
	
	
}
