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
 * 
 *
 */

public class TC9_Slider extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	
	

	@Then("User should click more tab and go to slider tab")
	public void user_should_click_more_tab_and_go_to_slider_tab() {
		pom.getslider().moreSlider();
	}
	@Then("User should move slider icon")
	public void user_should_move_slider_icon() {
		pom.getslider().slide();
	}
	@Then("User should verify slider toast success message,{string}")
	public void user_should_verify_slider_toast_success_message(String expectedMsg) {
		WebElement txtMsg = pom.getslider().getTxtMsg();
		String actualMsg = txtMsg.getText();
		Assert.assertEquals("verify slider toast success message", expectedMsg, actualMsg);
	}




	


}
