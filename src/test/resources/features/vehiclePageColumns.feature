Feature:three columns feature on the Vehicle Model page.


  Scenario: user should able to see three columns on the Vehicle Model page.

    Given users are on the homepage
    When users click the Vehicle Costs under the Fleet
    And users verify there are 3 columns on the table:TYPE,TOTAL PRICE, DATE
