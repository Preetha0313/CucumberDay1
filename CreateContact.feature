Feature: CreateContact functionality for leaftabs application

Scenario Outline: CreateContact functionalities
Given Open the Chrome Browser
And Load the application url <url>
And Enter the username <username>
And Enter the password <password>
When Click login button
Then Home page should be displayed
When Click CRMSFA
When Click Contacts
When Click Merge Contacts
Then Merge contact page should be displayed
When Click First Lead
When Click Second Lead
When Click Merge Button
Then Alert box should be displayed


Examples:
|url|username|password|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|