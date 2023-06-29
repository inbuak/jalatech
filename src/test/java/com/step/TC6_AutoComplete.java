package com.step;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;


public class TC6_AutoComplete extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	

	@Then("User should click more tab and go to autocomplete tab")
	public void user_should_click_more_tab_and_go_to_autocomplete_tab() {
		pom.getauto().moreAuto();
		
	}
	
	@Then("User should click single values {string}")
	public void user_should_click_single_values(String tags) throws InterruptedException {
		pom.getauto().singleValues(tags);
	}



	@Then("User should verify single values success message,{string}")
	public void user_should_verify_single_values_success_message(String exp) {
		List<WebElement> tagss = pom.getauto().tag();
		
		for (WebElement b : tagss) {
			String act = b.getText();
			if (act.equalsIgnoreCase("php")) {
				b.click();
				Assert.assertEquals("verify single values success message", exp, act);
				break;
			}
			
		
		
		}
		
		
	}
	
	@Then("User should click multiple values {string}")
	public void user_should_click_multiple_values(String tags) {
		pom.getauto().multipleValues(tags);
	}
	@Then("User should verify multiple values success message,{string}")
	public void user_should_verify_multiple_values_success_message(String expMulti) {
List<WebElement> tagMulti = pom.getauto().tags();
		
		for (WebElement b : tagMulti) {
			String actMulti = b.getText();
			if (actMulti.equalsIgnoreCase("javascript")) {
				b.click();
				Assert.assertEquals("verify multiple values success message", expMulti, actMulti);
				break;
			}
			
		
		
		}
		
		
	}
	
	}










