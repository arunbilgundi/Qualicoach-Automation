package AdminModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import studentmodule.driverInit;

public class verifyEnroll  {

	driverInit d=new driverInit();
	
	
	@Test
	public void AddUserTest() throws IOException
	{
		WebDriver driver=d.driver();
		EnrollnewUser e=new EnrollnewUser(driver);
		e.getUserEnroll();
		driver.close();
	}
}
