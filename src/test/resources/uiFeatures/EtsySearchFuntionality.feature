@TecTC-1013
  Feature: Search Functionality
    Scenario: Search wireless iphone charger
      Given Navigate to home page
      Then In search field search for "wireless iphone charger"
      Then Choose option Free Shipping
      And Verify all products on the page have a free shipping text

    @TecTC-1014
    Scenario: Validating over price functionality
      Given Navigate to home page
      When In search field search for "carpet"
      And User click on Over Price checkbox
      Then User verifies all items prices are over that price

