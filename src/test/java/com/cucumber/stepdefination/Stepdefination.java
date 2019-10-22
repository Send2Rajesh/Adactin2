package com.cucumber.stepdefination;

import com.cucumber.baseclass.baseclass;
import com.cucumber.pom.pom;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination extends baseclass{

@Then("^user has to see the sigin in homepage$")
public void user_has_to_see_the_sigin_in_homepage() throws Throwable {
	pom pm=new pom(driver);
	baseclass.clickelement(pm.getHomepage());
}

@Then("^user has to enter email in the emialfield$")
public void user_has_to_enter_email_in_the_emialfield() throws Throwable {
	pom pm=new pom(driver);
	baseclass.sendkeys(pm.getEmail(), "hari1234@gmail.com");
}

@When("^user has to enter password in the passwordfield$")
public void user_has_to_enter_password_in_the_passwordfield() throws Throwable {
	pom pm=new pom(driver);
	baseclass.sendkeys(pm.getPassword(), "12345678");
}

@When("^user has to click on sign in button$")
public void user_has_to_click_on_sign_in_button() throws Throwable {
	pom pm=new pom(driver);
	baseclass.clickelement(pm.getSigin());
}

	

}
