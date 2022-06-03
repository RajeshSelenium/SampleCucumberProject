Feature: Test the login Functionality of OrangeHRM

Scenario: The the Valid Login1

Given user is on loginPage
When user enters the username and password
And click on login button
Then user should land on home page

Scenario: The the Valid Login2

Given user is on loginPage
When user enters the username and password
And click on login button
Then user should land on home page