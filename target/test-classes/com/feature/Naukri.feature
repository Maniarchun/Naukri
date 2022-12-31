Feature: Upload Resume into Naukri

Scenario: LoginPage
Given user Launch The Application Url
When user Click The Login
And user Enter The User Name
And user Enther The Password
Then user Click The To Login
When user Click The Profile Option Icon
Then user Click The Update Profile
When user Delete The Resume
And user Upload The Resume
And user Refresh The Page
And user Again Click The Profile Option Icon
Then user Click The Logout
