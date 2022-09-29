Feature: Employee Basic Details

  Scenario Outline: Employee Creation
    #ShiftCreation
    Given User need to Create the Shift for the employee "<SheetName>" and <RowNumber>
    Given User need to create the department "<SheetName1>" and <RowNumber1>
    When User entered Dept code and Dept name "<SheetName1>" and <RowNumber1>
    Then User need to click save to create a Department
    Then User need to create the designation
    When User entered designation code and designation name "<SheetName1>" and <RowNumber1>
    And User have to click save to create a designation
    Then User need to create a section
    When User entered section code and section name "<SheetName1>" and <RowNumber1>
    And User need to select the dept and click save to create a section
    Then User need to create a category
    When User entered category code and category name "<SheetName1>" and <RowNumber1>
    And user need to click save to create a category
    Then User need to create the designation group
    When user entered designationgroupcode and designationgroupname "<SheetName1>" and <RowNumber1>
    Then user need to click save to create a designation group
    When User need to enter in to Master and Employee basic details section with "<SheetName3>" and <RowNumber3>
    And User Create a Employee by filling the employee form "<SheetName3>" and <RowNumber3>
    Then User have to click save to create a employee
    Given User have to Reset "<SheetName2>" and <RowNumber2>

    Examples: 
      | SheetName     | RowNumber | SheetName1           | RowNumber1 | SheetName2    | RowNumber2 | SheetName3      | RowNumber3 |
      | ShiftCreation |         0 | EmployeeBasicDetails |          0 | EmployeeDatas |          0 | EmployeeDetails |          0 |
      | ShiftCreation |         1 | EmployeeBasicDetails |          1 | EmployeeDatas |          1 | EmployeeDetails |          1 |
      | ShiftCreation |         2 | EmployeeBasicDetails |          2 | EmployeeDatas |          2 | EmployeeDetails |          2 |
      | ShiftCreation |         3 | EmployeeBasicDetails |          3 | EmployeeDatas |          3 | EmployeeDetails |          3 |
      | ShiftCreation |         4 | EmployeeBasicDetails |          4 | EmployeeDatas |          4 | EmployeeDetails |          4 |
      | ShiftCreation |         5 | EmployeeBasicDetails |          5 | EmployeeDatas |          5 | EmployeeDetails |          5 |
      | ShiftCreation |         6 | EmployeeBasicDetails |          6 | EmployeeDatas |          6 | EmployeeDetails |          6 |
      | ShiftCreation |         7 | EmployeeBasicDetails |          7 | EmployeeDatas |          7 | EmployeeDetails |          7 |
      | ShiftCreation |         8 | EmployeeBasicDetails |          8 | EmployeeDatas |          8 | EmployeeDetails |          8 |
