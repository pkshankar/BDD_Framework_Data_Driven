Feature: Gmail test feature 

# This feature is just for learning cucumber tags concept

@GmailLogin @SmokeTest
Scenario: Gmail login scenario 

	Given This is a gmail login scenario 
	
@GmailSendEmail	@SmokeTest @RegressionTest
Scenario: Gmail send email scenario 

	Given  this is a gmail send email scenario 
	
@GmailDelete @RegressionTest	
Scenario: Gmail delete email scenario 
	Given this is gmail delete email scenario 
