package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author Lenovo
 *@see In this class maintains selectHotel locators,success and error message steps
 */

public class EmployeePage extends BaseClass {
	
	public EmployeePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Employee']")
	private WebElement btnEmployee;
	
	@FindBy(xpath = "//a[normalize-space()='Create']")
	private WebElement create;

	@FindBy(id = "FirstName")
	private WebElement txtFirstname;
	@FindBy(id = "LastName")
	private WebElement txtLastname;
	@FindBy(id = "EmailId")
	private WebElement txtEmail;
	@FindBy(id = "MobileNo")
	private WebElement txtMobile;
	@FindBy(id = "DOB")
	private WebElement txtDob;
	@FindBy(id = "rdbMale")
	private WebElement btnGender;
	@FindBy(id = "Address")
	private WebElement txtAddress;
	@FindBy(xpath = "(//span[normalize-space()='Please enter first name.'])[2]")
	private WebElement txtErrFirst;
	@FindBy(xpath = "(//span[normalize-space()='Please enter last name.'])[2]")
	private WebElement txtErrLast;
	@FindBy(xpath = "(//span[normalize-space()='Please enter email.'])[2]")
	private WebElement txtErrEmail;
	@FindBy(xpath = "(//span[normalize-space()='Please enter mobile number.'])[2]")
	private WebElement txtErrMobile;
	
	
	public WebElement getBtnEmployee() {
		return btnEmployee;
	}
	public WebElement getCreate() {
		return create;
	}
	public WebElement getTxtFirstname() {
		return txtFirstname;
	}
	public WebElement getTxtErrFirst() {
		return txtErrFirst;
	}
	public WebElement getTxtErrLast() {
		return txtErrLast;
	}
	public WebElement getTxtErrEmail() {
		return txtErrEmail;
	}
	public WebElement getTxtErrMobile() {
		return txtErrMobile;
	}
	public WebElement getTxtLastname() {
		return txtLastname;
	}
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtMobile() {
		return txtMobile;
	}
	public WebElement getTxtDob() {
		return txtDob;
	}
	public WebElement getBtnGender() {
		return btnGender;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getDdnCountryId() {
		return ddnCountryId;
	}
	public WebElement getDdnCityId() {
		return ddnCityId;
	}
	public WebElement getChkskills() {
		return chkskills;
	}
	public WebElement getBtnSave() {
		return btnSave;
	}
	public WebElement getTxtEmpSuccessMsg() {
		return txtEmpSuccessMsg;
	}
	@FindBy(id = "CountryId")
	private WebElement ddnCountryId;
	@FindBy(id = "CityId")
	private WebElement ddnCityId;
	@FindBy(id = "chkSkill_5")
	private WebElement chkskills;
	@FindBy(xpath = "//*[@id=\"frmEmployee\"]/div[2]/button")
	private WebElement btnSave;
	@FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[1]")
	private WebElement txtEmpSuccessMsg;
	
	public void createEmployee() {
		
		elementClick(getBtnEmployee());
		elementClick(getCreate());
	}
	
	public void createDetails(String firstname, String lastname, String email, String mobilenumber,
			String dob,String gender,String address,String country,String city,String skills) {
		
		elementSendkeys(getTxtFirstname(), firstname);
		elementSendkeys(getTxtLastname(), lastname);
		elementSendkeys(getTxtEmail(), email);
		elementSendkeys(getTxtMobile(), mobilenumber);
		elementSendkeys(getTxtDob(), dob);
		elementClick(getBtnGender());
		elementSendkeys(getTxtAddress(), address);
		selectByText(getDdnCountryId(), country);
		selectByText(getDdnCityId(), city);
		elementClick(getChkskills());
		elementClick(getBtnSave());
		
	}	
	
		public void mandDetails(String firstname, String lastname, String email, String mobilenumber) {
			elementSendkeys(getTxtFirstname(), firstname);
			elementSendkeys(getTxtLastname(), lastname);
			elementSendkeys(getTxtEmail(), email);
			elementSendkeys(getTxtMobile(), mobilenumber);
			elementClick(getBtnSave());
		}

		public void withoutDetails() {
			elementClick(getBtnSave());
		}
	

}
