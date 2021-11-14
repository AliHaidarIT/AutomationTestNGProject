package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdX_Path {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://wwww.facebook.com");
		driver.manage().window().maximize();
		WebElement create=driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
		create.click();
		Thread.sleep(2000);
		WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Ryan");
		WebElement Lastname=driver.findElement(By.name("lastname"));
		Lastname.sendKeys("Sha");
		WebElement PhoneorEmail=driver.findElement(By.name("reg_email__"));
		PhoneorEmail.sendKeys("RyanSha@gmail.com");
		WebElement Regmailorphone=driver.findElement(By.name("reg_email_confirmation__"));
		Regmailorphone.sendKeys("RyanSha@gmail.com");
		WebElement Password=driver.findElement(By.name("reg_passwd__"));
		Password.sendKeys("Ryan123");
		WebElement Month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(Month);
		ob.selectByIndex(4);
		Thread.sleep(2000);
		WebElement Day=driver.findElement(By.name("birthday_day"));
		Select ob3=new Select(Day);
		ob3.selectByValue("10");
		Thread.sleep(2000);
		WebElement Years=driver.findElement(By.name("birthday_year"));
		Select ob6=new Select(Years);
		ob6.selectByVisibleText("2000");
		Thread.sleep(2000);
		WebElement Gender=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		Gender.click();
		
	
		
	}

}
