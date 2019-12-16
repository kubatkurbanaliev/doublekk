Feature: Testing AWS calculator
  @Kubat
  Scenario: Testing calculation of prices for EC2 Instances
    Given User navigates to AWS calculator homepage
    When User adds 2 EC2 Instances
    And User adds 2 EC2 Dedicated Hosts
    Then Total estimated cost has to match with prices on "testData" "Sheet2" excel file