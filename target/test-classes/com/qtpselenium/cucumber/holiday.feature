@BookHotelAndFlights
Feature: Going on holiday
I want to book flight tickets and a hotel

@BookHotel
Scenario: I want to book hotel
Given I live in London
And I want to go on a holiday
And We are 3 adults
|Adult1|Adult2|Adult3|
|A		 |B     |C     |
|20    |30    |40    |
And We want to book from 10th Feb 2019 to 20th Feb 2019
When I go to travel agent
Then He should be able to help me in a budget of 1000USD
And He should provide me the option to cancel
But He should not ask for advance more than 3000 USD


