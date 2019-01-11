Feature: Log into account
  Existing stackoverflow user should be able to log into account using correct credentials

Scenario: Login to account with correct details
  Given User navigates to stackoverflow website
  And User clicks on the login button on homepage
  And User enters a valid username
  And User enters a valid password
  When User clicks on the login buttons
  Then User should be taken to the successful login page