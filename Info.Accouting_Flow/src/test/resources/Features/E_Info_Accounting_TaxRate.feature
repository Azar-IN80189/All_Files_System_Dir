#Author: Azar
@TaxRate
Feature: Info-Accouting Tax Rate scenario

  @LoginFunction
  Scenario: Tax Rate scenario
    Given User need to Login & navigate to tax rates section
    And User need to create a tax rate 
    Then User need to edit the tax rate
    Then User need to Delete the tax rate
