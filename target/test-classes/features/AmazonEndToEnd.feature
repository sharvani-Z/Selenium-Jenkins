Feature: Amazon End To End Flow

Scenario: Search Laptop

Given User opens Amazon
When User searches for "Laptop"
Then Search results should be displayed

Scenario: Sort Products

Given User opens Amazon
When User searches for "Mobile"
And User sorts by Low To High
Then Products should be sorted

Scenario: Open First Product

Given User opens Amazon
When User searches for "Laptop"
And User opens first product
Then Product title should be visible

Scenario: Open Today's Deals

Given User opens Amazon
When User clicks Today's Deals
Then Deals page should be displayed

Scenario: Open Customer Reviews

Given User opens Amazon
When User searches for "Laptop"
And User opens first product
And User opens customer reviews
Then Customer reviews should be displayed

Scenario: Add Item To Cart

Given User opens Amazon
When User searches for "Laptop"
And User opens first product
And User adds item to cart
Then Product should be added to cart

Scenario: Change Delivery Location

Given User opens Amazon
When User updates delivery location
Then Delivery location popup should be displayed