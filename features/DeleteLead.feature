@DeleteLead @lead
Feature: LeaftTaps Create Lead functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@functional @smoke
Scenario: Delete Lead with mandatory information
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on delete button
Then Homepage should be displayed
When Click on FindLeads
Then MyHomePage should be displayed