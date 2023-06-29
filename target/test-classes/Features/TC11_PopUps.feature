@PopUps
Feature: Verifying Jala Academy  Popups

  Scenario Outline: Verifying Jala Academy Popups
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to popup tab and perform
    Then User should verify popup one success message,"https://www.google.com/"

    Examples: 
    
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |

  @Alert
  Scenario Outline: Verifying Jala Academy Popups
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to popup tab and perform
    Then User should verify Alert Popup success message,"This is an alert Box!"
    
     Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |
 @Confirm
  Scenario Outline: Verifying Jala Academy Popups
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to popup tab and perform
    Then User should verify Confirm Popup success message,"Confirm Message Box"
    
     Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |
      
      @Prompt
  Scenario Outline: Verifying Jala Academy Popups
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to popup tab and perform 
    Then User should verify Prompt Popup success message,"Enter Your Name:"
    
     Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |
      