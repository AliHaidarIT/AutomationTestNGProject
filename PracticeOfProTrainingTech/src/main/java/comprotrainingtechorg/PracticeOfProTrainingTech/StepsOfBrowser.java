package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsOfBrowser {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Web Driver interface
		//Set the Chrome driver path
		//How to open the chrome browser
		//How to open the site in chrome
		//How to refresh the browser
		//How to go back
		//How to move forward
		//How to maximize
		//How to close
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		//driver.get("https://www.facebook.com");   //(Another way)
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
	}

}
