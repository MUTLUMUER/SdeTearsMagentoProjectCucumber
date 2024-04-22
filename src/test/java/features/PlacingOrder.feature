Feature: Placing order functionality

  Background:User enters valid credentials
    Given Navigate to Magento Commerce
    When User enter valid credentials

  Scenario: Placing an order
    When user selects an item
    Then Click on the element in dialouge
      | itemAddToCart |
      | shoppingCart  |
    And User should be able to Change the Quantity
    Then Click on the element in dialouge
      | CheckOutButton  |
      | shippingAddress |
      | totalPrice      |
      | nextButton      |
      | billingCheckBox |
      | placeOrder      |
    And User should be able to verify Success Messagge
    Then Click on the element in dialouge
    |continueShopping|