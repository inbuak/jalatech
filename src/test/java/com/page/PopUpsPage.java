package com.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.manager.PageObjectManager;


public class PopUpsPage extends BaseClass {
	

	
	public PopUpsPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath= "(//i[@class='fa fa-hand-o-right'])[8]")
	private WebElement tabPopUps;
	

	@FindBy(id= "btn-one")
	private WebElement tabPopUpOne;

	@FindBy(id= "alertBox")
	private WebElement tabAlert;
	
	@FindBy(id= "confirmBox")
	private WebElement tabConfirmBox;
	
	@FindBy(id= "promptBtn")
	private WebElement tabPromptBtn;
	
	@FindBy(xpath= "(//div[normalize-space()='JALA Academy- A Place to find your Dream Job'])[3]")
	private WebElement txtPromptSuccess;
	
	
	
	
	public WebElement getTabConfirmBox() {
		return tabConfirmBox;
	}

	public WebElement getTabAlert() {
		return tabAlert;
	}

	public WebElement getTabPromptBtn() {
		return tabPromptBtn;
	}


	public WebElement getTxtPromptSuccess() {
		return txtPromptSuccess;
	}


	public WebElement getTabMore() {
		return tabMore;
	}


	public WebElement getTabPopUps() {
		return tabPopUps;
	}


	public WebElement getTabPopUpOne() {
		return tabPopUpOne;
	}
	
	
	
	public void morePopUp() {
		elementClick(getTabMore());
		elementClick(getTabPopUps());
	}
	
	public String popupOne() {
		String actual = null;
		elementClick(getTabPopUpOne());
		
		String parWindow = driver.getWindowHandle();
		Set<String> childWindow= driver.getWindowHandles();
		for (String newWin : childWindow) {
			
		if (!newWin.equals(parWindow)) {
			driver.switchTo().window(newWin);
			 actual = driver.getCurrentUrl();
			System.out.println(actual);
			
		}
		}
		return actual;
	}
	
	public String AlertBox() {
		elementClick(getTabAlert());
		  Alert al = driver.switchTo().alert();
		  String text = al.getText();
		  al.accept();
		return text;
		
		
	}
	
	public String confirmBox() {
		elementClick(getTabConfirmBox());
		  Alert al = driver.switchTo().alert();
		  String tex = al.getText();
		  al.dismiss();
		  return tex;
		
		
	}
	
	public String prompt() {
		elementClick(getTabPromptBtn());
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("JALA Academy- A Place to find your Dream Job");
		String t = al.getText();
		al.accept();
		  return t;
		
		
		
	}
		
}