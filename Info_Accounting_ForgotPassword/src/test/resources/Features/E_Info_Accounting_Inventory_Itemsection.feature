#Author: Azar
@InventoryItems
Feature: Info-Accouting Inventory-Items

   @LoginFunction
  Scenario: Inventory-Items scenario
    Given User need to navigate to Item slide
    And User need to Add an item
    And User need to Manage an item
    Then User need to Manage a unit type
    Then User need to verify the headers