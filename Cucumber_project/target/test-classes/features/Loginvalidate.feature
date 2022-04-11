Feature: Login validation

  Scenario: Validating applicaion login with vaild details
    Given when user opens chrome browser
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And user click on login
    Then validating the loginpage

  Scenario Outline: Login Datadriven
    Given when user opens chrome browser
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters email as "<username>" and password as "<password>"
    And user click on login
    Then validating the loginpage

    Examples: 
      | username            | password |
      | admin@yourstore.com | admin    |
      | admin@yourstore.com | admin1   |
      | admin@yourstore.com | admin2   |
