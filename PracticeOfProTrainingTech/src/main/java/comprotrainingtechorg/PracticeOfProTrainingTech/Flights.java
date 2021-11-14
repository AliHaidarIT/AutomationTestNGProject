package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flights {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.qatarairways.com/en-us/homepage.html?CID=SXUS23456792M&account=Google-AMERICAS-US-EN-Brand&campaign=US-Brand-Rest-EN_phrase&adgroup=Misspellings&term=quarter+airline&gclid=EAIaIQobChMI4ZDlq9vR8wIVwfezCh0teAKHEAAYAyAAEgL1CPD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		WebElement Button=driver.findElement(By.xpath("(//*[text()='Close'])[1]"));
		Button.click();
		Thread.sleep(3000);
		WebElement DT=driver.findElement(By.xpath("(//*[@class='qr-datepicker active d-flex'])[1]"));
		DT.click();
		Thread.sleep(3000);
		WebElement Departure=driver.findElement(By.xpath("//*[@aria-label='6 November 2021']"));
		Departure.click();
		Thread.sleep(3000);
		WebElement Returned=driver.findElement(By.xpath("//*[@aria-label='26 November 2021']"));
		Returned.click();
		Thread.sleep(3000);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
