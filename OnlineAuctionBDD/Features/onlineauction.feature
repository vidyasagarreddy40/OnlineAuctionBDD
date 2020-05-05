Feature: Online Auction

Scenario:

Given Navigate to Welcome Page and click on Seller
When create Product as "<iphone>" "<XR>"
Then verify the alert



Scenario Outline:

Given Navigate to Welcome Page and click on bidder
When create bid as "<Name>" & "<Amount>" & "<Email>" & "<PhoneNumber>" & "<Address>" 
Then verify the alert of bidding

Examples:
|Name       |Amount |Email          |PhoneNumber|Address|
|Vidyasagar |550    |sagar@gmail.com|9160677220 |Hyderabad|