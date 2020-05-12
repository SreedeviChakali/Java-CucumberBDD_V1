Feature: Order food

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

 