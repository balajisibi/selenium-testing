package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Baseclass {
	@Before(order=1)
	private void precondition() {
		// TODO Auto-generated method stub
		LaunchBrowser();

	}

	@Before(order=2)
	private void precondition1() {
		// TODO Auto-generated method stub
		windowMaximize();

	}

	@Before(order=3,value="@smoke")
	private void precondition2() {
		// TODO Auto-generated method stub
		System.out.println("take screenshot of scenarios");

	}

	@After(order= 4)
	private void postcondition() {
		// TODO Auto-generated method stub
		closeEntireBrowser();

	}

	@After(order=5,value="@smoke")
	private void postcondion1() {
		// TODO Auto-generated method stub
		System.out.println("take screen shot of all scenarios");

	}

}
