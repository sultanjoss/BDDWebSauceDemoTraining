@AddToCart
Feature: ini adalah sebuah tugas



  Scenario: Normal Login
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When The user has selected the product list with the option "Name (Z to A)"
    Then User selects two items in want
    And User is already on shopping chart page

