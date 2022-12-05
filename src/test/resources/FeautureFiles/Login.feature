@Smoke
Feature: this is the login feature for Orange HRM
Scenario: Login scenario
    Given User is on Login Page
    
    When The User Enter the Valid UserName and Password
    And Clicks on the Login Button
   
    Then User should be able to Navigate to HomePage
  

 