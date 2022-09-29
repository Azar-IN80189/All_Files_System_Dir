Feature: Employee Basic Details

  Scenario Outline: Employee Creation
    #ShiftCreation
    Given User need to Create the Shift for the employee "<SheetName>" and <RowNumber>
    #Given User need to create the department "<SheetName>" and <RowNumber>
    #When User entered Dept code and Dept name "<SheetName>" and <RowNumber>
    #Then User need to click save to create a Department
    #Then User need to create the designation
    #When User entered designation code and designation name "<SheetName>" and <RowNumber>
    #And User have to click save to create a designation
    #Then User need to create a section
    #When User entered section code and section name "<SheetName>" and <RowNumber>
    #And User need to select the dept and click save to create a section
    #Then User need to create a category
    #When User entered category code and category name "<SheetName>" and <RowNumber>
    #And user need to click save to create a category
    #Then User need to create the designation group
    #When user entered designationgroupcode and designationgroupname "<SheetName>" and <RowNumber>
    #Then user need to click save to create a designation group
    
    When User need to enter in to Master and Employee basic details section with "<SheetName>" and <RowNumber>
    And User Create a Employee by filling the employee form "<SheetName>" and <RowNumber>
    Then User have to click save to create a employee
    Given User have to Reset "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName        | RowNumber |
      | EmployeeCreation |         0 |
      | EmployeeCreation |         1 |
