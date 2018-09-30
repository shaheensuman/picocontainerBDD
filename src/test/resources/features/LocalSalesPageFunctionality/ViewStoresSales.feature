Feature:  view local store sales
@debug
Scenario Outline: find sales in local stores
	Given  user navigate wholefoods page
	When  user click on localsales link
	Then user navigate to local sales page
	When user click on select user location dropbox
	And user select "<state>" as state
	And user click on select a store drop box
	And user select "<store Location>" as store location
	And user click on view store button
	Then user verify city name appare at the top
	Examples:
	|state|store Location|
	|Missouri|Galleria - 1601 S. Brentwood Blvd|