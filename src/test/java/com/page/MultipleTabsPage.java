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


public class MultipleTabsPage extends BaseClass {
	

	
	public MultipleTabsPage() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath="(//i[@class='fa fa-hand-o-right'])[1]")
	private WebElement tabMultiple;
	
	@FindBy(xpath="//a[normalize-space()='Plan to Succeed']")
	private WebElement tabPlanToSucceed;
	
	@FindBy(xpath="//a[normalize-space()='UnLearning']")
	private WebElement tabUnLearning;
	
	@FindBy(xpath="//a[normalize-space()='Ways of Unlearning']")
	private WebElement tabWaysToLearning;
	
	@FindBy(xpath="/html/body/div[3]/div/section[2]/form/div/div/div/div/div/div[1]/p[1]/text()")
	private WebElement txtPlanSuccessMsg;
	
	@FindBy(xpath="/html/body/div[3]/div/section[2]/form/div/div/div/div/div/div[2]/p[1]/text()")
	private WebElement txtUnlearningSuccessMsg;
	
	@FindBy(xpath="/html/body/div[3]/div/section[2]/form/div/div/div/div/div/div[3]/p[1]/text()")
	private WebElement txtWaysSuccessMsg;
	
	
	
	

	public WebElement getTxtPlanSuccessMsg() {
		return txtPlanSuccessMsg;
	}

	public WebElement getTxtUnlearningSuccessMsg() {
		return txtUnlearningSuccessMsg;
	}

	public WebElement getTxtWaysSuccessMsg() {
		return txtWaysSuccessMsg;
	}

	public WebElement getTabUnLearning() {
		return tabUnLearning;
	}

	public WebElement getTabWaysToLearning() {
		return tabWaysToLearning;
	}

	public WebElement getTabMore() {
		return tabMore;
	}

	public WebElement getTabMultiple() {
		return tabMultiple;
	}

	public WebElement getTabPlanToSucceed() {
		return tabPlanToSucceed;
	}
	public void more() {
		
		elementClick(getTabMore());
		
	}
	public void planToSucceed() throws InterruptedException {
		
		elementClick(getTabMultiple());
		Sleep(5000);
		elementClick(getTabPlanToSucceed());
	}
	public void unLearning() throws InterruptedException {
		
		elementClick(getTabMultiple());
		Sleep(5000);
		elementClick(getTabUnLearning());
	}
	public void waysToLeaning() throws InterruptedException {
		
		elementClick(getTabMultiple());
		Sleep(5000);
		elementClick(getTabWaysToLearning());
	}
	
	
}