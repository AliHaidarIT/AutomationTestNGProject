package comprotrainingtechorg.PracticeOfProTrainingTech;

import org.testng.annotations.Test;

import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Providers extends Utilities{
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  HomeOfFacebook ob=new HomeOfFacebook(driver);
	  ob.EmailFieldSendKeys(n);
	  ob.PasswFieldSendKeys(s);
	  ob.LogbuttonFieldSendKeys();
	  Thread.sleep(5000);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Pro@gmail.com", "123" },
      new Object[] { "Training@gmail.com", "shsk" },
      new Object[] { "Tech@gmail.com", "abc" },
    };
  }
}
