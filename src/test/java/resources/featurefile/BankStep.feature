Feature: Bank xyz Test
  As user I want to open a Xyzbank website

  @Smoke @Sanity @Regression
  Scenario: BankManager Should Add Customer Successfully.
    Given I am on homepage
    When I click on bank manager login tab
    And I click on add customer tab
    And I enter firstname "kavan"
    And I enter lastname "patel"
    And I enter postcode "ha3 2la"
    And I click on add customer button
    And pop up message display
    Then click on ok button on popup

  @Sanity @Regression
  Scenario: BankManager Should Open Account Successfully
    Given I click on bank manager login tab
    When I click on open account tab
    And I search for customer name "1"
    And I select currency "Pound"
    And I click on process button
    And I see a pop up message display
    Then  click on ok button on popup

  @Smoke @Regression
  Scenario: Customer Should Login And Logout Suceessfully
    Given I click on customer login tab
    When I search for customer name "1"
    And I click on login button
    And I verify logout tab displayed
    And I click on logout
    Then I see your name text displayed

  @Smoke @Sanity @Regression
  Scenario: Customer Should Deposit Money Successfully
    Given I click on customer login tab
    When  I search for customer name "1"
    And  I click on login button
    And I click on deposit tab
    And I enter amount "100"
    Then I clcik on deposit button

  @Regression
  Scenario: Customer Should Withdraw Money Successfully
    Given I click on customer login tab
    When I search for customer name "1"
    And  I click on login button
    And  I click on withdraw
    And I enter withdraw amount "50"
    And I click on withdraw button
    Then I see message transaction successful
