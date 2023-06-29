package com.step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;


public class TC2_EmployeeStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager(); 
	
	
	
	@Then("User should click Employee icon")
	public void user_should_click_employee_icon() {
		pom.getemployee().createEmployee();
		
	}
	@Then("User should create employee details {string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_create_employee_details_and(String firstname, String lastname, String email, String mobilenumber, String dob, String gender, String address, String country, String city, String skills) {
		//pom.getemployee().createDetails(firstname, lastname, email, mobilenumber, dob, gender, address, country, city, skills);
		pom.getemployee().createDetails(firstname, lastname, email, mobilenumber, dob, gender, address, country, city, skills);
	}
	@Then("User should verify employee details success message,{string}")
	public void user_should_verify_employee_details_success_message(String expEmpSuccessMsg) {
		WebElement txtEmpSuccessMsg = pom.getemployee().getTxtEmpSuccessMsg();
		String actEmpSuccessMsg = txtEmpSuccessMsg.getText();
		Assert.assertEquals("verify employee details success message", expEmpSuccessMsg, actEmpSuccessMsg);
	}

	

	@Then("User should create employee details {string},{string},{string} and {string}")
	public void user_should_create_employee_details_and(String firstname, String lastname, String email, String mobilenumber) {
		pom.getemployee().mandDetails(firstname, lastname, email, mobilenumber);
		
	}
	
	@Then("User should create employee details and click save")
	public void user_should_create_employee_details_and_click_save() {
		pom.getemployee().withoutDetails();
	}
	@Then("User should verify employee details error message,{string},{string},{string},{string}")
	public void user_should_verify_employee_details_error_message(String expErrFirst, String expErrLast, String expErrEmail, String expErrMobile) {
		WebElement ele = pom.getemployee().getTxtErrFirst();
		String actErrFirst = ele.getText();

		WebElement ele2 = pom.getemployee().getTxtErrLast();
		String actErrLast = ele2.getText();
		WebElement ele3 = pom.getemployee().getTxtErrEmail();
		String actErrEmail = ele3.getText();

		WebElement ele4 = pom.getemployee().getTxtErrMobile();
		String actErrMobile = ele4.getText();
		Assert.assertEquals("verify  employee details Error Message", expErrFirst,
				actErrFirst);
		Assert.assertEquals("verify  employee details Error Message", expErrLast,
				actErrLast);
		Assert.assertEquals("verify  employee details Error Message", expErrEmail,
				actErrEmail);
		Assert.assertEquals("verify  employee details Error Message", expErrMobile,
				actErrMobile);
		
		
	}








	
	




}
