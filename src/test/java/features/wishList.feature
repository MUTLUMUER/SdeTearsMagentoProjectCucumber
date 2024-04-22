Feature: Wish List functionality

  Background:User enters valid credentials
    Given Navigate to Magento Commerce
    When User enter valid credentials

  Scenario: User creates a wishlist
    When user selects an item
    Then Click on the element in dialouge
      | chosenItem    |
      | addToWishList |
    And User should be able to verify after adding item to the wishlist
    When Click on the element in dialouge
      | actionSwitchButton |
      | MyAccount          |
      | wishListButton     |
    And User should be able to hoverover on the item
    Then Click on the element in dialouge
    |removingFromWishList|
    And User should be able to verify after deleting the item from wishList