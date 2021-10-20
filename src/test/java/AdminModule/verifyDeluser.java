package AdminModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import studentmodule.driverInit;

public class verifyDeluser {
	driverInit d=new driverInit();
	@Test
	public void VerifyDeleteTest() throws IOException {
		
		WebDriver driver=d.driver();
		DelUser d=new DelUser(driver);
		d.getDelete();
		driver.close();
	}
}
