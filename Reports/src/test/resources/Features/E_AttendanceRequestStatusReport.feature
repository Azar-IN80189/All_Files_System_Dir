#Author: Azar
@AttendancerequeststatusReport
Feature: Attendance request status Report

  @Loginmain
  Scenario Outline: Attendance request status Report
    Given User need to enter Attendance request status Report
    And Generate report for the ARSR individual report "<SheetName>" and <RowNumber>
    When Generate report for the ARSR Department report "<SheetName>" and <RowNumber>
    Then Generate report for the ARSR Section report "<SheetName>" and <RowNumber>
    When Generate report for the ARSR Designation report "<SheetName>" and <RowNumber>
    When Generate report for the ARSR Category report "<SheetName>" and <RowNumber>
    Then Generate report for the ARSR Destination group report "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName                     | RowNumber |
      | AttendancerequeststatusReport |         0 |
