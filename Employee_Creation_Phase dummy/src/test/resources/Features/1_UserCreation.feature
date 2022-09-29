Feature: UserCreation

  @LoginFunction
  Scenario Outline: Check whether user is able to create user account
    Given User have to click Administrator and User creation
    When User is entering in to user creation page
    And User need to create new user
    When User entered the details required for User Creation from given "<SheetName>" and <RowNumber>
    And User need to give superadmin permission
    And User need to give location access
    And User need to select the company
    And User need to click save finally for creating the user
    And User entered UserDetails as per the requirement
    When User navigated to the mailinator page
    Then User will enter search mail "<SheetName1>" and <RowNumber1>
    And User Need to change and reset password "<SheetName1>" and <RowNumber1>
    When User will navigate to login page will enter changed Username and password "<SheetName>" and <RowNumber>
    And After logged in successfully with "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName       | RowNumber | SheetName1 | RowNumber1 |
      | User Login Data |         0 | Mail       |          0 |
