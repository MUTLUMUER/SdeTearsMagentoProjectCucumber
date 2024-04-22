Feature: Search functionality

  Background:User enters valid credentials
    Given Navigate to Magento Commerce
    When User enter valid credentials

    Scenario: User checks search functionality
      When User enters product valid id number in the search box
      And User should be able to verify product id number

      Scenario: User checks invalid search functioanlity
        When User enters invalid product id number in the search box
        And A warning messagge must occur on the screen