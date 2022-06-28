Feature: CreateLead functionality in leaftaps application

Scenario Outline: CreateLead with testcase functionality
Given Open the Chrome Browser
And Load the application url <url>
And Enter the username <username>
And Enter the password <password>
When Click on Login button
Then Homepage should be displayed
When Click CRMSFA
When Click Leads 
When Click CreateLead
Given Enter the Companyname <companyname>
Given Enter the Firstname <firstname>
Given Enter the Lastname <lastname>
Given Enter the FirstLocalname <firstlocalname>
Given Enter the Departmentname <departmentname>
Given Enter the Description <description>
Given Enter the Email <email>
When Click on Submit button


Examples:
|url|username|password|companyname|firstname|lastname|firstlocalname|departmentname|description|email|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'Testleaf'|'Preetha'|'M'|'prabhu'|'core department'|'Grow with test leaf'|'preethamahadevan1997@gmail.com'|
