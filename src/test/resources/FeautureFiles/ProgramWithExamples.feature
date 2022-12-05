 Feature: ex username and password should give value via Examples
  @Example
  Scenario Outline:  exuser give value name via Examples
    Given Exuser should login into orange website
    When Exuser shoulg give "<username>" and "<password>" as below 
    And Exuser should click the login button
    Then Exuser should see the home page
    
    Examples:
    |username|password|
    |Admin|admin123|
    |Admin|admin123|
    |Admin|admin123|
    |Admin|admin123|