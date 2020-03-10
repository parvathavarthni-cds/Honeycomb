Feature: Asset detail features
	Scenario: Validating the dropdown values
	Given the user is in Asset details screen
	When the user selects values from the dropdowns
	Then the user should be able to see the result based on the selection of values
	
	Scenario: Validating the master assets
	Given the user is in Asset details page
	When the user selects master option from the dropdown
	Then the user should be able to see all the master assets which is linked and not linked to product badges
	
	Scenario: Validating the loader
	Given the user is in Asset details page
	When the user selects values from the dropdowns and clicks on view button
	Then user should be able to see the loader
	
	Scenario: Validating the valid search functionality
	Given the user is in Asset details page
	When the user selects values from the dropdowns and clicks on view button
	And the user search for any asset
	Then the user should be able to get the result based on the search
	
	Scenario: Validating the invalid search functioanlity
	Given the user is in Asset details page
	When the user selects values from the dropdowns and clicks on view button
	And  the user search for any invalid asset
	Then user should be able to get the message as "No records found"

	Scenario: Validating the clear search icon presence
	Given the user is in Asset details page
	When the user selects values from the dropdowns and clicks on view button
	And the user search starts typing text inside the search field 
	Then the clear selection icon should appear

#	Scenario: Validating the clear search functioanlity
#	Given the user is in Asset details page
#	When the user selects values from the dropdowns and clicks on view button
#	And the user search any text and clicks on clear selection
#	Then the user should be able to see the search field is getting cleared
#	
#	Scenario:Validating the Export Functionality
#	Given the user is in Asset details page
#	When the user selects values from the dropdowns and clicks on view button
#	And the user clicks on Export button
#	Then the user should be able to see the Excel sheet is gettting downloaded
#	
#	