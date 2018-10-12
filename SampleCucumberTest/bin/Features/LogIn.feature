#Author: Shreyata Sugandhi
@Smoke @P1
Feature: LogIn functionality Test
  As a user when I enter valid login id and password 
  I should be able to log into the ZeroBank app successfully. 

  Scenario: User should be able to log into the ZeroBank app with valid login id and password
    Given I should be able to launch the ZeroBank app
    And I should be on 'Home Page'
    And I click on 'SginIn' button
    And I land on 'LogIn' page
    When I enter login Id as 'username'
    And I enter password as 'password'
    And I click on 'Sign In' button
    Then I should be able to log into the ZeroBank app and land on 'User Home Page'

  