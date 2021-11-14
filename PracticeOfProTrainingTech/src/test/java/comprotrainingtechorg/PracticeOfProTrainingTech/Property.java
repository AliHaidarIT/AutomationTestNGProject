package comprotrainingtechorg.PracticeOfProTrainingTech;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import Common.Utilities;

public class Property extends Utilities{
  @Test
  public void f() throws InterruptedException, IOException {
	  Properties pro=new Properties();
	  FileInputStream obj=new FileInputStream("C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\src\\test\\java\\comprotrainingtechorg\\PracticeOfProTrainingTech\\Property.java");
	  pro.load(obj);
	  String id= pro.getProperty("Ids");
	  String ds= pro.getProperty("Pwwd");
  
  
	  HomeOfFacebook FB=new HomeOfFacebook(driver);
	  FB.EmailFieldSendKeys(id);
	  FB.PasswFieldSendKeys(ds);
	  FB.LogbuttonFieldSendKeys();
	  Thread.sleep(5000);
	  driver

  }
}
