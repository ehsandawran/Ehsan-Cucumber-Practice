Feature: Verify Sign Up Page Functionality

  Scenario: Verify user able to log in
    Given User navigates to login page "https://www.letskodeit.com/login"
    When User enters email "ed.max@gmail.com"
    And User enters password "kG9NFc@A54vFbPi"
    And User clicks login button
    Then System redirects to myCourses page "https://www.letskodeit.com/"
