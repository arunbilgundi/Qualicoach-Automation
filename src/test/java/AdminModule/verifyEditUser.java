package AdminModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import studentmodule.driverInit;


public class verifyEditUser {

	driverInit d=new driverInit();
	
	@Test
	public void EditUserTest() throws IOException {
		
		WebDriver driver=d.driver();
		UpdatingUserdata E=new UpdatingUserdata(driver);
		E.getEditUser();
		driver.close();
	}
}