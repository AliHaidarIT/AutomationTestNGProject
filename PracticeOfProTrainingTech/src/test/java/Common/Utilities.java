package Common;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utilities {
	public WebDriver driver;
  @Test
  
  @Parameters({"browser","URL"})
  @BeforeClass
  public void beforeClass(String NameofBrowser, String website) {
		  if(NameofBrowser.equalsIgnoreCase("Chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.navigate().to(website);
			  driver.manage().window().maximize();
			  
		  }else if(NameofBrowser.equalsIgnoreCase("Firefox")) {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.navigate().to(website);
			  driver.manage().window().maximize();
			  
		  }else if(NameofBrowser.equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\msedgedriver.exe");
			  driver=new EdgeDriver();
			  driver.navigate().to(website);
			  driver.manage().window().maximize();
		  }
	  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  public void ShotOfPages() throws IOException {
	  Date DT=new Date();
	  String DI=DT.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(DI);
	  File shotsof = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(shotsof, new File("C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Pictures\\Amazon_"+DI+".png"));
  }
}
