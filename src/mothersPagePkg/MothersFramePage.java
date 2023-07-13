package mothersPagePkg;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class MothersFramePage {
	
	WebDriver driver;
	
//	By frameelement = By.id("survey-close-div");
//	By framecntnt = By.xpath("//*[@id='webklipper-publisher-widget-container-survey-frame']");
	By frameclosebtn = By.xpath("//*[@id=\"survey-close-div\"]/i");  //close icon of frame
	

	
	public MothersFramePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void closeFrame()
	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(frameelement));
//		WebElement frame1 = driver.findElement(framecntnt);
		driver.switchTo().frame("webklipper-publisher-widget-container-survey-frame");   // switch to i frame have id ' webklipper-publisher-widget-container-survey-frame'
		driver.findElement(frameclosebtn).click();   // close frame
		driver.switchTo().defaultContent(); // go back to main page
		
	}
	
}
