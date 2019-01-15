Feature: Registering a new user
  User should be able to create a new account on Department of Education website

Scenario:  Register a new user on Department of Education website
  Given User opens Department of Education website
  And Clicks on the Initial registration button
  And Provides the Activation key
  And Provides a username
  And Provides and confirms password
  When User clicks on Create account button
  Then A new account with provided credentials is successfully created
