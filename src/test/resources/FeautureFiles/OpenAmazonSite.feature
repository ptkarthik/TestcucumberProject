
Feature: Open Amazon Site as a guest user and validate the pdp Page
 
  @regression
  Scenario: Open Amazon Site as a guest user and validate the pdp Page
    Given Open Amazon site 
    And give products details on search tab
   
    Then validate the product search results
    And check if there are relevant products

  


