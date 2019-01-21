  Feature: Password change
  User changes password and logs in again

    Background: Default password is restored
      Given Default password is restored

    Scenario: User is able to log in by using a previously created account, change his password and log in again using new credentials
    Given User opens Department of Education website
    And Enters a valid username and password
    And Clicks on Login button
    And Opens his profile page
    And Enters a new password and clicks on Save changes button
    And user logs out
    When User enters his username and new password
    And Clicks on Login button
    Then User successfully logs in

