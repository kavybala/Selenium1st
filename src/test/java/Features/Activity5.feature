@activity5
Feature:login test
  @SmokeTest
  Scenario Outline: Testing Login with Example
  Given User is on Login page
  When User enters "<Usernames>" and "<Passwords>"
  Then Read the page Title and Confirmation message
  And Close Browser act4

  Examples:
  |Usernames|Passwords|
  |admin    |password|
  |kk       |wrong   |