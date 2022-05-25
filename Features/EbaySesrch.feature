Feature: Ebay Search

Scenario Outline: mac book pro

Given I am on Ebay homepage
When I enter search "<term>"
Then I click on search button
Then I received related search result

Examples:
|term|
|mac book pro|