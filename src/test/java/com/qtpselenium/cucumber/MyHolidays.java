package com.qtpselenium.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyHolidays {
	
	@Given("^I live in Moscow$")
	public void i_live_in_Moscow(String cityName) throws Exception {
	      System.out.println("I live in Moscow");
	}

	@Given("^I want to go on a holiday$")
	public void i_want_to_go_on_a_holiday() throws Exception {
	    
	 System.out.println(" want to go on a holiday");   
	}

	@Given("^We are (\\d+) adults$")
	public void we_are_adults(int arg1) throws Exception {
	    
	    System.out.println("We are 10 adults");
	}

	@Given("^We want to book from (\\d+)th Jan (\\d+) to (\\d+)th Jan (\\d+)$")
	public void we_want_to_book_from_th_Jan_to_th_Jan(int arg1, int arg2, int arg3, int arg4) throws Exception {
	    
	    System.out.println("We want to book from 10th Jan 2019 to 20th Jan 2019");
	}

	@When("^I go to travel agent$")
	public void i_go_to_travel_agent() throws Exception {
	    
	    System.out.println("I go to travel agent");
	}

	@Then("^He should be able to help me in a budget of (\\d+)USD$")
	public void he_should_be_able_to_help_me_in_a_budget_of_USD(int arg1) throws Exception {
	    
	    System.out.println("He should be able to help me in a budget of 1000USD");
	}

	@Then("^He should provide me the option to cancel$")
	public void he_should_provide_me_the_option_to_cancel() throws Exception {
	    
		System.out.println("He should provide me the option to cancel");
	}

	@Then("^He should not ask for advance more than (\\d+) USD$")
	public void he_should_not_ask_for_advance_more_than_USD(int arg1) throws Exception {
	    
	   System.out.println("He should not ask for advance more than 3000 USD");
	}


}
