

Feature: Test login functionality for demowebshop

@validlogin
Scenario: Successful Login
Given open chrome and start application
When I enter valid username and password
Then User should be able to login
 
@invalidlogin
Scenario: UnSuccessful Login
Given open chrome
When I enter invalid username and valid password
Then User should not be able to login