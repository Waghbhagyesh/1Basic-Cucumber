
Feature: Login feature
  

  
  Scenario: login page validation
    Given User is on login page
    Then user name field should be display
    


  Scenario: Login cred validation
    Given User is on login page
    When user enters valid credential
    And user click on login button
    Then user should navigate to home page
    
    #Examples: 
      #| username  | password | status  |
      #| admin     | manager  | success |
      #| admin1    | manager1 | Fail    |
