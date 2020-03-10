Feature: Add assets for Managed Funds
#Asset codes are provided on the basis of test data only

Scenario: Validating the Add/Remove Asset screen 
	Given the user in Asset detail screen
	When the user clicks on Add/Remove asset dropdown
	Then the user should be able to see the add radio button checked in as default

Scenario: Validating the loader
	Given the user is in Add/Remove asset page
	When the user search for an asset code
	Then the user should be able to see the loader before it displays the asset notes
	
Scenario: Validating the Add functionality
	Given the user is in Add/Remove asset page
	When the user search for an asset code which is operationally ready
	Then user should be able to see the add label

Scenario: Validating the Add functionality
	Given the user is in Add/Remove asset page
	When the user selects the value in the product badge and service dropdown 
	Then the user should be able to add the asset under the corresponding product badge and service dropdown

Scenario:Validating the Remove functionality
	Given the user is in Add/Remove asset page
	When the user clicks on remove asset radio button
	And the user search for an asset code which is operationally ready/not 
	Then the user should be able to remove the asset from the product badge and service dropdown

Scenario:Validating the asset already exists message
	Given the user is in Add/Remove asset page
	When the user Add asset under a product badge and service linkage in which the asset already exists
	Then the user should be able to see the already exists message

Scenario:Validating the operationally not ready asset message
	Given the user is in Add/Remove asset page
	When the user search for an asset code which is operationally not ready
	Then the user should be able to get the operationally not ready asset message

	


