package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.WeightWatchers_FindmeetPage;
import page.WeightWatchers_FirstresultPage;
import page.WeightWatchers_Homepage;
import util.BrowserFactory;

public class WeightWatchers_FirstresultTest {
	@Test
	public void weightwatchtest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");
		
	WeightWatchers_Homepage loginPage = PageFactory.initElements(driver, WeightWatchers_Homepage.class);
	loginPage.verify_Weightwatchers();			
	
	
	WeightWatchers_FindmeetPage FindmeetPage = PageFactory.initElements(driver, WeightWatchers_FindmeetPage.class);
	 FindmeetPage.Findmeeting_click();
	 FindmeetPage.verify_Findmeetings();
	
	 WeightWatchers_FirstresultPage FirstresultPage= PageFactory.initElements(driver, WeightWatchers_FirstresultPage.class);
	 FirstresultPage.send_info();
	 FirstresultPage.verify_firstresult();
	 FirstresultPage.Hours_of_operation();
	 driver.close();

	driver.quit();
					
	}
}
