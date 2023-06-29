package com.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.manager.PageObjectManager;


public class CssPropertiesPage extends BaseClass {
	

	
	public CssPropertiesPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath= "(//i[@class='fa fa-hand-o-right'])[10]")
	private WebElement tabCss;
	
	@FindBy(xpath= "//a[normalize-space()='Link 2']")
	private WebElement tabLink2;
	
	@FindBy(xpath= "//a[normalize-space()='Labels']")
	private WebElement tabLabels;
	
	@FindBy(xpath= "//span[@class='label label-success']")
	private WebElement txtSuccess;
	
	@FindBy(xpath= "//a[normalize-space()='Buttons']")
	private WebElement tabButtons;
	
	@FindBy(xpath= "//a[normalize-space()='Alerts']")
	private WebElement tabAlerts;
	
	@FindBy(xpath= "//button[normalize-space()='Primary']")
	private WebElement txtPrimaryButton;
	
	@FindBy(xpath= "//strong[normalize-space()='Warning!']")
	private WebElement txtDangerAlerts;
	
	public WebElement getTabButtons() {
		return tabButtons;
	}

	public WebElement getTabAlerts() {
		return tabAlerts;
	}

	public WebElement getTxtPrimaryButton() {
		return txtPrimaryButton;
	}

	public WebElement getTxtDangerAlerts() {
		return txtDangerAlerts;
	}

	public WebElement getTabLabels() {
		return tabLabels;
	}

	public WebElement getTxtSuccess() {
		return txtSuccess;
	}

	public WebElement getTabMore() {
		return tabMore;
	}

	public WebElement getTabCss() {
		return tabCss;
	}

	public WebElement getTabLink2() {
		return tabLink2;
	}

	public void moreCss() {
		elementClick(getTabMore());
		elementClick(getTabCss());
	}
	
	public String link(){
		String act = null;
		elementClick(getTabLink2());
		String parWin = driver.getWindowHandle();
		Set<String> childWin= driver.getWindowHandles();
		for (String win : childWin) {
			
			if (!win.equals(parWin)) {
				driver.switchTo().window(win);
				 act = driver.getCurrentUrl();
				System.out.println(act);
			}
		}
		
		return act;
		
		
	}
	
	public void label() {
		elementClick(getTabMore());
		elementClick(getTabCss());
		elementClick(getTabLabels());
	}
	
	public void buttons() {
		elementClick(getTabMore());
		elementClick(getTabCss());
		elementClick(getTabButtons());
	}
	
	public void alertsCss() {
		elementClick(getTabMore());
		elementClick(getTabCss());
		elementClick(getTabAlerts());
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}