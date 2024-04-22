Feature: Product add and remove functionality

  Background:User enters valid credentials
    Given Navigate to Magento Commerce
    When User enter valid credentials

    Scenario: Product add and remove
      Given User selects random items
      And Click on the element in dialouge
      |addToCartButton|
      Then User should be able to verify after adding item to the cart
      And Click on the element in dialouge
        |shoppingCart|
      And User should be able to Change the Quantity
      Then Remove products from the Cart


