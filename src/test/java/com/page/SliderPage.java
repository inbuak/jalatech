package com.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.manager.PageObjectManager;


public class SliderPage extends BaseClass {
	

	
	public SliderPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath= "//*[normalize-space()='More']")
	private WebElement tabMore;
	
	@FindBy(xpath= "(//i[@class='fa fa-hand-o-right'])[6]")
	private WebElement tabSlider;
	
	@FindBy(xpath= "//div[@class='slider-handle min-slider-handle round']")
	private WebElement slide;
	
	
	
	@FindBy(id= "ex6SliderVal")
	private WebElement txtMsg;

	public WebElement getTabMore() {
		return tabMore;
	}

	public WebElement getTabSlider() {
		return tabSlider;
	}

	public WebElement getSlide() {
		return slide;
	}

	public WebElement getTxtMsg() {
		return txtMsg;
	}
	
	public void moreSlider(){
		elementClick(getTabMore());
		elementClick(getTabSlider());
	}
	
	public void slide() {
		//elementClick(getSlide());
	Actions act=new Actions(driver);
	act.dragAndDropBy(getSlide(), 900, 0).perform();
	
	}
	
		
}