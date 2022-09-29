Feature: Staff Allowance

  Scenario Outline: 
    When User have to click allowance settings and Staff allowance
    When Map allowance to particular employee from given sheetname "<SheetName>" and RowNumber <RowNumber>
    When User have to save the Attendance allowance

    Examples: 
      | SheetName       | RowNumber |
      | Staff Allowance |         0 |
