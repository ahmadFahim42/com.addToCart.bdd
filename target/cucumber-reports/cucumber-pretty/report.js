$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/addToCart.feature");
formatter.feature({
  "line": 1,
  "name": "addToCart",
  "description": "",
  "id": "addtocart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4447753274,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add to Cart",
  "description": "",
  "id": "addtocart;add-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@addToCart"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on Tablet button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on Add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on Shopping Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should see the item in the shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartStepDefinition.user_is_on_retail_website()"
});
formatter.result({
  "duration": 2257435317,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefinition.user_click_on_Tablet_button()"
});
formatter.result({
  "duration": 849177033,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefinition.user_click_on_Add_to_Cart_button()"
});
formatter.result({
  "duration": 478024965,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefinition.user_click_on_Shopping_Cart_button()"
});
formatter.result({
  "duration": 501353158,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefinition.user_should_see_the_item_in_the_shopping_cart()"
});
formatter.result({
  "duration": 293407385,
  "status": "passed"
});
formatter.after({
  "duration": 214129904,
  "status": "passed"
});
});