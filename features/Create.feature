Feature: LeafTaps Create Lead funtionality
Scenario Outline: Login with positive credential
Given Open the chrome browser
And Load the application url
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed
Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
|'demoCSR'|'crmsfa'|

Scenario: Login with negative credential
Given Open the chrome browser
And Load the application url
And Enter the username as 'demo'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed
But Error message should be displayed
