Feature:  We are creating this feature file to add Orange HRM Scenarios


#  Background:
#    Given The user wants to go to login
#    Then The user wants to click login


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


  @ForFun   @Anything  @Regression
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



    # Data tables
    @Maping
    Scenario:
      Given The user wants to go to orangeHRM application
      When The user wants to login orange HRM
           |Username | Admin      |
           |Password |Mv@UE0@dR3f@|
      Then The user wants to click login
     And The user should be able to navigate dashboard
      Then The user wants to go to PIM page
      Then The user wants to see add employee page
      Then The user wants to add an employee
          |FirstName|Tom123  |
          |LastName |Jerry123|
      Then The user wants to save the information
      Then The user should be able to see "Personal Details"


       @Mapping_TC2
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














  # Step Definition
  # Driver Class
  # Scenario
  # Parametrization
      # String
      # integer
      # double

  # Framework      // JAVA-- Maven -- > Selenium -- Cucumber  -- POM



  # Task
  # Login to OrangeHRM
  # Go to PIM and click Employee List
  # Click the last employee and verify that "Personal Details" is appear on the page
  # update :
  # Driver's License Number
  # License Expiry Date
  # Marital Status
  # Nationality
  # Date of Birth  and Save
  # and click add attachment and upload a sample file. for example  "anySample.pdf"



      # BDD Framework
       # Maven Project
       # Added Cucumber and Gherkin Plugins
       # Cucumber and Selenium Dependency
       # Create .feature file
          # Create scenario
       # Create Steps Definitions
       # Create config properties
       # Configuration reader
       # Runner Class
             # RunWith
             # CucumberOptions
                  # Feature
                  # Glue
                  # Tags




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






  # Eclipse , NetBeans ,

    # gherkin Language keyword, it is case sensitive

        # Framework      // JAVA-- Maven -- > Selenium -- Cucumber  -- POM



  ##   user story   by PO
  ##   Groom the story   DEV - QA - BA   -- > 3 Amigos
  ##    - DEV will start to devop their code
  ##    - QA Will create scenarios

  ## QA will start to test/Create coding








