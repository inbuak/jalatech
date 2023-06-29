@CSS
Feature: Verifying Jala Academy  CSS Properties

  @retest3
  Scenario Outline: Verifying Jala Academy  Css Links
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to Css Links 
    Then User should verify Css Link2  success message,"https://www.linkedin.com/uas/login"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 

   @Labels
  Scenario Outline: Verifying Jala Academy  Css Labels
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to Css Labels 
    Then User should verify Css Label  success message,"Success"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
     
      @Buttons
  Scenario Outline: Verifying Jala Academy  Css Buttontab
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to Css Buttontab 
    Then User should verify Css Buttontab  success message,"Primary"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
     
       @Alerts
  Scenario Outline: Verifying Jala Academy  Css Alerts
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to Css Alerts 
    Then User should verify Css Alerts  success message,"Warning!"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
     