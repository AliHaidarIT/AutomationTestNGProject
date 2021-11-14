package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utilities;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class MultipleBrowsersClass extends Utilities{
  @Test
  public void f() {
	  HomeOfFacebook ob=new HomeOfFacebook(driver);
	  String ToFHome=ob.Get();
	  System.out.println(ToFHome);
	  Assert.assertEquals("Connect with friends and the world around you on Facebook.", ToFHome);
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals("Connect with friends and the world around you on Facebook.", ToFHome);
	  System.out.println("This is after Asserion");
	  soft.assertAll();
  }
 
 
}
