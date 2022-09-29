#Author: Azar
@Purchaseorder
Feature: Info-Accouting purchase order

  @Loginmain
  Scenario: Create a new purchase order
    Given User need to enter in to purchase order homepage
    Given User need to create new purchase order
    Then User need to approve and save
