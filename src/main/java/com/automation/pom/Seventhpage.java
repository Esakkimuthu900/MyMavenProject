package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seventhpage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womendress;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(id ="color_16")
	private WebElement dresses1;

	public WebElement getDresses1() {
		return dresses1;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomendress() {
		return womendress;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public Seventhpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignout() {
		return signout;
	}

}
