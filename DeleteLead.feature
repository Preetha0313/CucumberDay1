Feature: DeleteLead functionality in leaftaps application

Scenario Outline: DeleteLead with testcase functionality
Given Open the Chrome Browser
And Load the application url <url>
And Enter the username <username>
And Enter the password <password>
When Click on Login button
Then Homepage should be displayed
When Click CRMSFA
When Click Leads 
When Click FindLeads
When Click Phone
Given Enter Phone Number <phonenumber>
When Click FindLeads Button
Then Capture lead ID of First Resulting lead
When Click on first resulting lead
When Click Delete
When Click Find Leads
Then Enter captured lead ID
When Click FindLeads button
Then Verify the deleted records not found


Examples:
|url|username|password|phonenumber|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'99'|
