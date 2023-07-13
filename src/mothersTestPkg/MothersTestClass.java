package mothersTestPkg;

//import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mothersPagePkg.HomePage;
import mothersPagePkg.MothersFramePage;
import mothersPagePkg.RegisterPage;

public class MothersTestClass extends MothersBaseClass {
	
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setUp()
//	{
//		driver = new ChromeDriver();
//		driver.get("https://mothersparsh.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//	}
	
	@Test (priority =0)
	public void handleFrame()
	{
		
		MothersFramePage mfp = new MothersFramePage(driver);
		mfp.closeFrame();
		
	}
	
	@Test (priority =1)
	public void createAccount()
	{
		HomePage hp = new HomePage(driver);
		hp.clickloginIcon();
		hp.clickCreateAccountlink();
	}
	
	@Test (priority = 2)
	public void register()
	{
		RegisterPage rp = new RegisterPage(driver);
		rp.setName("Test", "Name");
		rp.setDOB("07/05/1990");
		rp.setEmailPwd("testmail@test.com", "Password12345");
		rp.clickRegister();
	}

}



