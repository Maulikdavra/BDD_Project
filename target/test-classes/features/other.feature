@otherFeature
Feature: validate Techfios login functionality 

Background: 
	Given User is on the Techfios login page 
@other1 @smoke
Scenario: 1 User should be able to login with credentials 
	When user enters username as "demo@techfios.com" 
	When user enters password as "abc123" 
	And user should click on signin button 
	Then user should land on Dashboard page. 

@other2  @smoke
Scenario: 2 User should be able to login with credentials 
	When user enters username as "demo@techfios.com" 
	When user enters password as "abc1234" 
	And user should click on signin button 
	Then user should land on Dashboard page. 

@other3	
Scenario: 3 User should be able to login with credentials 
	When user enters username as "dedsdsmo@techfios.com" 
	When user enters password as "abc1234" 
	And user should click on signin button 
	Then user should land on Dashboard page.