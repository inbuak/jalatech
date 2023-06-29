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


public class CollapsiblePage extends BaseClass {
	

	
	public CollapsiblePage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath= "(//i[@class='fa fa-hand-o-right'])[4]")
	private WebElement tabCollapse;
	
	@FindBy(xpath= "(//i[@class='more-less glyphicon glyphicon-plus'])[4]")
	private WebElement tabMultiFirstPara;
	
	@FindBy(xpath= "(//i[@class='more-less glyphicon glyphicon-plus'])[5]")
	private WebElement tabMultiSecondPara;
	
	@FindBy(xpath= "(//i[@class='more-less glyphicon glyphicon-plus'])[3]")
	private WebElement tabThirdPara;
	
	@FindBy(xpath= "//p[normalize-space()='There is a big difference between a mentor and a coach']")
	private WebElement txtThirdSuccessMsg;
	
	@FindBy(xpath= "//a[normalize-space()='Multiple Collapse']")
	private WebElement tabMultipleCollapse;
	
	@FindBy(xpath= "(//div[@class='panel-body'])[5]")
	private WebElement txtMultiSecSuccessMsg;
	
	
	public WebElement getTabMultipleCollapse() {
		return tabMultipleCollapse;
	}

	public WebElement getTxtMultiSecSuccessMsg() {
		return txtMultiSecSuccessMsg;
	}

	public WebElement getTabMore() {
		return tabMore;
	}

	public WebElement getTabCollapse() {
		return tabCollapse;
	}

	public WebElement getTabMultiFirstPara() {
		return tabMultiFirstPara;
	}

	public WebElement getTabMultiSecondPara() {
		return tabMultiSecondPara;
	}

	public WebElement getTabThirdPara() {
		return tabThirdPara;
	}

	public WebElement getTxtThirdSuccessMsg() {
		return txtThirdSuccessMsg;
	}
	
	public void moreCollapse() {
		elementClick(getTabMore());
		elementClick(getTabCollapse());
}
	
	public void collapse() throws InterruptedException   {
		
		Sleep(5000);
		elementClick(getTabThirdPara());
	}
	
	public void multiCollapse() throws InterruptedException {
		elementClick(getTabMultipleCollapse());
		elementClick(getTabMultiFirstPara());
		Sleep(5000);
		elementClick(getTabMultiSecondPara());
	}
		
	
	
}