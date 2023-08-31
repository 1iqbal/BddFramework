@Testana
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'deena@tek.us' and password 'Deena@tek7'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'firstName' and Phone 'PhoneNumber'
    And User click on Update button
    Then User profile information should be updated

  Scenario: Verify User can add  an Address
    And User click on  Add address option
    And User fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click update Your Address button
    Then a address updated message should be displayed 'Address Updated Successfully'

  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed

  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cartNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cartNumber | nameOnCard |              10 |           2024 | securityCode |
    And User click on Add your card button
    Then a Payment message should be displayed 'Payment Method added successfully'

  Scenario: Verify User can edit Debit or Credit card
    And User click on Master Card
    And User click on Edit option of card section
    And user edit information with below data
      | cartNumber | nameOnCard | securityCode |
      | cartNumber | nameOnCard | securityCode |
    And user click on Update Your Card button
    Then a update message should be displayed 'Payment Method updated Successfully'

  Scenario: Verify User can remove Debit or Credit card
    And User click on Master Card to remove
    And User click on remove option of card section
    Then payment details should be removed
