package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement Simplealert=driver.findElement(By.name("alert"));
		Simplealert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	  //driver.switchTo().alert().dismiss();  //(Accept and Dismiss are basically the same things)
		WebElement Confirmationalert=driver.findElement(By.name("confirmation"));
		Confirmationalert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		Confirmationalert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		WebElement Promptalert=driver.findElement(By.name("prompt"));
		Promptalert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("protrainingtech");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}

}
