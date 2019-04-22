Feature: Delete an Brand

  Background: Brands form is displayed
    Given 'Store' page is loaded


  Scenario Outline: Verify deletion of brand
    Given click 'Remove a brand' button in element with name "<name>" of 'Brands list'
    And click 'Ok' button from deletion modal
    Then verify brand item with name "<name>" has been deleted of 'Brands list'

    Examples:
      | name |
      | Hola |