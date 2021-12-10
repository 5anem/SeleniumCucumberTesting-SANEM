Feature:  We are creating this feature file to add Orange HRM Scenarios


   @loginWithoutParams   @Regression
  Scenario: Login to Orange HRM
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard

   @LoginWithParams    @Anything  @ForFun  @Regression
  Scenario: Login with credz
    Given The user wants to go to orangeHRM application
    When The user wants to enter username as "Admin" and the password as "admin123"
    Then The user wants to click login
    And The user should be able to navigate dashboard


   @ForFun   @Anything  @Regression  @Maping @Mapping_TC234
   Scenario:
    Given The user wants to go to orangeHRM application
    When The user wants to enter username as "Admin" and the password as "Mv@UE0@dR3f@"
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add user name as "Tom1"
    Then The user wants to add last name as "Jerry1"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"






    @Mapping_TC23
   Scenario: Verify that add new employee with login credentials
      Given The user wants to go to orangeHRM application
      When The user wants to login orange HRM
          |Username | Admin      |
          |Password |Mv@UE0@dR3f@|
      Then The user wants to click login
      And The user should be able to navigate dashboard
      Then The user wants to go to PIM page
      Then The user wants to see add employee page
      Then The user wants to add an employee
          |FirstName|Tom1231223  |
          |LastName |Jerry123123123|
      Then The user wants to add login details
          |User Name   | erkanozclk123|
          |Password    |Erkan!123  |
          |Status      |Disabled   |
      Then The user wants to save the information
      Then The user should be able to see "Personal Details"


     @List_TC1
    Scenario: verify that add new employee with Login in List way
           Given The user wants to go to orangeHRM application
           When the user wants to login in list way
               |Admin       |Mv@UE0@dR3f@|
           Then The user wants to click login
           And The user should be able to navigate dashboard
           Then The user wants to go to PIM page
           Then The user wants to see add employee page
           Then The user wants to add an employee in a list way
               |Tommm123| Jerryyyyy|
           Then The user wants to add login details in a list way
              |renastech123 | RenasTech2021 |Disabled|
           Then The user wants to save the information
           Then The user should be able to see "Personal Details"


    @configFile_Scenario   @BackgroundPractice
   Scenario: Login
    And The user should be able to navigate dashboard

    @Candidate  @BackgroundPractice
   Scenario: Verify that we can create a candidate
      Then The user wants to navigate recruitment
      Then The user wants to see candidates
      And The user wants to add a candidate
      Then The user wants to enter first name as "erkan" and last name as "ozclk"
      Then The user wants to enter email as "ozclk@renastech.com"
      Then The user wants to Consent to keep data
      Then The user wants to save
      Then The user wants to verify that the user is created

    Scenario: about nothing
     Then the user want to do nothing

    @Hook
   Scenario: Verify That the Hooks works fine
      Given The user wants to login website
      Then the user wants to verify that we can login

    @Hook
   Scenario: Verify That the Hooks works fine
    Given The user wants to login website
    Then the user wants to verify that we can login







      @PageObjectModel
    Scenario: Verify that the user should be able to add new Nationality
      Given The user wants login as admin
      Then The user wants to verify dashboard
      When The user wants to go to admin
      Then The user wants to go to Nationalities
      Then The user wants to add new Nationalities
      Then The user wants to add Nationalities as "Batman"
      And The user should be able to see "Batman" in Nationality page



  @PageObjectModel2
    Scenario: Verify that we can click all the checkboxes are available
      Given The user wants login as admin
      Then The user wants to verify dashboard
      When The user wants to go to admin
      Then The user wants to go to Nationalities
      Then The user wants to click all checkboxes




    @Scenario_Outline
    Scenario Outline:
      Given The user wants login as admin
      Then The user wants to verify dashboard
      When The user wants to go to admin
      Then The user wants to go to Nationalities
      Then The user wants to add new Nationalities
      Then The user wants to add Nationalities as "<Nationalities>"

      Examples:
      |Nationalities|
      |erk1234da    |
      |erk312348    |











      # BDD                         -- Cucumber
      #Keyword Driven Testing                                                      ---- Hybrid Framework
      #Test Driven Testing             -- TestNG
      # Data Driven Testing           -- Using External Files or data

   # Apachi POI




     @Excel
    Scenario: Verify that we can login with excel data
      Given the user wants to login with excel
#      Then The user wants to verify dashboard











