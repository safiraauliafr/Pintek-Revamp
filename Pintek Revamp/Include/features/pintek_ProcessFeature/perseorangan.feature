Feature: Apply Perseorangan
  I want to use this template for my feature file

  Scenario Outline: Apply Perseorangan Scenario
    Given I navigate to the home page
    When I login using username as <username> and password as <password>
    And user click option Akun Bisnis
    And user choose Perseorangan for Company Entity
    Then I should see the dashboard page

    Examples: 
      | username                       | password  |
      | perseoranganrevamp@yopmail.com | P!ntek123 |
