@Collapsible
Feature: Verifying Jala Academy  Collapsible contents

@single
  Scenario Outline: Verifying Jala Academy single collpase content
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to collapsible content tab
    And User should click single collapse
    Then User should verify single collapse success message,"There is a big difference between a mentor and a coach "

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
   @multi   
      Scenario Outline: Verifying Jala Academy multiple collpase content
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to collapsible content tab
    And User should click multiple collapse
    Then User should verify multiple collapse success message,"TEACH SOMEONE ELSE"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
      
