#Author: Azar
@ClockLocationDifferenceReport
Feature: Clock Location Difference Report

  @Loginmain
  Scenario Outline: Clock Location Difference Report
    Given User need to enter Clock Location Difference Report
    And User entered generate report for the CLDR individual report "<SheetName>" and <RowNumber>
    When User entered generate report for the CLDR Department report "<SheetName>" and <RowNumber>
    Then User entered generate report for the CLDR Section report "<SheetName>" and <RowNumber>
    When User entered generate report for the CLDR Designation report "<SheetName>" and <RowNumber>
    When User entered generate report for the CLDR Category report "<SheetName>" and <RowNumber>
    Then User entered generate report for the CLDR Destination group report "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName                     | RowNumber |
      | ClockLocationDifferenceReport |         0 |
