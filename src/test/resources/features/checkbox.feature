Feature:check the first checkbox to check all the Vehicle Costs



  Scenario Outline: users select all the vehicle costs
    Given user is on the login page
    And user enters below "<username>" and "<password>"
    And user is on the homepage
    And users click the Vehicle Costs under the Fleet
    And Click the first checkbox
    Then Verify all the vehicle costs are checked

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager120 | UserUser123 |
      | storemanager85  | UserUser123 |






