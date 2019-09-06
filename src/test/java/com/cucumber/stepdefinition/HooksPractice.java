package com.cucumber.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;

import com.cucumber.base.Baseclass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;

public class HooksPractice extends  Baseclass {
	
	@Before
	public void beforeHooks() {
		System.out.println("Before Hooks");
	}
	@After
	public void afterHooks(Scenario testcase) throws Throwable {
		System.out.println("After Hooks");
		testcase.getStatus();
		if(testcase.isFailed()) {
			File ScreenShot = screenShotontheWebpage(testcase.getName());
			Reporter.addScreenCaptureFromPath(ScreenShot.getAbsolutePath());
		}
	}
	
	

}
