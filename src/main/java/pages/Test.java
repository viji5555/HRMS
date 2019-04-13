package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {
	public static RemoteWebDriver driver;
	public static Properties locators;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.peopleworks.ind.in/");
		driver.manage().window().maximize();
		
		locators = new Properties();
		
		locators.load(new FileInputStream(new File("C:\\Users\\vijis\\eclipse-workspace\\HRMS\\src\\main\\java\\Properties12\\Elements.Properties")));
		
		driver.findElementById(locators.getProperty("Login.Username.ID")).sendKeys("vijayalakshmik@sterlingsoftware.co.in");
		Actions robo=new Actions(driver);
		robo.moveToElement(driver.findElementById("Password"));
		robo.click();
		robo.sendKeys("Hemalatha@1994");
		robo.perform();
		
		driver.findElementById(locators.getProperty("Login.submit.ID")).click();
Actions rob=new Actions(driver);
		
		rob.moveToElement(driver.findElementByXPath(locators.getProperty("Homepage.Myself.XPath")));
		rob.build().perform();
		
		
		
		
		
		
		
		
	}

}
