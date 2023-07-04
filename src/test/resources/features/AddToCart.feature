@AddToCart
Feature: ini adalah sebuah tugas



  Scenario: Normal Login
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User has selected the product list with the option "Name (Z to A)"
    And User selects two products, first Test all the things T-Shirt Red and second Suce Labs Onesie
    Then User is already on your cart page

