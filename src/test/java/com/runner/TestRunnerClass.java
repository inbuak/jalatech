package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Status",stepNotifications=false,dryRun=false,monochrome=true,plugin= {"pretty","json:target\\index.json"},
features="src\\test\\resources", glue="com.step")
public class TestRunnerClass extends BaseClass {

	
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		

		
	}
}


