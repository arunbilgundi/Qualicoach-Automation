package AdminModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import studentmodule.driverInit;

public class verifyDownload {
	
	driverInit d=new driverInit();
	

	@Test
	public void DownloadTest() throws IOException
	{
		//driverInit d=new driverInit();
		WebDriver driver=d.driver();
		Downloadcsv d=new Downloadcsv(driver);
		d.getDownload();
		driver.close();
	}

	
}
