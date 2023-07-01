@RemoveItem
  Feature: test case remove item

    Scenario: Remove Item
      Given User already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on product page
      When The user has selected the product list with the option "Name (Z to A)"
      Then User selects two items in want
      And User is already on shopping chart page
      Then The user removes an item that does not become purchased
      And The user checks out to buy the item he wants