@Tooltips
Feature: Verifying Jala Academy  Tooltips Details

  @After
  Scenario Outline: Verifying Jala Academy After Tooltip 
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to tooltips tab
    Then User should verify After tooltip success message,"Thank you for being here!"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 

       @Before
  Scenario Outline: Verifying Jala Academy Before Tooltip 
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to tooltips tab
    Then User should verify Before tooltip success message,"You have not clicked this BUTTON yet. Please Click me and check the tooltip"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
      