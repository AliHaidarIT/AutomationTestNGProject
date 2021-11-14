package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.testng.annotations.Test;

import PageObjectClasses.House;
import PageObjectClasses.Registery;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AmazonFunctionSearch {
	WebDriver driver;
	
  @Test(priority = 0)
  public void f() {
	  House ob=new House(driver);
	  ob.SearchFieldKeys("Protrainingtech");
	  ob.SearchButtonClick();
	  ob.Registery();
	  System.out.println("This is first method");
  }
  
  @Test(priority = 1, dependsOnMethods = "f")
  public void Register() {
	  Registery ob6=new Registery(driver);
	  ob6.NameFieldSend("Phone");
	  ob6.SButtonClick();
	  System.out.println("This is second method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
