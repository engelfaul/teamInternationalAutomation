Feature: Team International Home Page

  @test1
  Scenario: Searching information about TI
    Given Carlos is a user who want to know about Team International
    When he scrolls all page
    Then he should see information

  @test1
  Scenario: Check Software Solutions for Your Industry information
    Given Carlos is a user who want to know about Team International
    When he navigates through for industry information
    Then he should see information

  @test1
  Scenario: Check Software Solutions for Innovative information
    Given Carlos is a user who want to know about Team International
    When he navigates through for innovative IT information
    Then he should see information

  @test1
  Scenario: Check Software Trust us information
    Given Carlos is a user who want to know about Team International
    When he navigates through for trust us information
    Then he should see information

  @test1
  Scenario: Check Software Empower Your Career information
    Given Carlos is a user who want to know about Team International
    When he navigates through for Empower Your Career information
    Then he should see information

  @test1
  Scenario: Fill Contact Sales form
    Given Carlos is a user who want to know about Team International
    When he navigates through Contact Sales form
    Then he should see thank you message
