package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Homepage {
	
	public RemoteWebDriver driver;
	public Properties locators;
	
	/*
	 * public Homepage(WebDriver driver) { driver=this.driver;
	 * 
	 * }
	 */

	
	public Homepage Attendacedetails() throws FileNotFoundException, IOException, InterruptedException {
	//	driver=new ChromeDriver();

		locators = new Properties();
		
		locators.load(new FileInputStream(new File("C:\\Users\\vijis\\eclipse-workspace\\HRMS\\src\\main\\java\\Properties12\\Elements.Properties")));
		
		Actions rob=new Actions(driver);
		
		rob.moveToElement(driver.findElementByLinkText(locators.getProperty("Homepage.Myself.LinkText")));
		//rob.click();
		  rob.build().perform();

		  rob.moveToElement(driver.findElementByLinkText(locators.getProperty(
		  "Homepage.Myattendace.Linktext")));
		  rob.build().perform();
		  
		  
		  rob.moveToElement(driver.findElementByLinkText(locators.getProperty(
		  "Homepage.AttendaceDetail.Linktext"))); //ob.click(); 
		  rob.click();
		 
		
		Thread.sleep(3000);
		
		
		
		
		
		return this;
		
	}

}
