@Testana
Feature: This feature is use for testing UI of Retail page

  Background: 
    Given User is on retail website

  Scenario: Verify user can search a product
    When User search for "pokemon" product
    Then The product should be displayed

  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Verify Department sidebar options
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |

  
  Scenario: Verify User can add an item to cart
    When User click on Sign in option
    And User enter email 'makho@tek.us' and password 'Makho@tek7'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below informations
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    #| value   | value    | value       | value         | value | value | value | value   |
    And User click Add Your Address buttons
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card informations
      | cartNumber | nameOnCard | expirationYear | expirationMonth | securityCode |
    #| cartNumber | nameOnCard |             05 |            2025 | securityCode |
    And User click on Add your card buttons
    And User click on Place Your Order
    Then a message should be displayeds 'Order Placed, Thanks'

  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'makho@tek.us' and password 'Makho@tek7'
    And User click on login button
    And User should be logged in into Account
    And User changing the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search Icon
    And User click on items
    And User select quantities '5'
    And User click add to Cart button
    Then the cart icon quantity should changes to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayeds 'Order Placed, Thanks'
