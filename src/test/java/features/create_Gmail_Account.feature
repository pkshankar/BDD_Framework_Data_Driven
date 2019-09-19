Feature: Create gmail account feature 

# Without using Examples keyword

#Scenario: Create gmail account scenario
#
#When user is on gmail create account page
#Then user enters "Shawn" and "Tin" and "shawntin" and "shawntin123" and "shawntin123"
#Then user clicks on next
#Then user quits the browser

# Using Example keyword

#Scenario Outline: Create gmail account scenario
#
#When user is on gmail create account page
#Then user enters "<firstname>" and "<lastname>" and "<username>" and "<password>" and "<confirmPassword>"
#Then user clicks on next
#Then user quits the browser
#
#Examples:
#
#	| firstname | lastname  | username | password | confirmPassword |
#	| John		| Scudamore | johns	   | johns123 | johns123		|
#	| Derek		| Billymore | derekb   | derekb234| derekb234		|
#	| Ron		| Cloney	| ronc	   | ronc345  | ronc345 		| 

# Using DataTable with list

#Scenario: Create gmail account scenario
#
#When user is on gmail create account page
#Then user enters firstname and lastname and username and password and confirmPassword
#| Eugene | cabral | eugenecabral | eugenec123 | eugenec123 |
#Then user clicks on next
#Then user quits the browser


# Using DataTable with map

Scenario: Create gmail account scenario 

	When user is on gmail create account page 
	Then user enters firstname and lastname and username and password and confirmPassword 
		|firstname | lastname | username | password | confirmPassword|
		| Roda | Still | rodac | rodac123 | rodac123 |
		| Shannon | Lawrence | shannonl | shannonl234 | shannonl123 |
		| Jerry | Peter | jerryp | jerryp654 | jerryp654 | 
	Then user clicks on next 
	Then user quits the browser 
	
	
