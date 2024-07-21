@Activity5
Feature: Data driven test with Examples

 Scenario: Testing with Data from scenario
  Given when the user is on the login page
  When the user enters  "<Usernames>" and "<Passwords>"
  And clicks the submit button
  Then get the confirmation text and verify message as"<Message>"
  
  Examples:
  | Usernames | Passwords | Message |
  | admin     | password | Welcome Back, admin |
  | admin1    | password1 | Invalid credentials |


