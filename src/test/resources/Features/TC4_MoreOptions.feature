@Multiple

Feature: Verifying Jala Academy Multiple Tabs
@tab
  Scenario Outline: Verifying Jala Academy  Plan to succeed Tabs
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to multiple tabs
    And User should click Plan to succeed 
    Then User should verify Plan to succeed message,"Congratulations"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |
@tab2
  Scenario Outline: Verifying Jala Academy Unlearning Tabs
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to multiple tabs
    And User should click Unlearning tab
    Then User should verify Unlearning success message,"Unlearning is the process"
    

    Examples: 
      | username                  | password    |
      | training@jalaacademy.com | jobprogram |
@tab3
  Scenario Outline: Verifying Jala Academy  Ways To Learning Tabs
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>" with enter key
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to multiple tabs
    And User should click Ways To Learning
    Then User should verify Ways To Learning success message,"unlearned"
    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram |
