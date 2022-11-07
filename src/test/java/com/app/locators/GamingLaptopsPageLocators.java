package com.app.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamingLaptopsPageLocators extends HomePageLocators {
	
	public GamingLaptopsPageLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@class='s1Q9rs'])")
	private List<WebElement> getdata;
	public List<WebElement> getGetdata() {
		return getdata;
	}
	
	
	
	
}
