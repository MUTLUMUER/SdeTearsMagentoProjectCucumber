Feature: Login functionality

  Scenario: User enters valid credentials
    Given Navigate to Magento Commerce
    When User enter valid credentials
    And User should login successfully


  Scenario Outline: User enters invalid credentials
    Given Navigate to Magento Commerce
    When Click on the element in dialouge
      | signIn |
    Then Enter user credentials details
      | loginEmail | <email>    |
      | loginPass  | <password> |
    And Click on the element in dialouge
      | signInButton |
    And User should not login successfully
    And Click on the element in dialouge
      |signIn|
    Examples:
      | email                  | password       |
      | null                   | Ali_123456     |
      | alikemal1@gmail.com    | Ali_123456     |
      | alikemal6161@gmail.com | null           |
      | alikemal6161@gmail.com | Ali_1234566789 |




