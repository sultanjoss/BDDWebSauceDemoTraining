@Sales
  Feature: Sales



    Scenario: Normal Login
      Given User already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on product page
      When User sort product list by "Price (high to low)"
