package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.WeightWatchers_Homepage;
import util.BrowserFactory;

public class WeightWatchers_HomeTest {
	@Test
	public void weightwatchtest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");
					
			
	WeightWatchers_Homepage loginPage = PageFactory.initElements(driver, WeightWatchers_Homepage.class);
			
	loginPage.verify_Weightwatchers();			
	

	driver.close();

	driver.quit();
				
		
	}
}
