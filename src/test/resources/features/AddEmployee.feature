Feature: Add Employee
  @regression
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
    @smoke
  Scenario Outline: Add employee
      Given user is navigated to hrms application
      When  user enters valid admin username and password
      And   user clicks on login button
      Then  admin user is successfully logged in
      When  user  clicks on PIM option
      And  user clicks on Add employee button
      And user enters  "<firstname>", "<middlename>", and "<lastname>"
      And user clicks on save button
      Then employee added successfully
      Then user close the browser
    Examples:
      | firstname | middlename | lastname |
      | John | Doe | Smith |
      | Jane | | Johnson |
      | Mike | Edward | |
@datatable
Scenario: add employee
  Given user is navigated to hrms application
  When  user enters valid admin username and password
  And   user clicks on login button
  Then  admin user is successfully logged in
  When  user  clicks on PIM option
  And  user clicks on Add employee button
  When user add multiple employees and verify they are added
  |firstname|middlename|lastname|
  | John | Doe | Smith |
  | lubo | b | uu |
  | Mj | Mayar | S |