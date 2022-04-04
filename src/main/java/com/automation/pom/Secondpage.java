package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Secondpage {
	
	public WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='passwd']")
	private WebElement password;
	
	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement submit_btn;

	public Secondpage(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit_btn() {
		return submit_btn;
	}

}
