Feature: WebApp B features

  @tagB
  Scenario Outline: As a user I want to search Hotels in Expedia
    Given I am navigated to Expedia
    When I choose Hotel Booking Tab
    And I provide <City> and <EIRCODE> Hotel Booking Information
    Then I should be able to view list of Hotel Search result

    Examples:
      | City | EIRCODE |
      | Dublin | D24E201
      | Cork | C34R450 |
      | Galway | S34E567|



