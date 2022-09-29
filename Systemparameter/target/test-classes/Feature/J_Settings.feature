@Settings
Feature: Check all check boxes in settings tab in system parameter

  @Logincredentials
  Scenario: Check all check boxes in settings tab in system parameter
    Given Go to Utility System parameter and settings Tab
    When Check all check boxes in Settings Tab
    And Check allowance check box and rename and changes are done in Staffallowance section
    And Check extra classification check box and Changes are done in basic master setup option extraclassfication
    And click fix NRM and check in update by individual section
    And click show upto 8clocks and check in update by individual section
