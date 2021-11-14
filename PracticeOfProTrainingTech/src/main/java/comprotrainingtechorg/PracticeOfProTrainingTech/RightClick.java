package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Picture=driver.findElement(By.xpath("//img[@src=\"data-samples/images/popup_pic.gif\"]"));
		Actions ob=new Actions(driver);
		ob.contextClick(Picture).build().perform();
		Thread.sleep(3000);
		WebElement Home=driver.findElement(By.id("dm2m1i0tdT"));
		Home.click();
		/*Thread.sleep(3000);
		WebElement Samples=driver.findElement(By.id("dm2m1i2tdT"));
		Samples.click();
		WebElement Samples5=driver.findElement(By.id("dm2m8i4tdT"));
		Samples5.click();*/
		
		Thread.sleep(5000);
		driver.close();
		}
	
	
	

}
