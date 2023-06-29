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

public class TC5_Menu extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should click more tab and go to menu tab")
	public void user_should_click_more_tab_and_go_to_menu_tab() {
		pom.getmenu().moreMenu();
	}

	@Then("User should click single menu")
	public void user_should_click_single_menu() throws InterruptedException {
		pom.getmenu().singleMenu();
	}

	@Then("User should verify single menu success message,{string}")
	public void user_should_verify_single_menu_success_message(String expMenuMsg) {
		WebElement msg = pom.getmenu().getTxtTestingSuccessMsg();
		String actMenuMsg = msg.getText();
		Assert.assertEquals("verify menu success message", expMenuMsg, actMenuMsg);
	}
	

	@Then("User should click sub menus and click testing")
	public void user_should_click_sub_menus_and_click_testing() throws InterruptedException {
		pom.getmenu().subMenu();
		
	}
	@Then("User should verify sub menu testing success message,{string}")
	public void user_should_verify_sub_menu_testing_success_message(String expSubMenuMsg) {
		WebElement sel = pom.getmenu().getTxtSeleniumSuccessMsg();
		String actSubMenuMsg = sel.getText();
		Assert.assertEquals("verify sub menu testing success message", expSubMenuMsg, actSubMenuMsg);
	
	}
	



}
