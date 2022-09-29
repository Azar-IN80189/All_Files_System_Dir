@StaffAllowance
Feature: Staff Allowance

  Scenario Outline: Staff Allowance Test
    Given User have to click allowance settings and Staff allowance
    Then Map allowance to particular employee from given sheetname "<SheetName1>" and RowNumber <RowNumber1>
    When User have to save the Attendance allowance

    Examples: 
      | SheetName1      | RowNumber1 |
      | Staff Allowance |          0 |
