@version:Release-2
Feature: As a visitor I want to be able to search and buy on Amazon.

  Scenario: Users can search for books on Amazon
    Given the user is visiting the homepage
    When the user is searching for "java books"
    Then the user will be able to see results for his search


  Scenario: Users buy books on Amazon
    Given the user is visiting the homepage
    And the user is searching for "Effective Java"
    When the user is adding the "Effective Java" book in the basket
    Then the user will have the "Effective Java" book in the basket