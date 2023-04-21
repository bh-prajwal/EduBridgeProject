Feature: Verify below features of OpenCart application
Login feature, Forgot password link, Create a new account link

	@RegressionTest
  Scenario: Verify login with valid username and valid password
      Given user should be in dashboard page
      When user click on myaccount dropdown menu and clickon login option 
      And enter valid username and valid password and click on signin button
      Then user should be able to logged in
      And close the browser
     
   @RegressionTest 
   Scenario: Verify login with valid username and invalid password
      Given user should be in dashboard page
      When user click on myaccount dropdown menu and clickon login option 
      And enter valid username and invalid password and click on signin button
      Then user should not be able to logged in
      And close the browser
   
   @SmokeTest   
   Scenario: Verify forgot password link
      Given user should be in dashboard page
      When user click on myaccount dropdown menu and clickon login option 
      Then forgot password link should be displayed in login page
      And close the browser
      
      @SmokeTest  
   Scenario: Verify create a new account link
      Given user should be in dashboard page
      When user click on myaccount dropdown menu and clickon login option 
      Then create new account link should be displayed in login page
      And close the browser
   