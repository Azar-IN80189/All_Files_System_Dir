@AutoShift
Feature: Creating Autoshift Details

  Scenario Outline: Autoshift Creation
    Then User Login to the application
    And User Navigate to Autoshift Page
    When User enter the autoshift details "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName       | RowNumber |
      | Auto Shift Data |         0 |
     
