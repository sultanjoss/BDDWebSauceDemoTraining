@CheckOut
  Feature: testing check

    Scenario Outline: checkout login
      Given User already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on product page
      When The user has selected the product list with the option "Name (Z to A)"
      Then User selects two items in want
      And User is already on shopping chart page
      Then The user removes an item that does not become purchased
      And The user checks out to buy the item he wants
      Given The user is already on the checkout page
      When User input "<firstName>" then "<lastName>" and enter "<zipKode>" as zip kode
      Then User see "<erorText>" as eror text on checkout page
      Examples:
        | firstName | lastName | zipKode | erorText                       |  |
        |           | M TOP    | 343434  | Error: First Name is required  |  |
        | Nurdin    |          | 323232  | Error: Last Name is required   |  |
        | Nurdin    | M TOP    |         | Error: Postal Code is required |  |