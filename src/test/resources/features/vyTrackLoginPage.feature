Feature: User should be able to login using correct credentials

  Background: user is on the login page
    Given user is on the login page of VyTrack app



  Scenario Outline: User should be able to see all 12 months in months dropdown
    When user enters below "<username>" and "<password>"
    Examples: username and password
      | username     | password    |
      | salesmanager | UserUser123 |
      | storemanager | UserUser123 |
      | driver       | UserUser123 |

    Then user should see url contains orders