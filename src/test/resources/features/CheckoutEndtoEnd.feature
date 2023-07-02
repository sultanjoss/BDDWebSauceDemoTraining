@ShoppingPage
  Feature: tugas untuk halaman shoppingpage


#    Scenario: Remove Item
#      Given User already on login page
#      When User input "standard_user" as userName and input "secret_sauce" as password
#      Then User already on product page
#      When The user has selected the product list with the option "Name (Z to A)"
#      Then User selects two items in want
#      And User is already on shopping chart page
#      Then The user removes an item that does not become purchased
#      And The user checks out to buy the item he wants

    Scenario: End To End Siklus SauceDemo
      Given User already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on product page
      When The user has selected the product list with the option "Name (Z to A)"
      Then User selects two items in want
      And User is already on shopping chart page
      Then The user removes an item that does not become purchased
      And The user checks out to buy the item he wants
      Given The user is already on the checkout page
      When User input "Nurdin" then "MTop" and enter "232323" as zip kode
      Then Verify if the tax a on the ordered item is displayed
      And User finish checkout
      Given User is already on the last checkout page
      When The user clicks the menu button
      Then User click logout option
      And The user returns to the login page