@Slider
Feature: Verifying Jala Academy Slider

  Scenario Outline: Verifying Jala Academy  slider Tab
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to slider tab
    And User should move slider icon 
    Then User should verify slider toast success message,"99"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |  
