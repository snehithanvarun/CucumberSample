package com.project.ProjectNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Sample {
	WebDriver driver;
	WebElement fname,lname;
	@Given("^The user is in demoqa registration page$")
	public void the_user_is_in_demoqa_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Snehithan\\eclipse-employee\\Cucumberproject\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");

	}

	@When("^The user enters firstname and lastname$")
	public void the_user_enters_firstname_and_lastname() throws Throwable {
	fname=	driver.findElement(By.name("first_name"));
	fname.sendKeys("snehithan");
	lname= driver.findElement(By.name("last_name"));
	lname.sendKeys("varun");
	}

	@Then("^The user verifies the entered text in firstname and lastname field$")
	public void the_user_verifies_the_entered_text_in_firstname_and_lastname_field() throws Throwable {
		Assert.assertEquals("snehithan",fname.getAttribute("value"));
		Assert.assertEquals("varun",lname.getAttribute("value"));
	}

}
