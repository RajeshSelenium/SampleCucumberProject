Feature: Test the login Functionality of OrangeHRM

  Scenario: The the Valid Login22
    Given user is on loginPage
    When user enters the "admin" and "admin123"
    And click on login button
    Then user should land on home page

  Scenario Outline: Test the valid login
    Given user is on loginPage
    When user enters the <username> and <password>
    And click on login button
    Then user should land on home page

    Examples: 
      | username | password  |
      | admin    | admin123  |
      | admin2   | admin1234 |
