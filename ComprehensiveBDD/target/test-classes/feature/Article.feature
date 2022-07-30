@Regression
Feature: Articles info

  @sanity
  Scenario: Loard of Love
    Given i am on tide homePage
    And i scroll down window
    When i click on loards of love article
    Then it should navagates article page
