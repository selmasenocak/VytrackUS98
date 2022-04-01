@wip
Feature:three columns feature on the Vehicle Model page.


  Scenario Outline:
    Given user is on the login page
    And user enters below "<username>" and "<password>"
    And user is on the homepage
    And users click the Vehicle Costs under the Fleet
    Then users verify there are 3 columns on the table:TYPE, TOTAL PRICE, DATE


    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager120 | UserUser123 |
      | storemanager85  | UserUser123 |

