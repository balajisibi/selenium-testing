package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Baseclass;

public class gmLoginpojo extends Baseclass {
	public gmLoginpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@type='email']" )
	private WebElement email;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getNext() {
		return next;
	}

}
