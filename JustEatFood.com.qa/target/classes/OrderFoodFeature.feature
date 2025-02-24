#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Use the website to find restaurants
	          So that I can order food
	          As a hungry customer
	          I want to be able to find restaurants in my area


  @tag1
  Scenario: Search for restaurants in an area
	          Given I want food in "AR51 1AA"
	          When I search for restaurants
	          Then I should see some restaurants in "AR51 1AA"
	          
	Scenario: Search for user given restaurant with delivery option
    Given restaurants are open in my area
    When Pizza Hut - Shell Menu restaurant is open
    Then Check restaurant should have delivery option
    
    
	Scenario: Check if user given restaurant has 5 and above rating then select meal
    When Pizza Hut - Shell Menu restaurant has 5 and above rating
    Then Select meal
    Then Meal should be added to Basket


