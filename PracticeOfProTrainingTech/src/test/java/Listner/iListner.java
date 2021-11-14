package Listner;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Utilities;

public class iListner extends Utilities implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is started successfully");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities)result.getInstance()).driver;
		Date DT=new Date();
		  String DI=DT.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(DI);
		  File shotsof = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(shotsof, new File("C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Passed\\Amazon_"+DI+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities)result.getInstance()).driver;
		Date DT=new Date();
		  String DI=DT.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(DI);
		  File shotsof = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(shotsof, new File("C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Failed\\Amazon_"+DI+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities)result.getInstance()).driver;
		Date DT=new Date();
		  String DI=DT.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(DI);
		  File shotsof = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(shotsof, new File("C:\\Users\\aliha\\eclipse-workspace\\PracticeOfProTrainingTech\\Skipped\\Amazon_"+DI+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
