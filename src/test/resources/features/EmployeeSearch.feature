Feature: Employee search
  Scenario: Search employee by id
    Given user is navigated to hrms application
    When  user enters valid admin username and password
    And   user clicks on login button
    Then  admin user is successfully logged in
    When  user navigates to employee list page
    When  user enter valid employee id
    And user click on search button
    Then user see employee information is displayed
    Then browser close

  Scenario: Search employee by name
    Given user is navigated to hrms application
    When  user enters valid admin username and password
    And   user clicks on login button
    Then  admin user is successfully logged in
    When  user navigates to employee list page
    When  user enter valid employee name
    And user click on search button
    Then user see employee information is displayed
    Then browser close