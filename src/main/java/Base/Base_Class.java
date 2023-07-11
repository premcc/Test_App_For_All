package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Page_Object_Package.Login_Pom;

public class Base_Class {
	public static  WebDriver driver;
    public Login_Pom lp;
	
	@Test
	public void setup()
	{
		Login_Pom lp=new Login_Pom();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse\\Test_Actidom_Application\\Server\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 lp=new Login_Pom();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		lp.getCrossButton().click();
	}

}
