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


public class TooltipsPage extends BaseClass {
	

	
	public TooltipsPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath= "(//i[@class='fa fa-hand-o-right'])[7]")
	private WebElement tabTooltips;
	
	@FindBy(tagName= "button")
	private WebElement tabButton;

	public WebElement getTabMore() {
		return tabMore;
	}

	public WebElement getTabTooltips() {
		return tabTooltips;
	}

	public WebElement getTabButton() {
		return tabButton;
	}

	public void moreTooltip() {
		elementClick(getTabMore());
		elementClick(getTabTooltips());
	}
	
	public String afterToolTip() throws InterruptedException {
		elementClick(getTabButton());
		Sleep(4000);
		String attribute = getTabButton().getAttribute("data-original-title");
		return attribute;
	}
	
	public String beforeToolTip() throws InterruptedException {
		String att=null;
		Sleep(4000);
		
		 att = getTabButton().getAttribute("data-original-title");
		System.out.println(att);
		return att;
	}
	
	
}