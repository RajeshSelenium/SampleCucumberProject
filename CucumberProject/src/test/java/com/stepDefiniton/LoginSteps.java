package com.stepDefiniton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("user is on loginPage")
	public void user_is_on_Login_Page()
	{
		System.out.println("Step 1 : User is on Login page");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	//	 throw new io.cucumber.java.PendingException();
	}
	
	/*
	 * @When("user enters the username and password") public void
	 * user_enters_username_and_password() {
	 * System.out.println("Step 2 : User enters the username and password");
	 * driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 * driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 * 
	 * }
	 */	
	/*
	 * @When("^user enters the \"(.*)\" and \"(.*)\"$")
	 * 
	 * public void user_enters_username_and_password(String uname,String Password) {
	 * System.out.println("Step 2 : User enters username and password");
	 * driver.findElement(By.id("txtUsername")).sendKeys(uname);
	 * driver.findElement(By.id("txtPassword")).sendKeys(Password);
	 * 
	 * }
	 */
	@When("^user enters the (.*) and (.*)$")
	public void user_enters_username_and_password(String uname,String Password) {
	
		System.out.println("Step 2 : User enters username and password");
		  driver.findElement(By.id("txtUsername")).sendKeys(uname);
		  driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}
	
	@And("click on login button")
	public void click_on_login_button()
	{
		System.out.println("Step 3 : user clicks the login button");
		driver.findElement(By.name("Submit")).click();
	}
	
	
	  @Then("user should land on home page") public void user_lands_on_home_page()
	  { System.out.println("Step 4 : User lands on home page"); driver.close(); }
	 

}
