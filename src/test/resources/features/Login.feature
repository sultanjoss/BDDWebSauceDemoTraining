@Login
  Feature: Login
    As a user I want to login website sauce demo

# Sekenario 1
#  Scenario: Normal Login
#    Given User already on login page
#    When User input "standard_user" as userName and input "secret_sauce" as password
#    Then User already on product page
#Sekenario 2
  Scenario Outline: invalid login
    Given User already on login page
    When User input "<userName>" as userName and input "<password>" as password
    Then User see "<erorText>" as eror text on login page

    Examples:
      | userName      | password | erorText                                                           |  |
      | standard_user |          | Epic sadface: Password is required                                 |  |
      |               | 12231221 | Epic sadface: Username is required                                 |  |
      |               |          | Epic sadface: Username is required                                 |  |
      | Tigor         | Keren    | Epic sadface: Username and password do not match any user in this service |  |
