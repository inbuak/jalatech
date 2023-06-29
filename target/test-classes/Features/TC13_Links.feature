@CSS
Feature: Verifying Jala Academy Links

  @WorkingLinks
  Scenario Outline: Verifying Jala Academy Working Links
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to working links 
    Then User should verify Working Links success message,"https://www.workinglinks.co.uk/"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 


      @Image
  Scenario Outline: Verifying Jala Academy Image Links
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to Imagelinks 
    Then User should verify Image Links  success message,"http://www.growictech.com/"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
     
       @Status
  Scenario Outline: Verifying Jala Academy Status Codes
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to status codes 
    Then User should verify Status Codes success message,"https://www.restapitutorial.com/httpstatuscodes.html"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
     
        @Broken
  Scenario Outline: Verifying Jala Academy Broken Links
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click more tab and go to broken links
    Then User should verify Broken Links success message,"Success"

    Examples: 
      | username                 | password   |
      | training@jalaacademy.com | jobprogram | 
     