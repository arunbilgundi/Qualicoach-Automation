package AdminModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import studentmodule.driverInit;

public class verifycourse {
	
	

	
	@Test
	public void VerifycourseTest() throws IOException {
		driverInit d=new driverInit();
		WebDriver driver=d.driver();
		NewCourse c=new NewCourse(driver);
		c.getNewCourse();
		driver.close();
	}

}
