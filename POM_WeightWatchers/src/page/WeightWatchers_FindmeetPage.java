package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeightWatchers_FindmeetPage {
	WebDriver driver;
	
	public WeightWatchers_FindmeetPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Find a Meeting')]")
	WebElement Find_meeting;
	
	
	public void Findmeeting_click(){
		
		Find_meeting.click();
			
		}
		
		public void verify_Findmeetings()
		{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Get Schedules & Times Near You";
		//assertEquals(expectedTitle,actualTitle);
		assertTrue(driver.getTitle().contains("Get Schedules & Times Near You"));
		System.out.println(actualTitle);
		
		}

		
}
