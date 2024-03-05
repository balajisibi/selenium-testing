package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Baseclass;

public class FbLoginpojo extends Baseclass {
	public FbLoginpojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login;

	public WebElement email() {
		return email;
	}

	public WebElement password() {
		return password;
	}

	public WebElement login() {
		return login;
	}

}
