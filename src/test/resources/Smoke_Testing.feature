Feature:  This is a Smoke suite


  @Smoke_Testing
  Scenario: Login to Orange HRM
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard



  @Smoke_Testing
  Scenario: Verify That the Hooks works fine
    Given The user wants to login website
    Then the user wants to verify that we can login



   @Smoke_Testing
  Scenario:
    Given The user wants to go to orangeHRM application
    When The user wants to login orange HRM
      |Username | Admin      |
      |Password |Mv@UE0@dR3f@|
    Then The user wants to click login
#    And The user should be able to navigate dashboard
#    Then The user wants to go to PIM page
#    Then The user wants to see add employee page
#    Then The user wants to add an employee
#      |FirstName|Tom123  |
#      |LastName |Jerry123|
#    Then The user wants to save the information
#    Then The user should be able to see "Personal Details"