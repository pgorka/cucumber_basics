  Feature: Picture change
    User changes his profile picture

#    Background: Default profile picture is restored
#      Given Default profile picture is restored

#  Scenario: User is able to log in by using a previously created account and change his profile picture
#    Given User opens Department of Education website
#    And User enters his username and new password
#    And Clicks on Login button
#    And Opens his profile page
#    When User uploads a new profile picture
#    Then A new picture appears in user profile


    Scenario Outline: User is able to log in by using a previously created account and change his profile picture
      Given User opens Department of Education website
      And User enters his <username> and <password>
      And Clicks on Login button
      And Opens his profile page
      When User uploads a new profile picture
      Then A new picture appears in user profile
      Examples:
      |username|password|
      |     test.bdd.auto   |   Test321#     |
      |   test.bdd.auto1     |     Test123#   |
      |    test.bdd.auto2    |     Test123@   |

