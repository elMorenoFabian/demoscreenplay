# Autor: test
@stories
Feature: academy Choucair

  @scenario1
  Scenario: Search form a automatic course
    Given than brandon wants to learn automation at the academy choucair
    | strUser    | srtPassword   |
    | 1019057007 | Choucair2021* |
    When he search for the course on the choucair academy platform
    | strCourse        |
    | Foundation Level |
    Then he finds the course called resources
    | strCourse        |
    | Foundation Level |
