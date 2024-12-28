Feature: Test login functionality to demo project

  Scenario: Test login Functionliaty
    Given I open Login url
    When I enter username student
    And I enter password Password123
    And I click Submit button
    Then I verify "Logged In Successfully" is displayed after succesfull login

  #Scenario Outline: Test All Login functionality
    #Given I open Login url
    #When I enter given userName <username>
    #And I enter given password <password>
    #And I click Submit button
    #Then I verify "Logged In Successfully" is displayed after succesfull login
#
    #Examples:
#		|username|password|
#		|student|Password123|