 Feature: username and password should be given via data table
  Scenario: give user name via datable
    Given your user should login into orange website
    When your user shoulg give username and password as below 
    |UserName|Password|
    |Admin|admin123|
    And your user should click the login button
    Then your user should see the home page
    