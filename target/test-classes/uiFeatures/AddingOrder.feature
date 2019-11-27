@TEC-102 @ui @smokeTest @regressionTest
Feature: Adding order


  Scenario: Verify create order functionality
    Given Navigate to login page
    Then User logs in with valid credentials username "Tester" password "test"
    And User clicks on Order
    Then User creates new order
      | Product Name | Quantity | Customer Name | Street         | City    | State | Zip  | Card Nr   | Expire date (mm/yy) |
      | ScreenSaver  | 2        | Kubat         | 123 W Rose ave | Chicago | IL    | 6000 | 123456789 | 12/21               |
    Then User verifies order is created

  Scenario: Verify create order functionality with invalid data
    Given Navigate to login page
    Then User logs in with valid credentials username "Tester" password "test"
    And User clicks on Order
    Then User creates new order
      | Product Name | Quantity | Customer Name | Street         | City    | State | Zip     | Card Nr   | Expire date (mm/yy) |
      | ScreenSaver  | 2        | Kubat         | 123 W Rose ave | Chicago | IL    | zipCode | 123456789 | 12/21               |
    Then User verifies order was not created

  @TecTC-1015
  Scenario Outline: Verify delete functionality
    Given Navigate to login page
    Then User logs in with valid credentials username "Tester" password "test"
    And User deletes "<Name>" from table
    Then Validate that "<Name>" is deleted
    Examples:
      | Name           |
      | Mark Smith     |
      | Samuel Clemens |
      | Paul Brown     |