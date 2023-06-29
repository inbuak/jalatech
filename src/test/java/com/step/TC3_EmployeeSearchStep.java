package com.step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;


public class TC3_EmployeeSearchStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager(); 
	
	
	
	@Then("User should click search employee details {string},{string}")
	public void user_should_click_search_employee_details(String employeename, String mobileno) {
	pom.getsearch().searchEmployee(employeename, mobileno);
		
	}
	@Then("User should verify employee details firstname success message,{string}")
	public void user_should_verify_employee_details_firstname_success_message(String expSuccessFirstName) {
		WebElement txtSuccessFirstName = pom.getsearch().getTxtSuccessFirstName();
		String actSuccessFirstName = txtSuccessFirstName.getText();
		Assert.assertEquals("verify employee search firstname", expSuccessFirstName, actSuccessFirstName);
		
	}
	@Then("User should click search employee details {string}")
	public void user_should_click_search_employee_details(String employeename) {
		pom.getsearch().searchDetails(employeename);
	}


	

	@Then("User should click search invalid employee {string}")
	public void user_should_click_search_invalid_employee(String employeename) {
		pom.getsearch().errEmpDetails(employeename);
		
		}

	@Then("User should verify employee error record details message,{string}")
	public void user_should_verify_employee_error_record_details_message(String expEmpErrorRecord) {
		WebElement txtErrorRecord = pom.getsearch().getTxtErrorRecord();
		String actEmpErrorRecord = txtErrorRecord.getText();
		Assert.assertEquals("verify employee error record details", expEmpErrorRecord, actEmpErrorRecord);
	}
	

	@Then("User should click search employee details and delete {string}")
	public void user_should_click_search_employee_details_and_delete(String employeename) throws InterruptedException {
		pom.getsearch().deleteDetails(employeename);
		
		
	}
	@Then("User should verify employee details deleted success message,{string}")
	public void user_should_verify_employee_details_deleted_success_message(String expDeleteSuccessMsg) {
		WebElement txtDeleteSuccess = pom.getsearch().getTxtDeleteSuccess();
		String actDeleteSuccessMsg = txtDeleteSuccess.getText();
		Assert.assertEquals("verify employee delete record success message", expDeleteSuccessMsg, actDeleteSuccessMsg);
	}

	

	@Then("User should click search employee details and updating {string},{string}")
	public void user_should_click_search_employee_details_and_updating(String employeename, String address) throws InterruptedException {
		pom.getsearch().updateDetails(employeename, address);
		
	}
	

	@Then("User should verify employee details updated success message,{string}")
	public void user_should_verify_employee_details_updated_success_message(String expUpdated) {
		WebElement txtUpdateSuccess = pom.getsearch().getTxtUpdateSuccess();
		String actUpdated = txtUpdateSuccess.getText();
		Assert.assertEquals("verify employee updated record success message", expUpdated, actUpdated);
	
	}








	

}
