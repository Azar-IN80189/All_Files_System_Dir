Feature: System Parameter settings

  #Scenario 1
  Scenario Outline: PH and Rest Day settings Enable Allow Early OT and New Rule on PH
    Given Get into systemparameter and PH Rest day settings enable Allow early OT and Enable NEW RULE
    When Check updates in update by individual section Fetch Details from Excel Sheet "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         0 |

  #Scenario 2
  Scenario Outline: PH and Rest Day settings Enable Allow Early OT and Enable OLD RULE on PH
    Given Go to systemparameter and PH Rest Day settings Enable Allow early OT and Enable old rule
    When Updates are done in update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         1 |

  #Scenario 3
  Scenario Outline: PH and Rest Day Settings enable OLD RULE on PH with in shift time
    Given System parameter and PH and Rest Day Settings Enable old rule accept with in shift time
    When Check updates are showin update  by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         3 |

  #Scenario 4
  Scenario Outline: PH and Rest Day Settings enable OLD RULE on PH out of shift time
    Given System parameter and PH and Rest Day Settings Enable old rule accept with out of shift time
    When Check updates are update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         4 |

  #Scenario 5
  Scenario Outline: PH and Rest Day Settings enable NEW RULE on PH with in shift time
    Given System parameter and PH and Rest Day Settings Enable new rule accept with in shift time
    When Check update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         5 |

  #Scenario 6
  Scenario Outline: PH and Rest Day Settings enable NEW RULE on PH out of shift time
    Given System parameter and PH and Rest Day Settings Enable new rule accept with out of shift time
    When updated in update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         6 |

  #Scenario 7
  Scenario Outline: PH and Rest Day Settings Enable OLD RULE and with in shift time on RestDay
    Given Go to system parameter and Enable old rule with in shift time on RestDay
    When Changes are done in Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         7 |

  #Scenario 8
  Scenario Outline: PH and Rest Day Settings Enable OLD RULE and out of shift time on RestDay
    Given Go to system parameter and Enable old rule out of shift time on RestDay
    When Changes are show in Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         8 |

  #Scenario 9
  Scenario Outline: PH and Rest Day Settings Enable NEW RULE less than 4hrs on RestDay
    Given Go to system parameter and Enable new rule less than 4hrs on rest day
    When Check whether changes done in Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         9 |

  #Scenario 10
  Scenario Outline: PH and Rest Day Settings Enable NEW RULE greater than 4hrs on RestDay
    Given Go to system parameter and Enable new rule greater than 4hrs on rest day
    When Check changes are changed in Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |        10 |

  #Scenario 11
  Scenario Outline: PH and Rest Day Settings Enable NEW RULE out of shift time with OT on RestDay
    Given Go to system parameter and Enable new rule out of shift time with OT on rest day
    When changes are checked in Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |        11 |

  #Scenario 12  METHOD 2
  Scenario Outline: PH and Rest Day Settings Enable PH/REST Day Pay in Method 2 Rest day
    Given Go to system parameter and Enable PHREST Day and less than 4hrs on RD
    When Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |        12 |

  #Scenario 13
  Scenario Outline: PH and Rest Day Settings Enable PH/REST Day Pay in Method 2 Rest day
    Given Go to system parameter and Enable PH/REST Day and greater than 4hrs on RD
    When updates in Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |        13 |

  #Scenario 14
  Scenario Outline: PH and Rest Day Settings Enable PH/REST Day Pay in Method 2 Rest day
    Given Go to system parameter and Enable PH/REST Day and more than 4hrs after shift out on RD
    When Check here Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |        14 |

  #Scenario 15
  Scenario Outline: PH and Rest Day Settings Enable PH/REST Day Pay in Method 2 PH
    Given Go to system parameter and Enable PH/REST Day more than 4hrs with in shift on PH
    When Checked by Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |        15 |

  #Scenario 16
  Scenario Outline: PH and Rest Day Settings Enable PH/REST Day Pay in Method 2 PH
    Given Go to system parameter and Enable PH/REST Day and more than 4hrs after shift out on PH
    When Checked in  Update by individual section "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |        16 |

  #Scenario 17
  Scenario Outline: PH and Rest Day Settings Enable No NRM on PH
    Given system parameter and enable No NRM on PH
    When check NRM is changed or not "<SheetName>" RowNumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Dates     |         1 |
