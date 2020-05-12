$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrderFood.feature");
formatter.feature({
  "line": 1,
  "name": "Order food",
  "description": "",
  "id": "order-food",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for restaurants in an area",
  "description": "",
  "id": "order-food;search-for-restaurants-in-an-area",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I want food in \"AR51 1AA\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for restaurants",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see some restaurants in \"AR51 1AA\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "AR51 1AA",
      "offset": 16
    }
  ],
  "location": "Step.i_want_food_in(String)"
});
formatter.result({
  "duration": 9999202900,
  "status": "passed"
});
formatter.match({
  "location": "Step.i_search_for_restaurants()"
});
formatter.result({
  "duration": 6432156700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AR51 1AA",
      "offset": 34
    }
  ],
  "location": "Step.i_should_see_some_restaurants_in(String)"
});
formatter.result({
  "duration": 72722400,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Search for user given restaurant with delivery option",
  "description": "",
  "id": "order-food;search-for-user-given-restaurant-with-delivery-option",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "restaurants are open in my area",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Pizza Hut - Shell Menu restaurant is open",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Check restaurant should have delivery option",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.restaurants_are_open_in_my_area()"
});
formatter.result({
  "duration": 3001136200,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinitions.Step.restaurants_are_open_in_my_area(Step.java:46)\r\n\tat ✽.Given restaurants are open in my area(OrderFood.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step.pizza_Hut_Shell_Menu_restaurant_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step.check_restaurant_should_have_delivery_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Check if user given restaurant has 5 and above rating then select meal",
  "description": "",
  "id": "order-food;check-if-user-given-restaurant-has-5-and-above-rating-then-select-meal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Pizza Hut - Shell Menu restaurant has 5 and above rating",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Select meal",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Meal should be added to Basket",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 38
    }
  ],
  "location": "Step.pizza_Hut_Shell_Menu_restaurant_has_and_above_rating(int)"
});
formatter.result({
  "duration": 766600,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinitions.Step.pizza_Hut_Shell_Menu_restaurant_has_and_above_rating(Step.java:67)\r\n\tat ✽.When Pizza Hut - Shell Menu restaurant has 5 and above rating(OrderFood.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step.select_meal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step.meal_should_be_added_to_Basket()"
});
formatter.result({
  "status": "skipped"
});
});