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

public class TC12_CssProperties extends BaseClass {
	PageObjectManager pom = new PageObjectManager();


	
	@Then("User should click more tab and go to Css Links")
	public void user_should_click_more_tab_and_go_to_css_links() {
		pom.getcss().moreCss();
	}



	@Then("User should verify Css Link2  success message,{string}")
	public void user_should_verify_css_link2_success_message(String expLink) {
		String actLink = pom.getcss().link();
		
		Assert.assertEquals("verify Css Link2  success message", expLink, actLink);
	}

	
	@Then("User should click more tab and go to Css Labels")
	public void user_should_click_more_tab_and_go_to_css_labels() {
		pom.getcss().label();
	}
	@Then("User should verify Css Label  success message,{string}")
	public void user_should_verify_css_label_success_message(String expLabel) {
		WebElement success = pom.getcss().getTxtSuccess();
		String actLabel = success.getText();
		Assert.assertEquals("verify Css Label  success message", expLabel, actLabel);
	}
	
	@Then("User should click more tab and go to Css Buttontab")
	public void user_should_click_more_tab_and_go_to_css_buttontab() {
		pom.getcss().buttons();
	}
	@Then("User should verify Css Buttontab  success message,{string}")
	public void user_should_verify_css_buttontab_success_message(String expButton) {
		WebElement primaryButton = pom.getcss().getTxtPrimaryButton();
		String actButton = primaryButton.getText();
		Assert.assertEquals("verify Css Buttontab success message", expButton, actButton);
	}

	
	@Then("User should click more tab and go to Css Alerts")
	public void user_should_click_more_tab_and_go_to_css_alerts() {
		pom.getcss().alertsCss();
	}
	@Then("User should verify Css Alerts  success message,{string}")
	public void user_should_verify_css_alerts_success_message(String expAlerts) {
		WebElement dangerAlerts = pom.getcss().getTxtDangerAlerts();
		String actAlerts = dangerAlerts.getText();
		Assert.assertEquals("verify Css Alerts success message", expAlerts, actAlerts);
	}












}
