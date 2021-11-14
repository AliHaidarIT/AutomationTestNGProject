package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class House {
	WebDriver driver;
	@FindBy(id = "twotabsearchtextbox") WebElement SearchFieldClick;
	@FindBy(id = "nav-search-submit-button") WebElement SearchButtonClick;
	@FindBy(linkText = "Registry") WebElement Registry;
	
	public House(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void SearchFieldKeys(String name) {
		SearchFieldClick.sendKeys(name);
		
	}
	
	public void SearchButtonClick() {
		SearchButtonClick.click();
		
	}
	
	public void Registery( ) {
		Registry.click();
	}

}
