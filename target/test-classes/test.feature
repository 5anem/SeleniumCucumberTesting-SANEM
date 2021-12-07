Feature:   We are using this feature to demo class


  # gherkin language
  #        Ruby -Backend language
  # Gherkin Language has keyword
     #Given
     #When
     #Then
     #And

  #   BDD  - Behavioral Development Driven
     # Reusable
     # readablty


  # What is cucumber testing Tool?
    # We can create scenario with plain language
    # The cucumber tool bring collaboration to team
    # We are using Gherkin
    # to start a test a test case we need to declerate "Scenario"
    # it is readable
    # it is reusable

   # Gherkin Language
    # is plain language driven from Ruby
    # langugae that testers use to define test cases in cucumber
    # this language describe use cases or scenarios in a way that can be read and understand by
    # almost everyone in the team




  Scenario: Login to Matrix LMS
    Given The user wants to go to website
    When The user wants to enter username
    Then The user wants to enter password
    Then The user wants to click remember me
    And The user wants to click submit
    But The user wantss  sdasdas





    Scenario: Login with incorrect data
      Given The user wants to go to website
      When the user wants to enter incorrect username
      Then the user wants to enter password
      And The user wants to click submit



#    Task 1

     # Create a scenario that you can login Gmail

     # 5 min




  Scenario: Verify that login to gmail with positive credentials
    Given The user wants to go to google
    When The user wants to click gmail
    Then The user wants to enter email
    And The user wants to enter password
    Then The user wants to click login
    And The user wants to verify the first email


   # Create a negative scenario and verify the error msg
    #  incorrect password
    # Then verify msg   "Please enter correct password"


  Scenario: Verify that login to gmail with Negative credentials
    Given The user wants to go to google
    When The user wants to click gmail
    Then The user wants to enter email
    And The user wants to enter incorrect password
    Then The user wants to click login
    And The user wants to verify error message as "Please enter correct password"



  Scenario: Verify that login to gmail with positive credentials
    Given The user wants to go to google
    When The user wants to click gmail
    Then The user wants to enter username as "email@email.com" and password as "Password123"
    Then The user wants to click login
    And  The user wants to verify the first email



  Scenario: Verify that login to gmail with Negative credentials
    Given The user wants to go to google
    When The user wants to click gmail
    Then The user wants to enter username as "email@email.com" and password as "sdassdhasdn1534"
    Then The user wants to click login
    And The user wants to verify error message as "Please enter correct password"


#
#  - Create scenarios :
#            1) Verify that "Get Quote" button  is navigating application ?
#            2) Verify that in finance detail you should be able to select only one option.
#            3) Verify that when you complete application you should be able to see "Let us call you" button
#
#           http://practicerenastech.com
#


  @Hook
  Scenario: Verify That the Hooks works fine
    Given The user wants to login website
    Then the user wants to verify that we can login



