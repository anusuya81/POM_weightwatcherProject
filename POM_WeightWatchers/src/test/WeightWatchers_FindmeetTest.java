package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.WeightWatchers_FindmeetPage;
import page.WeightWatchers_Homepage;
import util.BrowserFactory;

public class WeightWatchers_FindmeetTest {
	@Test
	public void weightwatchtest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");
		
	
	WeightWatchers_FindmeetPage FindmeetPage = PageFactory.initElements(driver, WeightWatchers_FindmeetPage.class);
	 FindmeetPage.Findmeeting_click();
	 FindmeetPage.verify_Findmeetings();
	 
	 driver.close();

	driver.quit();
					
	}
			
}
