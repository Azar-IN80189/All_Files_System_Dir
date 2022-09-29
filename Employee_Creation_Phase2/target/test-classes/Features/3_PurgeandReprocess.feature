@purge
Feature: Purge and Reprocess

@SmokeTest
  Scenario Outline: Check whether user is able to purge and Reprocess
    Given User need to purge and reprocess a employee
    And User need to enter details in to purge and reprocess page "<SheetName>" and <RowNumber>
    Then User need to click process to purge and reprocess for an employee

    Examples: 
      | SheetName           | RowNumber |
      | Purge and Reprocess |         0 |