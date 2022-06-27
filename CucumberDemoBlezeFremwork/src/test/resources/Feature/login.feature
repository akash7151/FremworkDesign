Feature: Sign in  functionality for DBsite

@login
Scenario: Sign in Details
Given User navigate to DB sign in site
When User have to Click on sign in button
And User have to enter valid username "Akas@9870"
And User have to enter valid password "dell@123"
And User have to click on sign in button
And User have to accept popup1
Then sign in successfully

@productSelect
Scenario: Product Selection
Given User navigate to product Section
When User have to select product
And User have to click on add to cart 
And User have to accept popup2
Then product add to cart successfully

@purchaseProduct
Scenario: Product purchase 
Given User navigate to cart
When User have to click on place order
And User have to enter Name "AAA"
And User have to enter Country "India"
And User have to enter City "Aurangabad"
And User have to enter Credit card "123456789"
And User have to enter Month "07"
And User have to enter Year "2022"
And User have to click on purchase
And User have to click on ok