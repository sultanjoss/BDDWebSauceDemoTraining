@CheckOutPageEnd
  Feature: tugas untuk halaman Checkout page end to end


    Scenario: Check out in web SauceDemo automation testing

      #Scenario : Login Page
      Given User already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on product page

      #Scenario : User selects a Product
      When User has selected the product list with the option "Name (Z to A)"
      And User selects two products, first Test all the things T-Shirt Red and second Suce Labs Onesie
      Then User is already on your cart page

      #Scenario: Remove Item Product
      When User deletes one product with the name Test all the things T-Shirt Red
      And User checks out the product
      Then User is already on the checkout page

      #Scenario: Check Out Product
      When User input "Nurdin" then "MTop" and enter "232323" as zip kode
      Then Verify if the tax a on the ordered item is displayed
      And User finish checkout

      #Scenario: User Logout
      And User is already on the last checkout page
      When User clicks the menu button
      And User click logout option
      Then User returns to the login page


    Scenario Outline: checkout invalid information
      Given User already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on product page
      When User has selected the product list with the option "Name (Z to A)"
      And User selects two products, first Test all the things T-Shirt Red and second Suce Labs Onesie
      Then User is already on your cart page
      When User deletes one product with the name Test all the things T-Shirt Red
      And User checks out the product
      Then User is already on the checkout page
      When User input "<firstName>" then "<lastName>" and enter "<zipKode>" as zip kode
      Then User see "<erorText>" as eror text on checkout page
      Examples:
        | firstName | lastName | zipKode | erorText                       |  |
        |           | M TOP    | 343434  | Error: First Name is required  |  |
        | Nurdin    |          | 323232  | Error: Last Name is required   |  |
        | Nurdin    | M TOP    |         | Error: Postal Code is required |  |