package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	public static WebDriver driver;
		
	
	@FindBy(xpath="(//a[@rel='nofollow'])[1]")
	private WebElement homepage;
	@FindBy(xpath="(//input[@name=\"email\"])[1]")
	private WebElement email;
	@FindBy(xpath="(//input[@name=\"passwd\"])[1]")
	private WebElement password;
	@FindBy(xpath="//button[@name=\"SubmitLogin\"]")
	private WebElement sigin;
	
	public WebElement getHomepage() {
		return homepage;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSigin() {
		return sigin;
	}
	public pom(WebDriver ldriver) {
		this.driver= ldriver;
		
		PageFactory.initElements(driver, this);
	}
	

}