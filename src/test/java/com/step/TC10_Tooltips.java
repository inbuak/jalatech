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

public class TC10_Tooltips extends BaseClass {
	PageObjectManager pom = new PageObjectManager();


	@Then("User should click more tab and go to tooltips tab")
	public void user_should_click_more_tab_and_go_to_tooltips_tab() {
		pom.gettool().moreTooltip();
	}
	

	@Then("User should verify After tooltip success message,{string}")
	public void user_should_verify_after_tooltip_success_message(String expAfter) throws InterruptedException {
	String actAfter = pom.gettool().afterToolTip();
	Assert.assertEquals("verify After tooltip success message", expAfter, actAfter);
	}


	@Then("User should verify Before tooltip success message,{string}")
	public void user_should_verify_before_tooltip_success_message(String expBefore) throws InterruptedException {
		String actBefore = pom.gettool().beforeToolTip();
		Assert.assertEquals("verify Before tooltip success message", expBefore, actBefore);
	}





}
