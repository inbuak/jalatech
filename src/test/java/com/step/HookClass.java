package com.step;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author Lenovo
 *@see in this class maintain the scenario execution
 */


  
public class HookClass extends BaseClass {
	/**
	 * @see used to launch browser
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertFileValue("browser"));
		AppUrl(getPropertFileValue("url"));
		Maximize();
		implicityWait();
	}
	/**
	 * @see used to take screenshot for failed scenarios
	 * @param scenario
	 */
	@After
	public void afterScenario(Scenario scenario) {
		boolean failed = scenario.isFailed();
		if (failed) {
			
		scenario.attach(OutputByte(), "image/png", "Every scenario");
	
	}
		quitwindow();
		}
}
