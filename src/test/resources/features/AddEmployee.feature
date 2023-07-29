Feature: Add Employee
  Scenario: Add employee
    Given user is navigated to hrms application
    When  user enters valid admin username and password
    And   user clicks on login button
    Then  admin user is successfully logged in
    When  user  clicks on PIM option
    And  user clicks on Add employee button
    And user enters firstname and second name
    And user clicks on save button
    Then employee added successfully
    Then user close the browser

