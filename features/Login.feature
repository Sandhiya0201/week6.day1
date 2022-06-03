#Feature: Leaftaps login functionality
#Scenario: Login with positive credential
#Given Open the chrome browser
#And Load the applcation URL
#And Enter the username as Demosalesmanager
#And Enter the password as crmsfa
#When  click on Login Button
#Then Homepage shpuld be displayed
@login
Feature: LeaftTaps login functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@smoke @regression
Scenario Outline: Login with positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional @regression
Scenario: Login with negative credential
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed