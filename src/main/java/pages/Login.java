package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Login {
	public RemoteWebDriver driver;
	public Properties locators;
	
	
	
	
	
public Login URL() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.peopleworks.ind.in/");
	driver.manage().window().maximize();
	return this;
	
}
	
public Login username() throws InterruptedException, FileNotFoundException, IOException {
	locators = new Properties();
	
	locators.load(new FileInputStream(new File("C:\\Users\\vijis\\eclipse-workspace\\HRMS\\src\\main\\java\\Properties12\\Elements.Properties")));
	
	driver.findElementById(locators.getProperty("Login.Username.ID")).sendKeys("test");
	
	Thread.sleep(3000);
	return this;
	
}
public Login pwd() throws InterruptedException {
	Actions robo=new Actions(driver);
	robo.moveToElement(driver.findElementById("Password"));
	robo.click();
	robo.sendKeys("Hemal");
	robo.perform();
	
	
	
	
	
	
	
	return this;
	
}
public Login Submit() throws InterruptedException {
	//driver.findElementById("btnlogin").click();
	driver.findElementById(locators.getProperty("Login.submit.ID")).click();
	//driver.close();
	Thread.sleep(3000);
	return this;
			//new Homepage(driver);
	
	
}
}
