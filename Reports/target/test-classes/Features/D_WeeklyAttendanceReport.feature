#Author: Azar
@Weeklyreports
Feature: Weekly Attendance Reports

  @Loginmain
  Scenario Outline: Weekly Attendance report
    Given User need to enter Weekly attendance reports
    Given User need to check the individual reports for all employee "<SheetName>" and <RowNumber>
    Then User need to verify the reports whether it is generating or not in individual reports for all employee
    And User need to check the individual reports for particular employee "<SheetName>" and <RowNumber>
    Then User need to verify the reports whether it is generating or not in individual reports for particular employee
    Then User need to check department report in weekly attendance section "<SheetName>" and <RowNumber>
    And User need to verify the reports whether it is generating or not in Department reports
    Then User need to check the department reports for particular department "<SheetName>" and <RowNumber>
    Then User need to verify the reports whether it is generating or not in department reports for particular department
    And User need to check the Section reports for all the sections "<SheetName>" and <RowNumber>
    Then User need to verify the reports whether it is generating or not in Section reports for all the sections
    And User need to check the Section reports for the particular section "<SheetName>" and <RowNumber>
    Then User need to verify the reports whether it is generating or not in Section reports for the particular sections
    Given User need to check the designation reports for all the designation "<SheetName>" and <RowNumber>
    When User need to verify the reports whether it is generating or not in designation reports for all the designation
    And User need to check the designation reports for the particular designation "<SheetName>" and <RowNumber>
    Then User need to verify the reports whether it is generating or not in designation reports for the particular designation
    Given User need to check the Category reports for all the Category "<SheetName>" and <RowNumber>
    When User need to verify the reports whether it is generating or not in Category reports for all the Category
    And User need to check the Category reports for the particular Category "<SheetName>" and <RowNumber>
    Then User need to verify the reports whether it is generating or not in Category reports for the particular Category
    Given User need to check the Extraclassification reports for all the Extraclassification "<SheetName>" and <RowNumber>
    When User need to verify the reports whether it is generating or not in Extraclassification reports for all the Extraclassification
    And User need to check the Extraclassification reports for the particular Extraclassification "<SheetName>" and <RowNumber>
    Then User need to verify the reports whether it is generating or not in Extraclassification reports for the particular Extraclassification

    Examples: 
      | SheetName      | RowNumber |
      | Weekly reports |         0 |
