package com.cucumber.runner;

import java.sql.Driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cucumber\\feature",
glue="com.cucumber.stepdefination")


public class Runner {
	public static WebDriver driver;
@BeforeClass
public static void browserlaunch() throws Exception {
//driver=baseclass.browserlaunch("chrome");
driver.get("http://automationpractice.com/index.php");
}
@AfterClass
public static void quit() {
	driver.quit();

}

}
