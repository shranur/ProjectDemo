Feature: Free CRM test scenarios

Scenario: Free CRM Valid login


Given user is on login page
When title of home page is Free CRM
Then user enters username and password
Then user clicks on login button
Then user is on home page
