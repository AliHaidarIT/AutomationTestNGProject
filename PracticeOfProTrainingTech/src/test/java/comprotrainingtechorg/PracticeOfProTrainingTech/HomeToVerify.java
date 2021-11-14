package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HomeToVerify {
	public WebDriver driver;
  @Test
  public void f() {
	  HomeOfFacebook ob=new HomeOfFacebook(driver);
	  String ToFHome=ob.Get();
	  System.out.println(ToFHome);
	  Assert.assertEquals("Connect with friends and the world around you on Facebook.", ToFHome);
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals("Connect with friends and the world around you on Facebook.", ToFHome);
	  System.out.println("This is after Asserion");
	  soft.assertAll();
	  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
