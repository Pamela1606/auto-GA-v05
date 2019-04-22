Feature: Create and Brand

  Background: Brands form is displayed
    Given 'Store' page is loaded
    And click 'Create an brand' menu item in 'Brands menu'

  Scenario Outline: Verify creation of brand
    Given Fill 'Brand form' information
      | name   |
      | <name> |
    And click 'create' button in 'Brand menu'
    Then verify brand item with name "<name>" exist in 'Brands list'

    Examples:
      | name |
      | JAC  |
    And the status code should be 200