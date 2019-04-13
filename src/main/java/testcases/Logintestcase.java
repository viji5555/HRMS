package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import pages.Homepage;

public class Logintestcase {
	
	
	@Test
	public void Login12() throws InterruptedException, FileNotFoundException, IOException {
		new pages.Login()
		.URL()
		.username()
		.pwd()
		.Submit();
		new Homepage()
		.Attendacedetails();
		
		
		
		
		
		
		
		
		
	}

}
