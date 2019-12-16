Feature: Testing my application

  @db @TECTC-108
  Scenario Outline: Validating UI data with Database
    Given Navigate to MyApplication
    When User gets employee info for employee_id "<employee_id>" from UI
    And User gets data for employee_id "<employee_id>" Database
    Then Validate data are matching
    Examples:
    | employee_id |
    | 100         |
    | 105         |
    | 119         |
    | 125         |
