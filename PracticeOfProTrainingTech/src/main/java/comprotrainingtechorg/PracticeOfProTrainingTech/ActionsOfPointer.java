package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOfPointer {

static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Signtodrop=driver.findElement(By.xpath("//*[text()='Hello, Sign in']"));
		Actions ob=new Actions(driver);
		ob.moveToElement(Signtodrop).build().perform();
		Thread.sleep(3000);
		WebElement Browser=driver.findElement(By.linkText("Kindle Unlimited"));
		ob.moveToElement(Browser).click().build().perform();
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
