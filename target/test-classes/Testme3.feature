Feature: Search Functionality
@Login
Scenario: Login Functionality
Given User must be in home page
When User enter login credentails "Lalitha" and "password123" 
Then User enters into Searching product page
@Search
Scenario: Search Functionality
Given User must be in search home page 
When user enters the product "head" to select headphone by clicking on find details
Then User enters into product find details page
@purchase
Scenario: Purchase Functionality
Given User selects the product 
When User proceeds with payment
Then user has purchased the product