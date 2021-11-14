package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
	
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		
		// Absolute XPath
		
		WebElement SearchOfPoint=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		SearchOfPoint.click();
		
		// -- /html/body/div/header/div/div/div/div/form/div/div/span/inpu

		driver.findElement(By.className("nav-progressive-content"));
		
	}

}
