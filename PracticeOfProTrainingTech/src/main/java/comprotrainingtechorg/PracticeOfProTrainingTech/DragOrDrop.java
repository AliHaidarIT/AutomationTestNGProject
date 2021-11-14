package comprotrainingtechorg.PracticeOfProTrainingTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragOrDrop {

static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait ok=new WebDriverWait(driver, 10);
		driver.switchTo().frame(0);
		ok.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		ok.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
		WebElement Drag=driver.findElement(By.id("draggable"));
		WebElement Dropit=driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions ob=new Actions(driver);
		ob.dragAndDrop(Drag, Dropit).build().perform();
		driver.switchTo().parentFrame();
		
		Thread.sleep(5000);
		driver.close();
	}
	

}
