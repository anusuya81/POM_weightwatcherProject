package page;


	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;

	import java.time.DayOfWeek;
	import java.time.LocalDate;
	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	public class WeightWatchers_Homepage { 
	WebDriver driver;
		
		public WeightWatchers_Homepage(WebDriver ldriver){
			
			this.driver=ldriver;
		}
		
		
		public void verify_Weightwatchers()
		{
			String actualTitle = driver.getTitle();
			String expectedTitle = "Weight Loss Program, Recipes & Help | Weight Watchers";
			//assertEquals(expectedTitle,actualTitle);
			

			assertTrue(driver.getTitle().contains("Weight Loss Program, Recipes & Help | Weight Watchers"));
			System.out.println(actualTitle);
		}
		
		


		
	

}
