Feature: EditLead functionality in leaftaps application

Scenario Outline: EditLead with testcase functionality
Given Open the Chrome Browser
And Load the application url <url>
And Enter the username <username>
And Enter the password <password>
When Click on Login button
Then Homepage should be displayed
When Click CRMSFA
When Click Leads 
When Click FindLeads
Given Enter the Firstname <firstname>
When Click FindLeads Button
When Click on first resulting lead
When Click Edit
Given Change the Companyname <Companyname>
When Click Update


Examples:
|url|username|password|firstname|Companyname|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'Babu'|'CTS'|
