@EmployeeSearch
Feature: Verifying Jala Academy Employee Search Details

  @san
  Scenario Outline: Verifying Jala Academy Employee search by entering all fields
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click Employee icon
    And User should click search employee details "<employeename>","<mobilenumber>"
    Then User should verify employee details firstname success message,"hari"

    Examples: 
      | username                 | password   | employeename | mobilenumber |
      | training@jalaacademy.com | jobprogram | harikrishnan |   8940282556 |

  @san2
  Scenario Outline: Verifying Jala Academy Employee by selecting only mandatory fields
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click Employee icon
    And User should click search employee details "<employeename>"
    Then User should verify employee details firstname success message,"hari"

    Examples: 
      | username                 | password   | employeename |
      | training@jalaacademy.com | jobprogram | harikrishnan |

  @san3
  Scenario Outline: Verifying Jala Academy Employee by without entering any fields
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click Employee icon
    And User should click search invalid employee "<employeename>"
    Then User should verify employee error record details message,"No matching records found"

    Examples: 
      | username                 | password   | employeename      |
      | training@jalaacademy.com | jobprogram | harikrishnankrish |

  @san4
  Scenario Outline: Verifying Jala Academy Employee by deleting employee name
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click Employee icon
    And User should click search employee details and delete "<employeename>"
    Then User should verify employee details deleted success message,"Record deleted successfully"

    Examples: 
      | username                 | password   | employeename |
      | training@jalaacademy.com | jobprogram | harikrishnan |

  @san5
  Scenario Outline: Verifying Jala Academy Employee by updating employee name
    Given User is on the Jala Academy page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Welcome to JALA Academy"
    And User should click Employee icon
    And User should click search employee details and updating "<employeename>","<address>"
    Then User should verify employee details updated success message,"Employee details updated successfully"

    Examples: 
      | username                 | password   | employeename | address   |
      | training@jalaacademy.com | jobprogram | harikrishnan | thanjavur |
