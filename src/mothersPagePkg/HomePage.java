package mothersPagePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	
	By createAccounticon = By.xpath("//*[@class='header__icon header__icon--account link focus-inset small-hide']");
//	By createAccountlink = By.xpath("//*[@id='customer_login']/a[2]");
	By createAccountlink = By.partialLinkText("Create account");
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void clickloginIcon()
	{
		driver.findElement(createAccounticon).click();
	}
	
	
	public void clickCreateAccountlink()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement createlink = driver.findElement(createAccountlink);
		js.executeScript("arguments[0].click();", createlink);
	}

}
