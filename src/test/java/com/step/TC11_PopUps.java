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

public class TC11_PopUps extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should click more tab and go to popup tab and perform")
	public void user_should_click_more_tab_and_go_to_popup_tab_and_perform() {
		pom.getpopup().morePopUp();
	}



	@Then("User should verify popup one success message,{string}")
	public void user_should_verify_popup_one_success_message(String expected) {
		String act = pom.getpopup().popupOne();
		Assert.assertEquals("verify popup one success message", expected, act);
	}

	@Then("User should verify Alert Popup success message,{string}")
	public void user_should_verify_alert_popup_success_message(String expAlert) {
		String actAlert = pom.getpopup().AlertBox();
		Assert.assertEquals("verify Alert popup success message", expAlert, actAlert);
	}

	@Then("User should verify Confirm Popup success message,{string}")
	public void user_should_verify_confirm_popup_success_message(String expConfirm) {
		String actConfirm = pom.getpopup().confirmBox();
		Assert.assertEquals("verify Confirm popup success message", expConfirm, actConfirm);
	}


	@Then("User should verify Prompt Popup success message,{string}")
	public void user_should_verify_prompt_popup_success_message(String expPrompt) {
		String actPrompt = pom.getpopup().prompt();
		Assert.assertEquals("verify Prompt popup success message", expPrompt, actPrompt);
	}





	
	




	
	

	
	}



