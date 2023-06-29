package com.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.manager.PageObjectManager;


public class LoginPage extends BaseClass {
	

	
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy (xpath="//*[@id=\"toast-container\"]/div/div[1]")
	private WebElement errorMsg;
	
	@FindBy(id = "UserName")
	private WebElement txtUsername;

	@FindBy(id = "Password")
	private WebElement txtPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/center/h1")
	private WebElement successMsg;
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void loginCommonStep(String username, String password) {
		elementSendkeys(getTxtUsername(), username);
		elementSendkeys(getTxtPassword(), password);
	
	

	}
	public void login(String username, String password) {
		loginCommonStep(username, password);
		elementClick(getBtnLogin());
		
	}

	public void loginWithEnterKey(String username, String password) throws AWTException {
		loginCommonStep(username, password);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	public void loginwithInvalidCredential(String username, String password){
		elementSendkeys(getTxtUsername(), username);
		elementSendkeys(getTxtPassword(), password);
		elementClick(getBtnLogin());
	}

	
	
	
	
}