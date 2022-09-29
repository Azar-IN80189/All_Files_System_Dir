@Allowance
Feature: Allowance Creation

  @LoginFunction
  Scenario Outline: Allowance 1
    When User have to click Allowance Settings and create first Allowance
    And User need to give allowance details from given sheetname "<SheetName>" rownumber <RowNumber>
    Then User save the first allowance

    Examples: 
      | SheetName | RowNumber |
      | Allowance |         0 |

  Scenario Outline: Allowance 2
    When User have to click Allowance Settings and create second Allowance
    And User need to fetch allowance details from given sheetname "<SheetName>" rownumber <RowNumber>
    Then User save the second allowance

    Examples: 
      | SheetName | RowNumber |
      | Allowance |         1 |

  Scenario Outline: Allowance 3
    When User have to click Allowance Settings and create Third Allowance
    And User need to get allowance details from given sheetname "<SheetName>" rownumber <RowNumber>
    Then User save the third allowance

    Examples: 
      | SheetName | RowNumber |
      | Allowance |         2 |

  Scenario Outline: Allowance 4
    When User have to click Allowance Settings and create Fourth Allowance
    And User need to bring allowance details from given sheetname "<SheetName>" rownumber <RowNumber>
    Then User save the fourth allowance

    Examples: 
      | SheetName | RowNumber |
      | Allowance |         3 |
