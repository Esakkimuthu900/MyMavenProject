package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fifethpage {

	public WebDriver driver;
	
	@FindBy(linkText = "Proceed to checkout")
	private WebElement proceed_btn;
	
	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	private WebElement confirn_Btn;
	
	@FindBy(xpath = "//*[@title='Continue shopping']")
	private WebElement continoueshopping;

	public WebElement getContinoueshopping() {
		return continoueshopping;
	}

	public WebElement getConfirn_Btn() {
		return confirn_Btn;
	}

	public Fifethpage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceed_btn() {
		return proceed_btn;
	}
}
