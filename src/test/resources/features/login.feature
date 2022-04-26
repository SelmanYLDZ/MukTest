@smoke

  Feature: Login
    Agile Story:
    As a user,
    when I enter valid login credentials
    I should be able to see PanelPage

   @smoke @wip
     Scenario: Login as a user
      Given I am on the Login page
      When I login as a user
      Then I should be able to see the PanelPage


