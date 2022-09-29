@ApproverSettings
Feature: Approver Settings

 @SmokeTest 
  Scenario Outline: Check whether user is able to Give Approver Access to a Employee
    Given User need to set the Approver for the employee
    When User Entered in to Approver page
    And User need to enter details in to Approver page "<SheetName>" and <RowNumber>
    Then User need to click save to Assign the Approver for an employee

    Examples: 
      | SheetName | RowNumber |
      | Approver  |         0 |