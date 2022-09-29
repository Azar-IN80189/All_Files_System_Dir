@RecalculateAttendance
 Feature: Recalculate Attendance
 

  Scenario Outline: Check whether user is able to Recalculate Attendance
    Given User need to Recalculate attendance for an employee
    And User need to enter details in to Recalculate Attendance page "<SheetName>" and <RowNumber>
    Then User need to click Reprocess to Recalculate for an employee

    Examples: 
      | SheetName              | RowNumber |
      | Recalculate Attendance |         0 |