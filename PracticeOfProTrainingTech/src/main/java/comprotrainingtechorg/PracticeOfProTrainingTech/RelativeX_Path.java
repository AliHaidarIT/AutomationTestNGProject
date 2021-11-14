package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeX_Path {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://wwww.facebook.com");
		driver.manage().window().maximize();
		
		// Relative XPath
		
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email or Phone Number']"));
		WebElement password=driver.findElement(By.xpath("//input@class='_6luy _55r1 _1kbt']"));
		WebElement signin=driver.findElement(By.xpath("//button[@name='login']"));
		
		email.sendKeys("Asim@protrainingtech.com");
		Thread.sleep(5000);
		password.sendKeys("virginia");
		Thread.sleep(5000);
		signin.click();
		WebElement Forgotlink=driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		Forgotlink.click();
		
		
	}

}
