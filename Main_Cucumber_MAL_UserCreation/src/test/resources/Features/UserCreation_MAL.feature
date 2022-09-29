Feature: UserCreation

  Scenario Outline: Check whether user is able to create user account
    Given User have to navigate to the login page in MAL
    When User entered username and Password from given sheetname in MAL "<SheetName>" rownumber <RowNumber>
    Then User should enter in to the hompage of the user in MAL
    Given User need to enter in to db in MAL
    When User enters Database Name in MAL "<SheetName>" and <RowNumber>
    And User clicks on User Database name in MAL
    Given User have to click Administrator and User creation in MAL
    When User is entering in to user creation page in MAL
    And User need to create new user in MAL
    When User entered the details required for User Creation from given in MAL "<SheetName>" and <RowNumber>
    And User need to give superadmin permission in MAL
    And User need to give location access in MAL
    And User need to select the company in MAL
    And User need to click save finally for creating the user in MAL
    And User entered UserDetails as per the requirement in MAL
    When User navigated to the mailinator page in MAL
    Then User will enter search mail in MAL "<SheetName1>" and <RowNumber1>
    And User Need to change and reset password in MAL "<SheetName1>" and <RowNumber1>
    When User will navigate to login page will enter changed Username and password in MAL "<SheetName>" and <RowNumber>
    And After logged in successfully user loggedout successfully in MAL

    Examples: 
      | SheetName       | RowNumber | SheetName1 | RowNumber1 |
      #| User Login Data |         0 | Mail       |          0 |
      | User Login Data |         1 | Mail       |          1 |
      #| User Login Data |         2 | Mail       |          2 |
