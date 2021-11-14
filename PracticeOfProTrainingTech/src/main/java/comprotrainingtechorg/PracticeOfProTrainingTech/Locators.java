package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://wwww.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement PhoneNumberField=driver.findElement(By.name("email"));
		PhoneNumberField.sendKeys("Asim@protrainingtech.com");
		Thread.sleep(2000);
		WebElement passwordElement=driver.findElement(By.name("pass"));
		passwordElement.sendKeys("Asim555");
		Thread.sleep(2000);
		WebElement linktext=driver.findElement(By.linkText("Forgot Password?"));
		//WebElement linktext=driver.findElement(By.partialLinkText("Forgot"));  //(Different way to use the same method but only by using partial name of the link)
		linktext.click();
		WebElement Signin=driver.findElement(By.id("loginbutton"));
		Signin.click();
		//PhoneNumberField.clear();
		
		Thread.sleep(2000);
		driver.close();
	}

}
