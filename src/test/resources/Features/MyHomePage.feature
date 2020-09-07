Feature: Booking com home page scenarios

@smoke
  Scenario:User search for a hotel
    Given user landed to the home page
    When user enters destination as Ella
   And user clicks on Search button
#    Then related search results should be displayed with search count