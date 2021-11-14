package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

import Common.Utilities;

public class FindOfElements extends Utilities {
	@Test
  public void f() {
	  List<WebElement> links= (List<WebElement>) driver.findElements(By.tagName("a"));
	  	 System.out.println(links.size());
	  for (WebElement lk:links) {
		  System.out.println(lk.getText());
		  
    }
	  
  }
}
