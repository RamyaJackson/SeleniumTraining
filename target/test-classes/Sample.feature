Feature: To validate the login functionality of facebook application
Background:
Given To launch the chrome browser and maximise window 

Scenario: TO validate login with valid username and invalid password
When To launch the url of the facebook application
And To pass valid username in email field 
And  To pass invalid password in password field 
And To click the login button 
And  To check whether navigate to Homepage or Not
Then To close the Browser

Scenario Outline: To validate the negative and positive combination of the login  functionalty 
When User has to hit  the url of the facebook application
And User has to pass the data "<emaildatas> " in email field
And User has to pass the  data "<passworddatas>" in password field 
And User has to click login button
Then To close the Browser
Examples:
|emaildatas               |passworddatas|
|seleniuminmakes@gmail.com|Inmakes124|				
|abc@gamil.com            |12569638|
|inmakes@gmail.com        |selenium|
|Framework@gmail.com      |cucumber|
|manualtesting@gmail.com  |1245793|
|apitesting@gmail.com     |restassured|