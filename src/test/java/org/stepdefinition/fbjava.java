package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.pojo.FbLoginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbjava extends Baseclass {
	FbLoginpojo F;

	@Given("to launch the chrome browser and window maximize")
	public void to_launch_the_chrome_browser_and_window_maximize() {
		LaunchBrowser();
		windowMaximize();
	}

	@When("to launch the fb url")
	public void to_launch_the_fb_url() {
		launchURL("https://www.facebook.com/");

	}

	@When("to pass the email in email field")
	public void to_pass_the_email_in_email_field(io.cucumber.datatable.DataTable d) {
		F = new FbLoginpojo();
		Map<String, String> m = d.asMap(String.class, String.class);
		passText(m.get("email 1"), F.email());

	}

	@When("to pass the password in password field")
	public void to_pass_the_password_in_password_field(io.cucumber.datatable.DataTable d) {
		F = new FbLoginpojo();
		List<Map<String, String>> m = d.asMaps();
		passText(m.get(1).get("password 2"), F.password());

	}

	@Then("to close the chrome browser")
	public void to_close_the_chrome_browser() {
		closeEntireBrowser();

	}

}
