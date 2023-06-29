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


public class TC1_LoginStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("User is on the Jala Academy page")
	public void user_is_on_the_jala_academy_page() {
		
	}
	@When("User should perform login {string},{string}")
	public void user_should_perform_login(String username, String password) {
		pom.getLogin().login(username, password);
	}
	
	@Then("User should verify  after login with invalid credential error message {string}")
	public void user_should_verify_after_login_with_invalid_credential_error_message(String expErrorMsg) {
		WebElement ele= pom.getLogin().getErrorMsg();
		String actErrorMsg = ele.getText();
		Assert.assertEquals("verify after login with invalid credentials error message", expErrorMsg, actErrorMsg);
		
	}
	
	@When("User should perform login {string},{string} with enter key")
	public void user_should_perform_login_with_enter_key(String username, String password) throws AWTException {
		pom.getLogin().loginWithEnterKey(username, password);
		
	}










}
