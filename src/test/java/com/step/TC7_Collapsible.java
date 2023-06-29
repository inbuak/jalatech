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

public class TC7_Collapsible extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	
	@Then("User should click more tab and go to collapsible content tab")
	public void user_should_click_more_tab_and_go_to_collapsible_content_tab() {
		pom.getcollapse().moreCollapse();
	}
	@Then("User should click single collapse")
	public void user_should_click_single_collapse() throws InterruptedException {
		pom.getcollapse().collapse();
	}
	@Then("User should verify single collapse success message,{string}")
	public void user_should_verify_single_collapse_success_message(String expMsg) {
		WebElement thirdSuccessMsg = pom.getcollapse().getTxtThirdSuccessMsg();
		String text = thirdSuccessMsg.getText();
		boolean actMsg = text.contains(expMsg);
		Assert.assertEquals("verify single collapse success message", expMsg, actMsg);
	}

	
	@Then("User should click multiple collapse")
	public void user_should_click_multiple_collapse() throws InterruptedException {
		pom.getcollapse().multiCollapse();
		
	}
	@Then("User should verify multiple collapse success message,{string}")
	public void user_should_verify_multiple_collapse_success_message(String expMultiMsg) {
		WebElement txtMultiSecSuccessMsg = pom.getcollapse().getTxtMultiSecSuccessMsg();
		String tex= txtMultiSecSuccessMsg.getText();
		boolean actMultiMsg = tex.contains(expMultiMsg);
		Assert.assertEquals("verify multi collapse success message", expMultiMsg, actMultiMsg);
		
	}




	


}
