@Activity4
Feature: Data driven test without Examples

 @loginTest @loginSuccess
 Scenario: Testing with correct data from the inputs
  Given when the user is on the login page
  When the user enters "admin" and "password"
  And clicks the submit button
  Then get the confirmation text and verify message as "Welcome Back, admin"


