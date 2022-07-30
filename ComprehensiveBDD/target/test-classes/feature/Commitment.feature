@Regression
Feature: Tide Commitment

  @sanity
  Scenario: our Ambition
    Given i am on tide homePage
    And i mouseHover on Commitment
    When i click on Our ambition
    Then it should navigates to page
