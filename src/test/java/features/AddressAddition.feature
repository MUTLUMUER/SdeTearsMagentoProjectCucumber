Feature: Address Addition Functionality

  Background:User enters valid credentials
    Given Navigate to Magento Commerce
    When User enter valid credentials

  Scenario Outline: User should be able to create a billing address
    When Click on the element in dialouge
      | actionSwitchButton  |
      | MyAccount           |
      | ManageAddresses     |
      | buttonAddNewAddress |
    Then Enter user credentials details
      | inputPhone  | <PhoneNumber> |
      | inputStreet | <Street>      |
      | inputCity   | <City>        |
      | inputZip    | <Zip>         |
    And select the dropdown credential details
    And Click on the element in dialouge
      | saveAddressButton |
    Examples:
      | PhoneNumber | Street            | City    | Zip   |
      | 555-9011    | 789 Oak Boulevard | Chicago | 60601 |
      | 555-9012    | 788 Oak Boulevard | Chicago | 60601 |
      | 555-9013    | 787 Oak Boulevard | Chicago | 60601 |

