Login

Meta:
@tag login

Narrative:
  In order to use app functionality
  As a user
  I want to be able to login

Scenario: Successful user login
Meta:
@tag login01
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Home page
Examples:
|email              |password         |
|mineqabox@gmail.com|qualityassurance1|

Scenario: Unsuccessful user login with empty email
Meta:
@tag login02
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Login page
Then I should see error message
Examples:
|email|password|
|     |   psw  |