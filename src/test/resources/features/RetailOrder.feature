Feature: This feature is use for testing UI of Order page
@Testana
Scenario: Verify User can cancel the order
Given User is on retail website
When User click on Sign in option
And User enter email 'makho@tek.us' and password 'Makho@tek7'
And User click on login button
And User should be logged in into Account
And User click on Orders section
#And User click on first order in list
And User click on Cancel The Order button
And User select the cancelation Reason 'Bought wrong item'
And User click on Cancel Order button
Then a cancelation message should be displayed 'Your Order Has Been Cancelled'
