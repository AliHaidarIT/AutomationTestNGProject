package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Connect with friends')]") WebElement ToHome;
	@FindBy(name="email") WebElement Email;
	@FindBy(name="pass") WebElement Password;
	@FindBy(name="login") WebElement Login;
	public HomeOfFacebook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public String Get() {
	String homeoftext =	ToHome.getText();
	return homeoftext;
	}
	
	public void EmailFieldSendKeys(String name) {
		Email.sendKeys(name);
		
	}
	public void PasswFieldSendKeys(String name) {
		Password.sendKeys(name);
	}

	public void LogbuttonFieldSendKeys() {
		Login.click();
	}
}
