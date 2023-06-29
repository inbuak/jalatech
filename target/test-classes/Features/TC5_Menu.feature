@Menu

Feature: Verifying Jala Academy  Menu details
@singlemenu
  Scenario Outline: Verifying Jala Academy Single Menus
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to menu tab
    And User should click single menu
    Then User should verify single menu success message,"You Have Selected Testing Menu Option."

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |
@submenu
   Scenario Outline: Verifying Jala Academy Sub Menus
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to menu tab
    And User should click sub menus and click testing
    Then User should verify sub menu testing success message,"You Have Selected Selenium Menu Option."

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |
