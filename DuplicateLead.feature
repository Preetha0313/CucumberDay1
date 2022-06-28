Feature: DuplicateLead functionality for leaftabs application

Scenario Outline: Duplicate lead functionalities
Given Open the Chrome browser
And Load the Url <url>
And Enter the valid username <username>
And Enter the valid password <password>
When Click on login button
Then Home page should be displayed
When Click on CRMSFA
When Click on Leads
When Click on FindLeads
Given Enter the emailId <email>
When Click on Find Leads
Then Get and print first lead id
When Click on First resulting lead
Then Get and print company name of that lead
When Click on duplicate lead
Then Duplicate lead page should be displayed
When Click on submit button
Then Get and print company name of this lead
Then Compare both company names


Examples:
|url|username|password|email|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'babu@testleaf.com'|
