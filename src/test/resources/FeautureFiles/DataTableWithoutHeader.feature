
 Feature: username and password should be given via data table
  Scenario: give user name via datable
    Given user should login into orange website
    When user shoulg give username and password as below 
    |Admin|admin123|
    
    And user should click the login button
    Then user should see the home page
    

  
