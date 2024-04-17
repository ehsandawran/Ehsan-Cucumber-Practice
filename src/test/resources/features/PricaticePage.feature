Feature: Practice Page Functionality

  @SmokeTest
  Scenario: Verify you can navigate through Practice Page
    Given User navigates to PractivePage "https://www.letskodeit.com/practice"
    When User clicks radio buttons
    And User clicks cheks
    And User clicks openWindow
    And User clicks openTab
    And User selects car "Benz"
    And User selects fruits
    And User enters text1 "This is an automated text message..."
    And User tries enableDisbale example "enable/disable successful"
    And User tries showHide example "show/hide sucessful.."
    And User tries alerts "My name is Selenium"
    And User hovers mouse
    Then System dispalyes title "Practice Page"
