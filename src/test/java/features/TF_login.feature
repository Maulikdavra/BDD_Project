@loginFeature
Feature: validate Techfios login functionality 

Background: 
	Given User is on the Techfios login page
Scenario Outline: 1 User should able to login with valid credentials
	When User enters "<username>" and "<password>"             
	And User clicks on sigin button       
	Then User should land on Dashboard page
	When User should able to click on Bank and Cash option on dashboard   
	When User should able to click on New Account element under Bank and Cash element  
	When User should be able to enter data in Account Title field "<AccountTitle>"    
	When User should be able to enter data in Description feild "<Description>"
	When User should be able to enter data in Intial Balance field "<Initial Balance>"  
	When User should be able to enter data in Account Number field "<Account Number>"    
	When User should be able to enter data in Contact Person field "<Contact Person>" 
	When User should be able to enter data in Contact Phone field "<Contact Phone>"   
	And  User should be able to enter data in Banking Url field "<Banking Url>"  
	Then User should be able to click on Submit button  
	Examples: 
	|username         |password|AccountTitle|Description|Initial Balance|Account Number|Contact Person|Contact Phone|Banking Url |
	|demo@techfios.com|abc123  |MD			|xyz		|200			|232		   |Maulik		  |9720101      |www.BOFA.com|
	
#Background: 
#	Given User is on the Techfios login page 
#
#@Scenario1 @smoke
#Scenario: 1 User should be able to login with credentials 
#	When user enters username as "demo@techfios.com" 
#	When user enters password as "abc123" 
#	And user should click on signin button 
#	Then user should land on Dashboard page. 
#
#@Scenario2  @smoke
#Scenario: 2 User should be able to login with credentials 
#	When user enters username as "demo@techfios.com" 
#	When user enters password as "abc1234" 
#	And user should click on signin button 
#	Then user should land on Dashboard page. 
#
#@Scenario3	
#Scenario: 3 User should be able to login with credentials 
#	When user enters username as "dedsdsmo@techfios.com" 
#	When user enters password as "abc1234" 
#	And user should click on signin button 
#	Then user should land on Dashboard page.