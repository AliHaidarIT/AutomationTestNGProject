package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Assigment1 {
static WebDriver drivers;
private static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://wwww.facebook.com");
		WebElement PhoneNumberField=driver.findElement(By.name("email"));
		PhoneNumberField.sendKeys("kareem@gmail.com");
		WebElement passwordElement=driver.findElement(By.name("pass"));
		passwordElement.sendKeys("ImKareem123");
		Thread.sleep(2000);
		WebElement linktext=driver.findElement(By.linkText("Forgot Password?"));
		linktext.click();
		WebElement MoblieNumber=driver.findElement(By.id("identify_email"));
		MoblieNumber.sendKeys("9932okds9e");
		WebElement Search=driver.findElement(By.name("did_submit"));
		Search.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement RemoveEmail=driver.findElement(By.name("email"));
		RemoveEmail.clear();
		WebElement EmailField=driver.findElement(By.name("email"));
		EmailField.sendKeys("Ismaan@protrainingtech.com");
		WebElement passwordfield=driver.findElement(By.name("pass"));
		passwordfield.sendKeys("Ismaan255");
		Thread.sleep(2000);
		WebElement Loginbutton=driver.findElement(By.name("login"));
		Loginbutton.click();
		
		// 				End of Assignment#1		
		driver.close();
	}

}
