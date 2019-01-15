  Feature: Picture change
    User changes his profile picture

  Scenario: User is able to log in by using a previously created account and change his profile picture
  Given User opens Department of Education website
  And Enters a valid username and password
  And Clicks on Login button
  And Opens his profile page
  When User uploads a new profile picture
  Then A new picture appears in user profile



