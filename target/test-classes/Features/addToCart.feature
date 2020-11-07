Feature: addToCart


@addToCart
Scenario: Add to Cart

Given User is on retail website
When User click on Tablet button
And User click on Add to Cart button 
And User click on Shopping Cart button
Then User should see the item in the shopping cart

