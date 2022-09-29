#Author: Azar
@Attendanceproblemreports
Feature: Attnd prob Reports

  @Loginmain
  Scenario Outline: Attnd prob Report
    Given User need to enter Attnd prob reports
    And User entered generate report for the individual report "<SheetName>" and <RowNumber>

    When User entered generate report for the Department report "<SheetName>" and <RowNumber>
    Then User entered generate report for the Section report "<SheetName>" and <RowNumber>
    When User entered generate report for the Designation report "<SheetName>" and <RowNumber>
    When User entered generate report for the Category report "<SheetName>" and <RowNumber>
    Then User entered generate report for the Destination group report "<SheetName>" and <RowNumber>
    Examples: 
      | SheetName       | RowNumber |
      | AttndprobReport |         0 |
