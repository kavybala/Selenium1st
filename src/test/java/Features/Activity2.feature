@activity2
  Feature:Test Login
    @SmokeTest
    Scenario: Testing Login
      Given User is on Login Page
      When User enters username and password
      Then Read the page title and confirmation message
      And Close the Browser