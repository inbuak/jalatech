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


public class LinksPage extends BaseClass {
	

	
	public LinksPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath= "(//i[@class='fa fa-hand-o-right'])[9]")
	private WebElement tabLinks;
	
	@FindBy(xpath= "//a[normalize-space()='Working Links']")
	private WebElement tabWorking;
	
	@FindBy(xpath= "(//a[normalize-space()='Link 1'])[1]")
	private WebElement tabWorkingLink1;
	
	@FindBy(xpath= "//a[normalize-space()='Broken Links']")
	private WebElement tabBroken;
	
	@FindBy(xpath= "(//a[normalize-space()='Link 2'])[1]")
	private WebElement tabBrokenLink2;
	
	@FindBy(xpath= "//a[normalize-space()='Image Links']")
	private WebElement tabImages;
	
	@FindBy(xpath= "//img[@alt='Growic Link']")
	private WebElement ImgLink1;
	
	@FindBy(xpath= "//a[normalize-space()='Status Codes']")
	private WebElement tabStatus;
	
	@FindBy(xpath= "//a[normalize-space()='200']")
	private WebElement tabCode;
	
	
	public WebElement getTabStatus() {
		return tabStatus;
	}

	public WebElement getTabCode() {
		return tabCode;
	}

	public WebElement getTabMore() {
		return tabMore;
	}

	public WebElement getTabLinks() {
		return tabLinks;
	}

	public WebElement getTabWorking() {
		return tabWorking;
	}

	public WebElement getTabWorkingLink1() {
		return tabWorkingLink1;
	}

	public WebElement getTabBroken() {
		return tabBroken;
	}

	public WebElement getTabBrokenLink2() {
		return tabBrokenLink2;
	}
	
	public WebElement getTabImages() {
		return tabImages;
	}
	public WebElement getImgLink1() {
		return ImgLink1;
	}

	public void moreWorking() {
		elementClick(getTabMore());
		elementClick(getTabLinks());
	}
	
	public String workLink(){
		String actLink = null;
		elementClick(getTabWorkingLink1());
		String par = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String link : child) {
			if (!link.equals(par)) {
				driver.switchTo().window(link);
				 actLink = driver.getCurrentUrl();
				System.out.println(actLink);
			}
		}
		
		return actLink;
		
	}
	public void moreImages() {
		elementClick(getTabMore());
		elementClick(getTabLinks());
		elementClick(getTabImages());
	}
	
	
	public String imageLink() {
		String actUrl = null;
		
		elementClick(getImgLink1());
		String parent = driver.getWindowHandle();
		Set<String> ch = driver.getWindowHandles();
		for (String img : ch) {
			if (!img.equals(parent)) {
				driver.switchTo().window(img);
				  actUrl = driver.getCurrentUrl();
				System.out.println(actUrl);
			}
		}
		
		return actUrl;
		
	}
	

public void moreStatus() {
	elementClick(getTabMore());
	elementClick(getTabLinks());
	elementClick(getTabStatus());
}


public String statusCodes() {
	String actStat = null;
	
	elementClick(getTabCode());
	String p = driver.getWindowHandle();
	Set<String> c = driver.getWindowHandles();
	for (String stat : c) {
		if (!stat.equals(p)) {
			driver.switchTo().window(stat);
			  actStat = driver.getCurrentUrl();
			System.out.println(actStat);
		}
	}
	
	return actStat;
	
}
	
	
}