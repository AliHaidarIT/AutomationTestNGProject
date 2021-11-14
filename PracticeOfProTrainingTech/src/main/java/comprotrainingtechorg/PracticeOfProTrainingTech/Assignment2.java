package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement Username=driver.findElement(By.name("txtUsername"));
		Username.sendKeys("Admin");
		WebElement Password=driver.findElement(By.name("txtPassword"));
		Password.sendKeys("admin123");
		WebElement Signin=driver.findElement(By.name("Submit"));
		Thread.sleep(3000);
		Signin.click();
		WebElement Admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
		Admin.click();
		WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
		PIM.click();
		WebElement Leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Leave.click();
		WebElement Time=driver.findElement(By.id("menu_time_viewTimeModule"));
		Time.click();
		WebElement Recruitment=driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
		Recruitment.click();
		WebElement Myinfo=driver.findElement(By.id("menu_pim_viewMyDetails"));
		Myinfo.click();
		WebElement Performance=driver.findElement(By.id("menu__Performance"));
		Performance.click();
		WebElement Dashboard=driver.findElement(By.id("menu_dashboard_index"));
		Dashboard.click();
		WebElement Directory=driver.findElement(By.id("menu_directory_viewDirectory"));
		Directory.click();
		WebElement Maintenance=driver.findElement(By.id("menu_maintenance_purgeEmployee"));
		Maintenance.click();
		WebElement Buzz=driver.findElement(By.id("menu_buzz_viewBuzz"));
		Buzz.click();
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
