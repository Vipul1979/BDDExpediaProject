Feature: Homepage functionality
  Scenario: User want to choose departure date
    Given User is on expedia website home page
    When User click on flight button
    And User click on departing date
    When User take all the date in the list
    And User click on 25th date
    Then User can see 25th June is selected