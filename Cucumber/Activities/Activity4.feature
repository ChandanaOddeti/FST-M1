@Activity4
Feature: Data driven test without examples

 @loginTest 
 Scenario: Succesfull login
  Given when the user is on the login page
  When the user enters username and password
  And clicks the submit button
  Then get the confirmation text and verify message


