@Login

Feature: Verifying Jala Academy  login details

  Scenario Outline: Verifying Jala Academy  login with valid data
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |

  Scenario Outline: Verifying Jala Academy login with invalid data
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify  after login with invalid credential error message "Invalid Email address or Password."

    Examples: 
      | username                  | password    |
      | training1@jalaacademy.com | jobprogram1 |

  Scenario Outline: Verifying Jala Academy login using Enter
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>" with enter key
    Then User should verify after login success message "Welcome to JALA Academy"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |
