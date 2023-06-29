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


public class MenuPage extends BaseClass {
	

	
	public MenuPage() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath="(//i[@class='fa fa-hand-o-right'])[2]")
	private WebElement tabMenu;
	

	@FindBy(xpath="//a[@id='b1']")
	private WebElement tabTesting;
	
	
	
	
	@FindBy(xpath="//a[normalize-space()='Sub Menus']")
	private WebElement tabSubMenu;
	
	@FindBy(xpath="(//a[@class='dropbtn'])[1]")
	private WebElement tabSubTesting;
	
	@FindBy(id="selbtn")
	private WebElement tabSelenium;
	
	@FindBy(xpath="//span[normalize-space()='You Have Selected Selenium Menu Option.']")
	private WebElement txtSeleniumSuccessMsg;
	
	@FindBy(id="label")
	private WebElement txtTestingSuccessMsg;
	
	
	
	public WebElement getTabSubMenu() {
		return tabSubMenu;
	}


	public WebElement getTabSubTesting() {
		return tabSubTesting;
	}


	public WebElement getTabSelenium() {
		return tabSelenium;
	}


	public WebElement getTxtSeleniumSuccessMsg() {
		return txtSeleniumSuccessMsg;
	}


	public WebElement getTabMenu() {
		return tabMenu;
	}


	public WebElement getTabTesting() {
		return tabTesting;
	}


	public WebElement getTxtTestingSuccessMsg() {
		return txtTestingSuccessMsg;
	}


	public WebElement getTabMore() {
		return tabMore;
	}

	
	public void moreMenu() {
		elementClick(getTabMore());
		elementClick(getTabMenu());
	}
	public void singleMenu() throws InterruptedException {
		Sleep(3000);
		
		elementClick(getTabTesting());
	}
	public void subMenu() throws InterruptedException {
		elementClick(getTabSubMenu());
		elementClick(getTabSubTesting());
		Sleep(3000);
		mouseOverAction(getTabSelenium());
		Sleep(3000);
		elementClick(getTabSelenium());
	}
	
	
}