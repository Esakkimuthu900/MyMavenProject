package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fourthpage {

	public WebDriver driver;
	
	@FindBy(id = "quantity_wanted")
	private WebElement quantity;
	
	@FindBy (id = "group_1")
	private WebElement size;
	
	@FindBy(xpath = "//*[text()='Add to cart']")
	private WebElement addtocard;

	public Fourthpage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}
	
	
	
	

}
