Feature:  check out
	Scenario:  check out functionality
		Given user navigate wholefoods page
		When user click on customer service page
		Then user  land on customer service page
		When user click on check it out link
		Then user redirect to FAQ page
		When user click on shop online page
		And  user click on contact us link
		Then user redirect to customer service page