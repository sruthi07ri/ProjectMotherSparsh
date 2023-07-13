package mothersPagePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	WebDriver driver;
	
	By firstName = By.id("RegisterForm-FirstName");
	By lastName = By.id("RegisterForm-LastName");
	By dob = By.id("RegisterForm-dob");
	By email = By.id("RegisterForm-email");
	By password = By.id("RegisterForm-password");
	By terms = By.id("tc-check");
	By createbtn = By.xpath("//*[@class='sub-btn']");
	
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void setName(String fname, String lname)
	{
		
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		
	}
	public void setDOB(String date)
	{
		driver.findElement(dob).sendKeys(date);
	}
	
	public void setEmailPwd(String mailid, String pwd)
	{
		driver.findElement(email).sendKeys(mailid);
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickRegister()
	{
		WebElement termschkbox = driver.findElement(terms);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		if(!termschkbox.isSelected()) {
			
			js.executeScript("arguments[0].click();", termschkbox);
		
		}
		WebElement createbutton = driver.findElement(createbtn);
		js.executeScript("arguments[0].click();",createbutton);
	}
	
	
	

}
