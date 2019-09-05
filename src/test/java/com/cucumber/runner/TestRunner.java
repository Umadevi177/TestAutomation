package com.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.Baseclass;
import com.cucumber.helper.FileDataManager;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\cucumber\\extendReports.html",
				"pretty",
				"json:src\\test\\resource\\com\\cucumber\\reports\\report.json",
				"junit:src\\test\\resource\\com\\cucumber\\reports\\report.xml",
				"html:src\\test\\resource\\com\\cucumber\\reports"},
		features= "src\\test\\java\\com\\cucumber\\feature",glue="com.cucumber.stepdefinition",
		tags= {"@APIendtoend"},dryRun=false,strict =true,monochrome=true)

public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void SetupIntialisation() throws Throwable {
		String browsername = FileDataManager.fdm.getconfigReader().getBrowserName();
		driver=Baseclass.getBrowser(browsername);	
	}
	
	@AfterClass
	public static void Teardown() throws Exception {
		Baseclass.driverQuit();
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")
		+"\\src\\test\\resource\\com\\cucumber\\properties\\extend-config.xml"));
		
		
	}
		
	}
	

	
	


