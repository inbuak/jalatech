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

public class EmployeeSearchPage extends BaseClass {
	
	public EmployeeSearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Employee']")
	private WebElement btnEmp;
	@FindBy(xpath = "//a[normalize-space()='Search']")
	private WebElement btnSch;
	public WebElement getBtnEmp() {
		return btnEmp;
	}

	public WebElement getBtnSch() {
		return btnSch;
	}
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement txtName;
	
	@FindBy(id = "MobileNo")
	private WebElement txtMobileNo;

	@FindBy(xpath = "(//td[text()='hari'])[1]")
	private WebElement txtSuccessFirstName;
	@FindBy(xpath = "(//td[text()='krishnan'])[1]")
	private WebElement txtSuccessLastName;
	@FindBy(xpath = "//td[text()='No matching records found']")
	private WebElement txtErrorRecord;
	@FindBy(id = "btnSearch")
	private WebElement BtnSearch;
	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement btnYes;
	@FindBy(xpath = "(//a[normalize-space()='Delete'])[2]")
	private WebElement btnDelete;
	@FindBy(xpath = "(//a[normalize-space()='Edit'])[1]")
	private WebElement btnEdit;
	@FindBy(tagName = "button")
	private WebElement btnButton;
	@FindBy(xpath = "//div[@class='toast-title']")
	private WebElement txtDeleteSuccess;
	
	@FindBy(xpath = "//div[@class='toast-title']")
	private WebElement txtUpdateSuccess;
	
	public WebElement getTxtUpdateSuccess() {
		return txtUpdateSuccess;
	}

	public WebElement getBtnYes() {
		return btnYes;
	}

	public WebElement getBtnDelete() {
		return btnDelete;
	}

	public WebElement getTxtDeleteSuccess() {
		return txtDeleteSuccess;
	}
	
	
	
	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}
	public WebElement getTxtSuccessFirstName() {
		return txtSuccessFirstName;
	}
	public WebElement getTxtSuccessLastName() {
		return txtSuccessLastName;
	}
	public WebElement getTxtErrorRecord() {
		return txtErrorRecord;
	}
	public WebElement getBtnSearch() {
		return BtnSearch;
		
	}
	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getBtnButton() {
		return btnButton;
	}
	@FindBy(id = "Address")
	private WebElement txtAddress;
	

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public void searchEmployee(String employeename, String mobileno) {
		elementClick(getBtnEmp());
		elementClick(getBtnSch());
		elementSendkeys(getTxtName(), employeename);
		elementSendkeys(getTxtMobileNo(), mobileno);
		elementClick(getBtnSearch() );
		
		
	}
	
	public void searchDetails(String employeename ) {
		elementClick(getBtnEmp());
		elementClick(getBtnSch());
		elementSendkeys(getTxtName(), employeename);
		elementClick(getBtnSearch());
		
	}	

		public void errEmpDetails(String employeename) {
			elementClick(getBtnEmp());
			elementClick(getBtnSch());
			elementSendkeys(getTxtName(), employeename);
			
			elementClick(getBtnSearch());
		}
		
		
		public void deleteDetails(String employeename) throws InterruptedException {
			elementClick(getBtnEmp());
			elementClick(getBtnSch());
			elementSendkeys(getTxtName(), employeename);
			elementClick(getBtnSearch());
			Sleep(5000);
			
			elementClick(getBtnDelete());
			Sleep(5000);
			elementClick(getBtnYes());
			Sleep(2000);
		}

		public void updateDetails(String employeename,String address) throws InterruptedException {
			
			elementClick(getBtnSch());
			elementSendkeys(getTxtName(), employeename);
			elementClick(getBtnSearch());
			Sleep(5000);
			elementClick(getBtnEdit());
			elementSendkeys(getTxtAddress(), address);
			elementClick(getBtnButton());
			
			
			
		}
		
	

}
