Feature: Login functionality
Scenario: Registeration Functionality
Given User must be Registered 
When login with un and pd
	|username||password|
	|AlexUser||Alex@123|
	|Lalitha||password123|
	
Then user must be in the home page