package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Baseclass;

public class fbcreloginpojo extends Baseclass {
	public fbcreloginpojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement cre;
	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement first;
	@FindBy(name = "reg_email__")
	private WebElement email;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement pass;

	public WebElement getCre() {
		return cre;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

}
