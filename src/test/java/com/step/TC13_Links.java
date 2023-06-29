package com.step;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

/**
 * @see used to maintain steps for login page
 * @author Lenovo
 *
 */

public class TC13_Links extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	

	@Then("User should click more tab and go to working links")
	public void user_should_click_more_tab_and_go_to_working_links() {
		pom.getlinks().moreWorking();
	}
	@Then("User should verify Working Links success message,{string}")
	public void user_should_verify_working_links_success_message(String exp) {
		String act = pom.getlinks().workLink();
		Assert.assertEquals("verify Working Links success message", exp, act);
	}

	
	@Then("User should click more tab and go to Imagelinks")
	public void user_should_click_more_tab_and_go_to_imagelinks() {
		pom.getlinks().moreImages();
	}
	@Then("User should verify Image Links  success message,{string}")
	public void user_should_verify_image_links_success_message(String expImg) {
		String actImg = pom.getlinks().imageLink();
		Assert.assertEquals("verify Image Links success message", expImg, actImg);
	}

	
	@Then("User should click more tab and go to status codes")
	public void user_should_click_more_tab_and_go_to_status_codes() {
		pom.getlinks().moreStatus();
	}
	@Then("User should verify Status Codes success message,{string}")
	public void user_should_verify_status_codes_success_message(String expStatus) {
		String actStatus = pom.getlinks().statusCodes();
		Assert.assertEquals("verify Status Codes success message", expStatus, actStatus);
	
	}





	
	
}
