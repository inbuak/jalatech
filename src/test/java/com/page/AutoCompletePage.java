package com.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.manager.PageObjectManager;


public class AutoCompletePage extends BaseClass {
	

	
	public AutoCompletePage() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath="(//i[@class='fa fa-hand-o-right'])[3]")
	private WebElement tabAutocomplete;
	

	@FindBy(xpath="//a[normalize-space()='Multiple Values']")
	private WebElement tabMultiValues;
	

	@FindBy(id="txtSingleAutoComplete")
	private WebElement tabTxtSingle;
	
	@FindBy(id="txtMultipleAutoComplete")
	private WebElement tabTxtMultiple;


	@FindBy(id="ui-id-1")
	private WebElement tabTxt;
	
	@FindBy(id="ui-id-2")
	private WebElement tabMultiTxt;
	
	
	public WebElement getTabMultiTxt() {
		return tabMultiTxt;
	}


	public WebElement getTabTxt() {
		return tabTxt;
	}


	public WebElement getTabMore() {
		return tabMore;
	}


	public WebElement getTabAutocomplete() {
		return tabAutocomplete;
	}


	public WebElement getTabMultiValues() {
		return tabMultiValues;
	}


	public WebElement getTabTxtMultiple() {
		return tabTxtMultiple;
	}


	public WebElement getTabTxtSingle() {
		return tabTxtSingle;
	}
	
	public void moreAuto() {
		elementClick(getTabMore());
		elementClick(getTabAutocomplete());
		
	}
	
	public void singleValues(String tags) throws InterruptedException {
		//elementClick(getTabSingleValues());
		Sleep(3000);
		elementSendkeys(getTabTxtSingle(), tags);
	
	}
	
	public void multipleValues(String tags) {
		elementClick(getTabMultiValues());
		elementSendkeys(getTabTxtMultiple(), tags);
	}
	
	
	public  List<WebElement> tag() {
		Wait w =new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(getTabTxt()));
		
		 List<WebElement>  findElements = getTabTxt().findElements(By.tagName("li"));
		  return findElements;
	}
	
	public  List<WebElement> tags() {
		Wait w =new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(getTabMultiTxt()));
		
		 List<WebElement>  findElements = getTabTxt().findElements(By.tagName("li"));
		  return findElements;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}