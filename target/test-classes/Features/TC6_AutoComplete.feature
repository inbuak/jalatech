@AutoComplete
Feature: Verifying Jala Academy Autocomplete Details

  @single
  Scenario Outline: Verifying Jala Academy Single Values
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to autocomplete tab
    And User should click single values "<tags>"
    Then User should verify single values success message,"PHP"

    Examples: 
      | username                 | password   | tags |
      | training@jalaacademy.com | jobprogram | p    |

  @multiple
  Scenario Outline: Verifying Jala Academy Multiple Values
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to autocomplete tab
    And User should click multiple values "<tags>"
    Then User should verify multiple values success message,"JavaScript"

    Examples: 
      | username                 | password   | tags |
      | training@jalaacademy.com | jobprogram | ja   |
  