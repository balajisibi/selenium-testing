package org.stepdefinition;

import org.pojo.FbLoginpojo;

import cucumber.api.java.en.Given;

public class positiveandnegative extends Baseclass {
	FbLoginpojo F;

	@Given("user has to pass the data<{string}> in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		F = new FbLoginpojo();
		passText(em, F.email());

	}

	@Given("user has to pass the data<{string}> in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		F = new FbLoginpojo();
		passText(pass, F.password());

	}

}
