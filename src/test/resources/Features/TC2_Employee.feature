@Employee
Feature: Verifying Jala Academy Employee Details
@reg1
  Scenario Outline: Verifying Jala Academy Employee by entering all fields
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click Employee icon
    And User should create employee details "<firstname>","<lastname>","<email>","<mobilenumber>","<dob>","<gender>","<address>","<country>","<city>" and "<skills>"
    Then User should verify employee details success message,"Employee details saved successfully"

    Examples: 
      | username                 | password   | firstname | lastname | email                | mobilenumber | dob        | gender | address  | country | city    | skills        |  |
      | training@jalaacademy.com | jobprogram | hari      | krishnan | krishhari1@gmail.com |   8940282556 | 09/03/1995 | male   | Chrompet | India   | Chennai | QA-Automation |  |
@reg2
  Scenario Outline: Verifying Jala Academy Employee by selecting only mandatory fields
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click Employee icon
    And User should create employee details "<firstname>","<lastname>","<email>" and "<mobilenumber>"
    Then User should verify employee details success message,"Employee details saved successfully"

    Examples: 
      | username                 | password   | firstname | lastname | email                | mobilenumber |
      | training@jalaacademy.com | jobprogram | hari      | krishnan | krishhari1@gmail.com |   8940282556 |
@reg3   
      Scenario Outline: Verifying Jala Academy Employee by without entering any fields
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click Employee icon
    And User should create employee details and click save
    Then User should verify employee details error message,"Please enter first name.","Please enter last name.","Please enter email.","Please enter mobile number."

    Examples: 
      | username                 | password   | 
      | training@jalaacademy.com | jobprogram | 