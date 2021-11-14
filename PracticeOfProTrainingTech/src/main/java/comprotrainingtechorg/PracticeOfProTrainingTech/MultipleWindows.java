package comprotrainingtechorg.PracticeOfProTrainingTech;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement Books=driver.findElement(By.linkText("Customer Service"));
		Actions object=new Actions(driver);
		object.keyDown(Keys.SHIFT).build().perform();
		Books.click();
		object.keyUp(Keys.SHIFT).build().perform();
		// Following Actions are for the other window
		/*WebElement Outer=driver.findElement(By.linkText("Author Follow"));
		Outers.click();*/
		String ParentWindowHandle=driver.getWindowHandle();
		//System.out.println(ParentWindowHandle);
		Set<String> OtherWindowHandles=driver.getWindowHandles();
		Iterator<String> iterat=OtherWindowHandles.iterator();
		String FirstWindowHandle=iterat.next();
		System.out.println(FirstWindowHandle);
		String SecondWindowHandle=iterat.next();
		System.out.println(SecondWindowHandle);
		driver.switchTo().window(SecondWindowHandle);
		driver.findElement(By.xpath("//*[@class='a-box self-service-rich-card'])[2]")).click();
		
		
		
			}

}
