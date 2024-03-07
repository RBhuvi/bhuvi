Feature: validate of facebook details
Scenario Outline: Validate the login functionality
Given User is on facebook page
When User enters username "<username>" and password "<password>"
And User click login button
Then User login success message displayed
Examples:
|username|password|
|test@gmail.com|98765|
|test1@gmail.com|12345|
|test2@gmail.com|456788|
    