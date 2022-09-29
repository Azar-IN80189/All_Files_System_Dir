@Branch
Feature: Employee_Creation_Phase 2

  @LoginFunction 
  Scenario Outline: Check whether user is able to create Branch setup in Scenario 1
    Then User need to create Branch setup
    When User Entered in to Branch section
    And User need to enter details in to Branch section "<SheetName>" and <RowNumber>
    Then User need to click save to allocate the particular branch to the shift

    Examples: 
      | SheetName | RowNumber |
      | Branch    |         0 |
      
 
  Scenario Outline: Check whether user is able to create Branch setup in Scenario 2
    Then User need to create Branch setup2
    When User Entered in to Branch section2
    And User need to enter details in to Branch section2 "<SheetName>" and <RowNumber>
    Then User need to click save to allocate the particular branch to the shift for Scenario 2

    Examples: 
      | SheetName | RowNumber |
      | Branch    |         1 |