#Author: Azar
@exceptionreports
Feature: Exception Reports

  @Loginmain
  Scenario Outline: Exception Report
    Given User need to enter Exception reports
    When User entered generate report for the lateness-individual employee "<SheetName>" and <RowNumber>
    Then User need to generate report for the absentees-department
    And User need to generate report for the Missing clocks-Section
    And User need to generate report for the Overtime-designation
    And User need to generate report for the Allowance-category
    Then User need to generate report for the clocking-DesignationGroup
    And User need to generate report for the clock out-DesignationGroup

    Examples: 
      | SheetName         | RowNumber |
      | Exception reports |         0 |
