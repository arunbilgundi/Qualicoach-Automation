package Qualicoach;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import studentmodule.DownloadCertificate;
import studentmodule.EnrollCourse;
import studentmodule.UpdateProfile;

import studentmodule.driverInit;
import studentmodule.feedback;
import studentmodule.login;
import studentmodule.quiz;



public class StudentModuleTest extends driverInit
{

	public WebDriver driver;					//declare driver


	@Test
	public void loginChecktest() throws IOException
	{
		driver=driver();
		login l = new login(driver);
		l.login1();	
		driver.close();
		
	}

	@Test
	public void EnrollChecktest() throws IOException {
		driver=driver();
		EnrollCourse b= new EnrollCourse(driver);
		b.enroll();
		driver.close();
	}
	
	@Test
	public void UpdateProfiletest() throws IOException {
		driver=driver();
		UpdateProfile p=new UpdateProfile(driver);
		p.update();
		driver.close();
		
	}
	
//	@Test
	public void Downloadtest() throws Exception {
		driver=driver();
		DownloadCertificate c=new DownloadCertificate(driver);
		c.download();
		driver.quit();
	}
	
	@Test
	public void quizattempttest() throws IOException {
		driver=driver();
		quiz q=new quiz(driver);
		q.quizattempt();
		driver.close();
	}
	
	@Test
	public void feedbackformtest() throws IOException {
		driver=driver();
		feedback f=new feedback(driver);
		f.feedbackformtest();
		driver.close();
	}
	}
	
	
	
	
	
	
	
	


