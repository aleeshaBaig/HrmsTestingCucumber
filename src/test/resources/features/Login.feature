Feature: Login feature

  Scenario: Login
    Given user is navigated to hrms application
    When  user enters valid admin username and password
    And   user clicks on login button
    Then  admin user is successfully logged in
    @negativetest
   Scenario Outline: negative login test

      When user enters different "<username>" and "<password>" and verify the "<error>" for all the combination

      Examples:
       | username | password | error |
       | admin | 78787877 | Invalid credentials |
       | gul |Hum@nhrm123 | Invalid credentials |
       | Admin |  | Password cannot be empty |
       |  | Hum@nhrm123 | Username cannot be empty |


