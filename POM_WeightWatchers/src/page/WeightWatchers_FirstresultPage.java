package page;

import static org.junit.Assert.assertTrue;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeightWatchers_FirstresultPage {
	WebDriver driver;
	
	public WeightWatchers_FirstresultPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	@FindBy(how=How.XPATH,using="//input[@type='text'][@placeholder='City and state or ZIP code']")
	WebElement Zipcode;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default form-blue-pill__btn']	")
	WebElement search;	
	
		
	@FindBy(how=How.XPATH,using="//div[text()='14 W 23RD ST 2ND FL']")
	WebElement Firstresult;
	@FindBy(how=How.XPATH,using="//div[text()='0.49 mi.']")
	WebElement miles;
	
	@FindBy(how=How.XPATH,using="//div[text()='Sunday']")
	WebElement Sunday;
	@FindBy(how=How.XPATH,using="//div[text()='10:00 AM – 1:00 PM']")
	WebElement SundayTime;		
	
	@FindBy(how=How.XPATH,using="//div[text()='Monday']")
	WebElement Monday;
	@FindBy(how=How.XPATH,using="//div[text()='7:45 AM – 9:15 AM']")
	WebElement MondayTime1;	
	@FindBy(how=How.XPATH,using="//div[text()='12:00 PM – 2:00 PM']")
	WebElement MondayTime2;
	@FindBy(how=How.XPATH,using="//div[text()='5:30 PM – 7:00 PM']")
	WebElement MondayTime3;
			
	@FindBy(how=How.XPATH,using="//div[text()='Tuesday']")
	WebElement Tuesday;
	@FindBy(how=How.XPATH,using="//div[text()='8:00 AM – 2:00 PM']")
	WebElement TuesdayTime1;	
	@FindBy(how=How.XPATH,using="//div[text()='4:45 PM – 8:00 PM']")
	WebElement TuesdayTime2;
	
	
	@FindBy(how=How.XPATH,using="//div[text()='Wednesday']")
	WebElement Wednesday;
	@FindBy(how=How.XPATH,using="//div[text()='9:30 AM – 2:00 PM']")
	WebElement WednesdayTime1;	
	@FindBy(how=How.XPATH,using="//div[text()='5:00 PM – 8:00 PM']")
	WebElement WednesdayTime2;
		
	@FindBy(how=How.XPATH,using="//div[text()='Thursday']")
	WebElement Thursday;
	@FindBy(how=How.XPATH,using="//div[text()='7:45 AM – 10:30 AM']")
	WebElement ThursdayTime1;	
	@FindBy(how=How.XPATH,using="//div[text()='11:45 AM – 2:00 PM']")
	WebElement ThursdayTime2;
	@FindBy(how=How.XPATH,using="//div[text()='4:45 PM – 8:00 PM']")
	WebElement ThursdayTime3;
	
	@FindBy(how=How.XPATH,using="//div[text()='Friday']")
	WebElement Friday;
	@FindBy(how=How.XPATH,using="//div[text()='7:45 AM – 9:30 AM']")
	WebElement FridayTime1;	
	@FindBy(how=How.XPATH,using="//div[text()='11:45 AM – 2:00 PM']")
	WebElement FridayTime2;
	@FindBy(how=How.XPATH,using="//div[text()='2:30 PM – 4:30 PM']")
	WebElement FridayTime3;
	
	@FindBy(how=How.XPATH,using="//div[text()='Saturday']")
	WebElement Saturday;
	@FindBy(how=How.XPATH,using="//div[text()='8:00 AM – 1:00 PM']")
	WebElement SaturdayTime;
	
	public void send_info()
	{
	 Zipcode.sendKeys("10011");
	 search.submit();
	
	}
	
	public void verify_firstresult()
	{
		String innertext=Firstresult.getText();
		 System.out.println(innertext);
		 String innermiles=miles.getText();
		 System.out.println(innermiles);
		 Firstresult.click();
		 /*String actualTitle = driver.getTitle();
		 String expectedTitle =innertext;
		 assertEquals(expectedTitle,actualTitle);
		 System.out.println(actualTitle);
		 System.out.println(expectedTitle);*/
		 assertTrue(driver.getTitle().contains(innertext));
		 System.out.println("displayed location name matches with the name of the first searched result that was clicked");

	}
	
	public void Hours_of_operation()
	{
		DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
		//System.out.println(dayOfWeek);
		String day=dayOfWeek.toString();
		System.out.println(day);
		String Sun=Sunday.getText();
		String Mon=Monday.getText();
		String Tues=Tuesday.getText();
		String Wed=Wednesday.getText();
		String Thurs=Thursday.getText();
		String Fri=Friday.getText();
		String Sat=Saturday.getText();
		if(day.equalsIgnoreCase(Sun))
		{
			System.out.println(SundayTime.getText());
		}
		else if(day.equalsIgnoreCase(Mon))
		{
			System.out.println(MondayTime1.getText());
			System.out.println(MondayTime2.getText());
			System.out.println(MondayTime3.getText());
			
		}
		else if(day.equalsIgnoreCase(Tues))
		{
			System.out.println(TuesdayTime1.getText());
			System.out.println(TuesdayTime2.getText());
		}
		else if(day.equalsIgnoreCase(Wed))
		{
			System.out.println(WednesdayTime1.getText());
			System.out.println(WednesdayTime2.getText());
		}
		else if(day.equalsIgnoreCase(Thurs))
		{
			System.out.println(ThursdayTime1.getText());
			System.out.println(ThursdayTime2.getText());
			System.out.println(ThursdayTime3.getText());
			
		}
		else if(day.equalsIgnoreCase(Fri))
		{
			System.out.println(FridayTime1.getText());
			System.out.println(FridayTime2.getText());
			System.out.println(FridayTime3.getText());
			
		}
		else if(day.equalsIgnoreCase(Sat))
		{
			System.out.println(SaturdayTime.getText());
		}
		
	}

	
	
}
