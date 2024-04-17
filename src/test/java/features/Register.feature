Feature: Register functionality

  Scenario Outline: Register a new user
    Given Navigate to Magento Commerce
    And Click on the element in dialouge
      | createAccount |
    When Enter user credentials details
      | firstName        | <firstName>        |
      | lastname         | <lastname>         |
      | email            | <email>            |
      | password         | <password>         |
      | passConfirmation | <passConfirmation> |
    And Click on the element in dialouge
      | CreateAccountButton |

    Then User should register successfully
    Examples:
      | firstName | lastname | email                  | password   | passConfirmation |
      | AliKemal  | Cakiral  | alikemal6161@gmail.com | Ali_123456 | Ali_123456       |
