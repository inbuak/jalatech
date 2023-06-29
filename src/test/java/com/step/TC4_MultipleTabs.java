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


public class TC4_MultipleTabs extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	

	@Then("User should click more tab and go to multiple tabs")
	public void user_should_click_more_tab_and_go_to_multiple_tabs()  {
		pom.getmultiple().more();
		
	}
	@Then("User should click Plan to succeed")
	public void user_should_click_plan_to_succeed() throws InterruptedException {
		pom.getmultiple().planToSucceed();
		
	}
	@Then("User should verify Plan to succeed message,{string}")
	public void user_should_verify_plan_to_succeed_message(String expSuccessPlanMsg) {
		WebElement txtPlanSuccessMsg = pom.getmultiple().getTxtPlanSuccessMsg();
		String tex = txtPlanSuccessMsg.getText();
		boolean actSuccessPlanMsg = tex.contains(expSuccessPlanMsg);
		Assert.assertEquals("verify plan to success message", expSuccessPlanMsg, actSuccessPlanMsg);
	}
	
	
	@Then("User should click Unlearning tab")
	public void user_should_click_unlearning_tab() throws InterruptedException {
		pom.getmultiple().unLearning();
		
	}
	@Then("User should verify Unlearning success message,{string}")
	public void user_should_verify_unlearning_success_message(String expSuccessUnlearnMsg) {
		WebElement SuccessMsg = pom.getmultiple().getTxtUnlearningSuccessMsg();
		String text = SuccessMsg.getText();
		boolean actSuccessUnlearnMsg = text.contains(expSuccessUnlearnMsg);
		Assert.assertEquals("verify unlearning success message", expSuccessUnlearnMsg, actSuccessUnlearnMsg);
		
	}
	
	@Then("User should click Ways To Learning")
	public void user_should_click_ways_to_learning() throws InterruptedException {
		pom.getmultiple().waysToLeaning();
		
	}
	@Then("User should verify Ways To Learning success message,{string}")
	public void user_should_verify_ways_to_learning_success_message(String expSuccessWaysTolearnMsg) {
		WebElement TxtWaysSuccessMsg = pom.getmultiple().getTxtWaysSuccessMsg();
		String learn= TxtWaysSuccessMsg.getText();
		boolean actSuccessWaysTolearnMsg = learn.contains(expSuccessWaysTolearnMsg);
		Assert.assertEquals("verify ways to learn success message", expSuccessWaysTolearnMsg, actSuccessWaysTolearnMsg);
	}









	










}
