package com.step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
/**
 * @see used to maintain commonstep for adactin hotel
 * @author Lenovo
 *
 */

public class CommonStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expSuccessMsg) {
		WebElement element = pom.getLogin().getSuccessMsg();
		String actSuccessMsg = element.getText();
		Assert.assertEquals("verify after login success message", expSuccessMsg, actSuccessMsg);
		
	}
	
}