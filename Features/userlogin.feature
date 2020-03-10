Feature: Honeycomb Login feature

  	Scenario: Validating the Invalid password functionality
  	Given the user is in login page
  	When the user enters the valid username and invalid password
  	Then the user must be able to see the error message
  
  	Scenario: Validating the Invalid username functionality
  	Given the user is in login page
  	When the user enters the invalid username and valid password
  	Then the user must be able to see the error message
  
  	Scenario: Validating the Invalid username and Invalid password functionality
  	Given the user is in login page
  	When the user enters the invalid username and invalid password
  	Then the user must be able to see the error message
  
  
  	Scenario: Validating the forgot password functionality
  	Given the user is in login page
  	When the user clicks on forgot password link and enters the email
  	Then the user should be able too see the success message
  	
  	Scenario: Validating the Login actions
  	Given the user is in login page
  	When the user enters the username and password
  	Then the user must be able to see the logo in Asset detail screen
  
  
  #	Scenario: Validating the reset password function
    #Given the user is in login page
    #When the user clicks on forgot password link and enters the email
    #Then the user should be able to reset the password
